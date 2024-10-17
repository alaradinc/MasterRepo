package SortAlgorithms.QuickSort;

import SortAlgorithms.MergeSort.MergeSort;

import java.util.Date;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; ++i){
            int[] arr = createArray((int)Math.pow(10,i));
            Date start = new Date();
            QuickSort.sort(arr,0,arr.length-1);
            Date end = new Date();
            System.out.println("Time passed to sort " + (int)Math.pow(10,i) + " elements: " + (end.getTime() - start.getTime()) + " ms");
        }
    }

    public static int[] createArray(int n){
        int[] arr = new int[n];
        Random random = new Random();

        for (int i = 0; i < arr.length; ++i){
            arr[i] = random.nextInt(n);
        }

        return arr;
    }
}
