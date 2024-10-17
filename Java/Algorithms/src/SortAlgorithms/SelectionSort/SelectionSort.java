package SortAlgorithms.SelectionSort;

public class SelectionSort {

    // Y Z X X X X X X Y X X
    public static void sort(int[] array){
        for(int i = 0; i < array.length - 1; ++i){
            int minIndex = i; //this is changing every time the one next to it)
            for(int j = i+1; j < array.length; ++j){
                if (array[j] < array[minIndex]){
                    minIndex = j;
                }
            }
            int c = array[i];
            array[i] = array[minIndex];
            array[minIndex] = c;
        }
    }

    // WRITE MAIN FUNCTION AND TEST OUT THE TIME (SIMILAR TO BUBBLESORT)

    /*
        procedure selectionSort(array A, length n)
            for i from 0 to n-2 do
                minIndex = i
                for j from i+1 to n-1 do
                    if A[i] < A[minıdex] then
                        minIndex = j
                swap A[i] and A[minIdx]
            end for
        end procedure
     */
}
