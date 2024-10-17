package SearchAlgorithms.BinarySearch;

import java.util.Random;

public class Main {
    public static void main(String[] args) {


    }

    public static int binarySearch(int[] A, int x){

        int lowerBound = 0;
        int upperBound = A.length - 1; //index

        while (lowerBound <= upperBound){

            int midpoint = (upperBound + lowerBound)/2;

            if (A[midpoint] < x){
                lowerBound = midpoint + 1;
            }

            if (A[midpoint] > x){
                upperBound = midpoint - 1;
            }

            if (A[midpoint] == x){
                return midpoint;
            }
        }
        return -1;
    }


    public static int[] generateRandomArray(int n){

        int[] arr = new int[n];
        Random random = new Random(); // 'random' is reference of the object placed by the new keyword & created by the Random() constructor.
        // Random is a class, Random() is a default constructor of Random class

        for(int i = 0; i < arr.length; ++i){
            arr[i] = random.nextInt(-(int)(Math.pow(2,32)),(int)(Math.pow(2,32)-1));


        }

    }
    /*
                    ALGORITHM

          Procedure binary_search
                A <- sorted array
                n <- size of array
                x <- value to be searched

                Set lowerBound = 0
                Set upperBound = n

                while x not found
                    if upperBound < lowerBound
                        EXIT: x does not exist

                    set midPoint = (Upperbound + lowerbound) / 2

                    if A[midPoint] < x
                        set lowerBound = midPoint + 1

                    if A[midPoint] > x
                        set upperBound = midPoint - 1

                    if A[midPoint] = x
                        EXIT: X found at location midPoint
                end while
          END Procedure
    */
}
