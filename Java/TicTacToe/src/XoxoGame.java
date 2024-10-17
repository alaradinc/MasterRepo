import java.util.Random;
import java.util.Scanner;

public class XoxoGame {
    private char[][] board; // we define that the board will be a matrix the board - single [] is an array double [][] is a matrix 'array of arrays'
    private char currentPlayer; // define the two players (will later initialize them with 'x' and 'o')
    private Boolean gameFinish; // tell the system to complete the game when gameFinish becomes true

    public XoxoGame(){ //we leave the () empty because we are only initializing which means we don't need any outside inputs -
        //here we are creating our board to play the game
        board = new char[3][3]; //create the array - MEMORY ALLOCATION !
        initializeBoard(); // we input this method to 'design' the matrix
        // - it's important we put it into the constructor so that it gets designed during the 'creation' part
        this.currentPlayer = new Random().nextInt(2) == 0 ? 'X':'O'; // ternary operator (condition ? caseTrue:caseFalse) - if the random generated number is 0' we X starts' otherwise O starts
        this.gameFinish = false;
    }

    public void start(){ // SOLID
        while (!gameFinish) {
            printBoard();                   // board[2][3] = 'X'
            int[] move = getPlayerMove(); // example: [1,2] take and place the inputs (x,y) into an array
            makeMove(move); // 'move' (the variable that stores the user inputted the coordinates) will be an input of the method makeMove
            // the makeMove method will input an X or O (depending on the user) into the array slot
            if(checkWin()){
                System.out.println("Player " + currentPlayer + " wins!");
                gameFinish = true; //assigning 'gamefinish' to be true completes the while loop
            } else if (checkDraw()) {
                System.out.println("The game is a draw!");
                gameFinish = true;
            }
            else{
                switchPlayer();
            }
        }
    }

    private boolean checkDraw() {
        for (char[] row : board) {
            for (char col : row) {
                if (col == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    private void switchPlayer() {
        if(currentPlayer == 'X'){
            currentPlayer = 'O'; //if the current player is x, we make the system reassign 'currentPlayer' to 'o'
        }
        else{
            currentPlayer = 'X'; //otherwise, the current player must be 'o' which is why we switch to 'x'
        }
    }

    // x x x
    // x x x
    // x x x

    // {{X,X,X},{X,X,X},{X,X,X}}

    private boolean checkWin() {
        // check rows for win               board is basically an array with three separate arrays
        for (char[] chars : board) { //horizontal checks (for the row that we are traversing) - board is a matrix aka 'array of arrays'
            if (chars[0] != ' ' && chars[0] == chars[1] && chars[1] == chars[2]) {
                return true; //we say that char[0] should not be equal to '' because otherwise the empty spaces might be equal to each other, which might be misleading
            }
        }
        // check columns for win
        for (int i = 0; i < board.length; i++){ //vertical checks
            if(board[0][i] != ' ' && board[0][i] == board[1][i] && board[1][i] == board[2][i]){
                return true;
            }
        }
        // check diagonals for win
        if(board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2]){
            return true; //starts from top row
        }
        if(board[2][0] != ' ' && board[2][0] == board[1][1] && board[1][1] == board[0][2]){ //taking board[2][0] as a basis (it s value will be compared to the others, which is why we have to confirm if it is empty or not
            return true; //starts from bottom row
        }
        return false;
    }

    private void makeMove(int[] move) {
        int row = move[0]; //assign x coordinate (move[0]) to row
        int col = move[1]; //assign y coordinate (move[1]) to col
        board[row][col] = currentPlayer; //this is x or o
    }

    private boolean isValidMove(int row, int col) {
        // valid row
        if (row < 0 || row >= board.length){
            return false;
        }
        // valid col
        if (col < 0 || col >= board[row].length){
            return false;
        }
        // spot is already occupied
        if (board[row][col] != ' '){
            return false;
        }
        return true;
    }

    private int[] getPlayerMove() {
        Scanner scanner = new Scanner(System.in); //created a scanner variable to obtain user input
        while (true){
            System.out.print("Player " + currentPlayer + ", enter your move (row, column): ");
            int row = scanner.nextInt(); //picks up numbers from the next 'space' / 5 4 7 8 (picks up each number individually)
            int col = scanner.nextInt();

            if(isValidMove(row,col)){
                return new int[] {row,col}; //of array type we assign value
            }
            else{ //if 'false' is returned - then we print 'invalid move'
                System.out.println("Invalid move. Please try again!");
            }
        }
    }

    private void printBoard() {
        StringBuilder result = new StringBuilder(); //define the result variable as a string
        // AYBERK|NALARA|NMURAT - Remember that these lines get printed with /n in between and are in fact in the same string
        /*
             | | |
            -+-+-
            X|X|X
            -+-+-
            X|O|O
         */

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++) {
                result.append(board[i][j]).append("  |"); // strings can  hold both char and string and int variables
            } //Remember 'result' is a string
            result = new StringBuilder(result.substring(0, result.length() - 1)); // basically substring just means the string within the string that we will be taking - removes the final dash from the end f the string - for aesthetic purposes
            result.append("\n---+---+---\n");
        }
        result = new StringBuilder(result.substring(0, result.length() - "\n---+---+---\n".length())); //substring is a method that allows you to take a string within a string
        System.out.println(result);

    }


    private void initializeBoard() {
        /*
                ' '|' '|' '
                ' '|' '|' '
                ' '|' '|' ' [row][column]
        */
        for(int i = 0; i < board.length; i++){ //traversing rows within the array- [row][column] - we are in the row
            for(int j = 0; j < board[i].length; j++) { //traversing columns within the row - [row][column] - we are in the column
                board[i][j] = ' '; // we add empty characters simply for aesthetic purposes
            }
        }
    }

}