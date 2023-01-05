import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {

//        Scanner inputNum = new Scanner(System.in); //System is a class; in is an input stream - we have created a variable (object) called inputNum of Scanner
//        //we created inputNum to be able to access the functions of Scanner class
//        System.out.println("Input num to convert to binary: ");
//        int number = inputNum.nextInt();


//        System.out.println(convert(13)); //print the 'convert' function with an input of 13's output
//        System.out.println(convert(15));
//        System.out.println(convert(1023));


    }

    static long convert(int num){ //'convert' is the name of the function that converts the decimal num to a binary num
        long bin = 0; //long type = 8 byte (we use this to store more numbers) 2 444 444 444 1111111111
        int rem, i = 1; //define rem variable, i = 1 means that we are looking at the ones place 111

        while(num != 0){ //while the number we are looking at is not 0, because we will divide the number until we reach 0
            rem = num %2; //find the remainder of our number after dividing it into 2
            num /= 2; //get the divisor of the original number after dividing it into 2 and reassign it to our variable so we can continue to divide
            bin += rem * i; //multiply by 1 because we are finding the ones/tens/hundreds... place (will change every turn)
            i *= 10; //multiply by tens place to increase our decimal place
        }
        return bin;
    }
}
