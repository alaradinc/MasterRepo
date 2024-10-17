package SortAlgorithms.QuickSort;

import java.util.Arrays;

public class QuickSort {
    public static void sort(int[] arr, int low, int high) { //low and high are indexes
        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            // Y X T Y X Y Y
            sort(arr, low, pivotIndex - 1);
            sort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }

        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i;
    }

    public static void main(String[] args) {
        int[] data = {9, -3, 5, 2, 6, 8, -6, 1, 3};
        int size = data.length;

        System.out.println("Unsorted Array: " + Arrays.toString(data));

        sort(data, 0, size - 1);
        System.out.println("Sorted Array: " + Arrays.toString(data));
    }
}
