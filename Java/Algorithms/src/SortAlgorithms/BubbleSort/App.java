package SortAlgorithms.BubbleSort;

import java.util.Arrays;
import java.util.Random;

public class App {
    public static void main(String[] args) {

        int[] arr = generateArray(5); // must assign the created array to be able to use it
        System.out.println(Arrays.toString(arr)); //used to print an array
    }

    static int[] generateArray(int n){
        int[] array = new int[n];

        Random random = new Random(); //must first create random object of Random class

        for (int i = 0; i < array.length; ++i){
            array[i] = random.nextInt(0,10000); // finding random numbers and assigning them to each index of the array
        }
        return array;
    }
    // 1,10,100,1000,10000,100000
    // create arrays of 1000 to 100,000 ( x10 ) - print the amount of time it takes to generate these array
    // put these time frames into an excel document and create a graph

}
