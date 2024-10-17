package SortAlgorithms.InsertionSort;

import java.util.Date;
import java.util.Random;

public class Main {

    /*
    1. Create a function that creates arrays with random numbers
    2. create arrays with 10^x
    3. start time
    4. sort
    5. end time
    6. print arrays with sorting time
     */
    public static void main(String[] args) { //must create main method (separate then the Main class!)

        for (int i = 1; i <= 6; ++i){
            int[] arr = createArray((int)Math.pow(10,i)); //typecast into int, since .pow returns a double
            Date start = new Date(); // created new object of date type so we can use .getTime to get the current system time on that moment
            InsertionSort.sort(arr);
            Date end = new Date();
            System.out.println("Time passed to sort " + (int)Math.pow(10,i) + " elements: " + (end.getTime() - start.getTime()) + " ms");
        }
    }

    public static int[] createArray(int n){
        int[] arr = new int[n];
        Random random = new Random(); //created object

       for (int i = 0; i < arr.length; ++i){
           arr[i] = random.nextInt(n); // assigning random integers to the array
       }

       return arr;
    }

}
