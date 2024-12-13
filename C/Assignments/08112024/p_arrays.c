#include <stdio.h>

int main(int argc, char const *argv[])
{
    //array[3] = [0][1][2] adress define

    int arr[3];

    // fill in the array

    for (int i = 0; i < 3; i++)
    {
        arr[i] = i; //fill in array with value
        
        printf("Value of arr[%d]: %d\n", i, arr[i]); //prints the value of arr[i]
        printf("Address of arr[%d]: %p\n", i, &arr[i]); //prints the address of the array
        printf("%p\n", arr+i);
    }
        printf("%p\n", arr);
        

    //is arr a pointer? yes (and it shows the address of [0] first term)

    //why do we identify the sum as a pointer in this situation?
    //int sum = 0;
    //sum += *(x+i);



    return 0;
}
