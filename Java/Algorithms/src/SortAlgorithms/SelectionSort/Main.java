package SortAlgorithms.SelectionSort;

import java.sql.Array;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class Main {
    // Write a function that takes an integer as parameter and then returns an array of ints that holds random N number in it.
    // Write a mechanism to generate an array of integers that holds 10,100,1000,10000,100000,1000000 elements and measure the
        // sorting time of these arrays using selection sort algorithm provided.


    public static void main(String[] args) {
        for (int i = 1; i < 6; i++){
            //must create a variable of array type to hold the newly created array (remember that createArray is a method! simply instructions)
            int[] array = createArray((int)Math.pow(10,i)); //must convert answer to int type (typecasting)
            Date start = new Date(); //creating a variable of Date type
            SelectionSort.sort(array);
            Date end = new Date();

            System.out.println("Time passed during the sorting of " + array.length + " elements: " + (end.getTime() - start.getTime()) + "ms"); //calling on the 'time' attribute of the 'start' object you created
        }
    }

    public static int[] createArray(int num){ //because it will be returning an array, you must define the method as int[] (not just int)
        int[] array = new int[num];
        Random random = new Random();

        for (int i = 0; i < array.length; ++i){
            array[i] = random.nextInt(-num,num);
        }

        return array;
    }
}
