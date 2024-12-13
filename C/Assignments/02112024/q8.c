#include <stdio.h>
#include <stdlib.h>

/*
    Sample: 

    Input:
    arr = 8,9,10,1,2,3,4,5,6,7
    3

    Output:
    8 9 10 1 2 3 4 5 6 7

    TEMP = [8,9,10,1,2,3,4,5,6,7] '\0'
    temp[(rotatecount + i) % size] = array[i] // 0 1 2 3 ... 9
*/                                     // 7 , 8 , 9 
                                       // 3 , 2 , 1
void rotate_array(int array[], int size, int rotate_count) {
    
    int *temp = (int *)malloc(size * sizeof(int)); // int temp[size]; 

    for (int i = 0; i < size; i++)
    {
        temp[(rotate_count + i) % size] = array[i];
    }

    for (int i = 0; i < size; i++)
    {
        array[i] = temp[i];
    }
}


int main() {
    int array[10] = {1,2,3,4,5,6,7,8,9,10};
    int size = 10;
    int rotate_count = 3;

    rotate_array(array, size, rotate_count);

    for (int i = 0; i < size; i++)
    {
        printf("%d ", array[i]);
    }

    return 0;
}