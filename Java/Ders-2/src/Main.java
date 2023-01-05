import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Please input number: ");
//        int num = input.nextInt();
//
//        if (num == 0) {
//            System.out.println("Num is 0");
//        }
//        else if (num % 2 == 0){
//            System.out.println("The number is even");
//        }
//        else {
//            System.out.println("Num not even");
//        }

//        for(int i = 0; i < 5; i++){
//            System.out.println("Alara");
//        }

//        Scanner input = new Scanner(System.in);
//        int sum = 0;
//
////        while (true) {
////            int num = input.nextInt();
////            if(num < 0)
////                break;
////            sum += num;
////        }
//
//        int num = 0;
//
//        while(num >= 0){
//            sum += num;
//            num = input.nextInt();
//        }
//
//        System.out.println(sum);

//        Scanner input = new Scanner(System.in);
//        System.out.println("Input num");
//
//        int num = input.nextInt();
//        boolean isPrime = true;
//        int count = 0;
//
//        for (int i = 2; i <= Math.sqrt(num); i++) { // O(n)
//            count++;
//            if (num % i == 0) {
//                isPrime = false;
//                break;
//            }
//        }
//
//        if(isPrime)
//            System.out.println("Prime!");
//        else
//            System.out.println("Not prime!");
//        System.out.println("Counter : " + count); // max 35 tries

        int i = 0;
                            // if your end point is not known use while loop
        while (i <= 10){ // if your start and end is known use for loop
            System.out.println(i);
            i++;
        }

        /*
                                                ASSIGNMENT

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

        



    }
}
