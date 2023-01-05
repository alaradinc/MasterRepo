import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // String[] array = new String[100];

        // int[] numArray = new int[15];

        // Scanner numInput = new Scanner(System.in); //system.in only specifies where the input will be coming from (in this case a manual input via the keyboard)
        // system.in is known as the default input stream
        // we define the Scanner and its instance System.in outside of the loop because we only need to specify where the data will be coming from once
        //Scanner tipinden (Scanner bir class) numInput objesini tanimliyorum - bu objenin gorevi klavyeden input almak. neden klavye? cunku system.in diye input stream i tanimladik

        /*

        int sum = 0;

        for (int i = 0; i < 15; i++) {
            System.out.print("Enter num " + i + ": ");
            numArray[i] = numInput.nextInt();
            sum += numArray[i];
        }

         */

        // System.out.println(Arrays.toString(numArray));
        // System.out.println((float) sum / numArray.length); //numArray.length - you are accessing the 'attribute' of the numArray, which is an instance of integer arraysum.
        //you must 'typecast' sum/numArray.length because otherwise it will give you an integer output (since our previous values were defined as int variables) which will nt be accurate

       /* DIFFERENT INTEGER TYPES

       Integer x; // x is an instance (aka object) of the Integer class, which allows you to call upon x's attributes and functions by x.xyz
       int x; // this is a primitive integer variable. it doesn't have attributes or functions and simply says that a variable is of integer type
       int[] x; //this is a variable of integer array type, this means you can use some attributes like '.length' - however x is NOT an object, it is a variable

        */

//        int[] numArray = new int[5];
//
//        Scanner numInput = new Scanner(System.in);
//
//        int sum = 0;
//
//        for (int i = 0; i < 5; i++) {
//            System.out.print("Enter num " + i + ": ");
//            numArray[i] = numInput.nextInt();
//            sum += numArray[i];
//        }
//
//        int min = numArray[0], max = numArray[0];
//
//        for (int i = 0; i < 5; i++) {
//            if( min > numArray[i]){
//                min = numArray[i];
//            }
//            if (max < numArray[i]) {
//                max = numArray[i];
//            }
//        }
//        System.out.println(min + " ; " + max);
    }
}

/* HOMEWORK
                                    1. BUBBLE SORT THE INPUTS OF AN ARRAY

/*
                                              2.  ASSIGNMENT

                  Write a java program that converts a decimal number to binary number.

                  7 => 1                    13 % 2 => 1
                  3 => 1                    6 % 2 => 0
                  1 => 1                    3 % 2 => 1
                                            1 % 1 => 1 // the last digit you find is the left most

                   Write a java program that converts a binary number to decimal number

                   111 => 7

                   1101 => 13        (1*2^0) + (0 * 2^1) + (1*2^2) + (1*2^3)

                   1111 => 15
         */

