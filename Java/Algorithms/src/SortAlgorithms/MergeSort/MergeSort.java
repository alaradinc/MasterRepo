package SortAlgorithms.MergeSort;

import java.util.Arrays;

public class MergeSort {
    static void mergeSort(int[] arr, int l, int r){
        if(l < r){
            int m = (l+r)/2;

            mergeSort(arr, l,m); //separately sort the left side
            mergeSort(arr, m+1, r); // separately sort the right side

            merge(arr,l,m,r); //combine both left and right once complete sorting
        }
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        int n1 = mid - start + 1;
        int n2 = end - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for(int i = 0; i<n1; i++)
            leftArray[i] = arr[start+i];
        for(int i = 0; i<n2; i++)
            rightArray[i] = arr[mid+1+i];

        int i= 0, j= 0, k = start;

        while(i < n1 && j < n2){
            if(leftArray[i] < rightArray[j]){ //compare which arrays first value is smaller or larger
                arr[k] = leftArray[i];
                i++;
                k++;
            }
            else{
                arr[k] = rightArray[j];
                k++;
                j++;
            }
        }

        while(i < n1){
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while(j < n2){
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int arr[] = {6,6,45,12,6,8,1,8,5,8,74,5,4,5};
        mergeSort(arr,0,arr.length-1);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}









