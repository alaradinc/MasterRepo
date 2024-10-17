import java.util.Objects;

public class MorseTree {
    private Node root; //created a private attribute

    MorseTree(){ // this is a constructor defining how to build a tree, for this reason we call upon the buildTree method
        root = new Node(""); //create the root of a tree first, the right and left of this node is null
        buildTree(); //calling upon the method below to insert all the nodes - we only write the method below separate than the constructor for syntax purposes
        // technically we could have manually written all the 'insert' commands in this constructor (without buildTree()) - but it looks cleaner to group it
    }

    private void buildTree(){
        insert(".","E");
        insert("-","T");
        insert("..","I");
        insert(".-","A");
        insert("-.","N");
        insert("--","M");
        insert("...","S");
        insert("..-","U");
        insert(".-.","R");
        insert(".--","W");
        insert("-..","D");
        insert("-.-","K");
        insert("--.","G");
        insert("---","O");
        insert("....","H");
        insert("...-","V");
        insert("..-.","F");
        insert(".-..","L");
        insert(".--.","P");
        insert(".---","J");
        insert("-...","B");
        insert("-..-","X");
        insert("-.-.","C");
        insert("-.--","Y");
        insert("--..","Z");
        insert("--.-","Q");
    }

    private void insert(String morseCode, String letter) { //we write this method to tell the program in which order to insert the given inputs (letters and morse code)
        Node currentNode = root; //we say root here so the program knows to start at the very top of the tree

        for(int i = 0; i<morseCode.length(); i++){ //tells the program to traverse the morseCode string
            char c = morseCode.charAt(i); // store the character at the given place

            if(c == '.'){
                if(currentNode.left == null){ //if the node is null' then insert new character/node
                    currentNode.left = new Node("");
                }
                currentNode = currentNode.left; //shifting to the left the current node as we traverse the tree
            }
            else if(c == '-'){
                if(currentNode.right == null){
                    currentNode.right = new Node("");
                }
                currentNode = currentNode.right;
            }
        }
        currentNode.letter = letter; // currentNode variable is of 'Node' class type, which is why it carries the same attributes. As a result we can call upon its 'letter' attribute
                // we are assigning a letter to the empty 'currentNode.letter' attribute
    }

    // Method to translate Morse code to English

    public String translateFromMorse(String morse){
        StringBuilder english = new StringBuilder(); //StringBuilder is a class

        String[] words = morse.split("   "); //created an array of String type called 'words' - we're telling the program where to split the morse code

        for(String word : words){ //for each loop
            String[] letters = word.split(" "); //now we're splitting the letters inside the word
            for(String letter : letters){ //finding which letter it is - now created a loop so we can traverse the 'dots and dashes' of the letter to find out which letter we are at                 Node currentNode = root;
                Node currentNode = root; //start the function from the very top (telling the program to begin the traversion from the top)
                for(int i = 0; i<letter.length(); i++){ //traverse the length of the individual letter '..-.'
                    char c = letter.charAt(i); //store the individual character each dot is until we reach the end and find our actual letter

                    if(c == '.'){
                        currentNode = currentNode.left;
                    }
                    else if(c == '-'){
                        currentNode = currentNode.right;
                    }
                }
                english.append(currentNode.letter); //stringBuilder that holds all outputs
            }
            english.append(" "); //tells the program to add a space after the end of the word
        }
        return english.toString().trim();

    }

    public String translateToMorse(String sentence) { // '..-- ..- ..    ..- ..
        //split words into array
        StringBuilder morse = new StringBuilder(); //create an object of String Builder class type tp store the findings
        String[] words = sentence.split(" "); //create an array of String type and storing the split morse in buckets
        //split a word into characters
        for (String word : words) { //for each loop

            //split each word bucket into mini character buckets
            char[] letters = word.toCharArray(); //splitting the dots and dashes inside the 'word'
            // String.valueOf(char)
            for (char letter: letters) {
                //how to start - our current is empty, we will be looking for it in the root, and we will be looking for the given letter
                morse.append(inOrderTraversal(root, String.valueOf(letter), ""));
                morse.append(" ");
            }
            morse.append(" ");
        }
        return morse.toString().trim();
    }
                // .- .-.. .- .-. .-  'ALARA' //





    //what to look for - we must define when to stop
    public String inOrderTraversal(Node node, String target, String current ){ // target = the letter (e.g. 'z')

        if (node == null)
            return null; //this returns to node to be null
        else if (Objects.equals(node.letter, target))
            return current;
        else { //how to iterate - recursion

            String xLeft = inOrderTraversal(node.left, target, current.concat("."));
            if (xLeft != null)
                return xLeft;
            String xRight = inOrderTraversal(node.right, target, current.concat("-"));
            if (xRight != null)
                return xRight;

            return null;

        }
    }
            // L P R
}
    /*
    1. Kelimeleri tutan array'i elde et
    2. Her kelimenin harflerini içeren array'i elde et.
    3. Her harfin morse codunu bul.
    4. Kodu stringbuildere ekle.
    5. Tüm kelimeler için devam et.
     */






















