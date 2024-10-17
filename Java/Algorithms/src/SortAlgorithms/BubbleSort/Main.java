package SortAlgorithms.BubbleSort;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        for(int i = 1; i <= 6; i++){
            int elementSize = (int)Math.pow(10,i);
            int[] array = generateRandomArray(elementSize); //must cast into int because generate random array takes int as parameter
//            System.out.print("Original Array: " + Arrays.toString(array));
//            System.out.println();
            long begin = System.currentTimeMillis();
            BubbleSort.sort(array); //because this is a static method in another class, we have to reach it through the BubbleSort class
//            System.out.print("Sorted Array: " + Arrays.toString(array));
            long end = System.currentTimeMillis();

            System.out.println("Total elapsed time to sort "+ elementSize + " elements using bubble sort: " + (end - begin) +"ms");

        }
        System.out.println();
    }
    //this is a method that tells us how to create the array, but if we want to create an array we will have to call this functionarr

    public static int[] generateRandomArray(int elementSize){ // we are generating an array with x elements which we will input into our BubbleSort method
        int[] array = new int[elementSize]; //we are creating an Array where we tell the system many elements it will have
        Random rd = new Random();

        for (int i = 0; i < array.length; i++){
            array[i] = rd.nextInt(elementSize); // rd is the object, nextInt is the method that brings the random integer number
        }
//        array[i] = 50 + rd.nextInt(elementSize) % 50;     ==> To generate a random number in a seed
        // we take the mode of minimum since that's what's "left over" to find the range we want

        return array; //we must return the array after we generate and populate it
    }
}
