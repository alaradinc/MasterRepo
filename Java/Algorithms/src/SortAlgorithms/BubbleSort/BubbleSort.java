package SortAlgorithms.BubbleSort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {3,43,4,574,54,54,54,324,24,541,21,654,2};
        System.out.println("Before Sorting:\n"+Arrays.toString(arr));
        sort(arr);
        System.out.println("After Sorting:\n"+Arrays.toString(arr));
    }


    public static void sort(int[] array){
        boolean isSwapped = true;
        for (int i = 0; i < array.length -1; i++){ // number of elements
            if(!isSwapped)
                break;

            isSwapped = false;
            for(int j = 0; j < array.length -i -1; j++){ // the actual number you are comparing
                if(array[j] > array[j+1]){
                    isSwapped = true;
                    int z = array[j+1];
                    array[j+1] = array[j];
                    array[j] = z;
                }
            }
        }
    }

    public static void sort2(int[] array){
        for (int i = 0; i < array.length; i++){ // number of elements
            for(int j = 0; j < array.length-1; j++){ // the actual number you are comparing
                if(array[j] > array[j+1]){
                    int z = array[j+1];
                    array[j+1] = array[j];
                    array[j] = z;
                }
            }
        }
    }
}

