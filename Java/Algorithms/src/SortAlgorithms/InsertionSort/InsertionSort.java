package SortAlgorithms.InsertionSort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertionSort {
    // 9 5 1 4 3
    static void sort(int[] arr){ //make this method static so you can access it outside of this class
        for (int i = 1; i < arr.length; i++){
            int key = arr[i]; //value at index 1
            int j = i-1; //index to the left of our 'key'

            while(j >= 0 && key < arr[j]){ //as long as j is within array boundries and the value of 'key' is less than the value of j
                //swap
                arr[j+1] = arr[j]; //we continue switching as long as the while condition is true
                j--;

            }
            arr[j+1] = key;
        } //because this is a void method, there is no return statement
    }

    public static void main(String[] args) {

        int[] arr1 = {9,5,1,4,3};
        sort(arr1); //no need to store this in a variable as this method is void and doesn't return anything
        System.out.println(Arrays.toString(arr1));
    }
}
