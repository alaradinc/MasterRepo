#include <stdio.h>

void swap(int a, int b);
void p_swap(int *a, int *b);
int main()
{
    // int num = 5;
    // printf("The value of num is %d\n", num);
    // printf("The address of num is %p\n", &num);

    // int* ptr = &num;
    // printf("The value of ptr is %p\n", ptr);
    // printf("The value of *ptr is %d\n", *ptr);

    // int* pc, c;
    // c = 5;
    // pc = &c;
    // printf("%d", *pc); // 5

    // int* pc, c;
    // c = 5;
    // pc = &c;
    // c = 1;
    // printf("%d", c);
    // printf("%d", *pc);

    // int* pc, c;
    // c = 5;
    // pc = &c;
    // *pc = 1;
    // printf("%d", *pc);
    // printf("%d", c);

    // int* pc, c, d;
    // c = 5;
    // d = -15;

    // pc = &c;
    // printf("%d", *pc);

    // pc = &d;
    // printf("%d", *pc);

    // int *pc, c;

    // c = 22;
    // printf("%p\n", &c); //adress
    // printf("%d\n\n", c); //c value 22

    // pc = &c;
    // printf("%p\n", pc); //adress
    // printf("%d\n\n", *pc); // c vlue 22

    // c = 11;
    // printf("%p\n", pc); //adress
    // printf("%d\n\n", *pc); // 11 c value

    // *pc = 2;
    // printf("%p\n", &c); // adress
    // printf("%d\n\n", c); // *pc val 2

    /*
            int* pc, c;

            pc = c; // Error: Cannot assign an integer to a pointer
            *pc = &c; // Error: Cannot assign an address to an integer
            pc = &c; // Correct
            *pc = c; // Correct
   */

    // Define an array of integers to store 5 elements. Let user input the elements of the array. Print the elements of the array.
    // int arr[5];

    // for (int i = 0; i < 5; i++)
    // {
    //     printf("Input values into array: ");
    //     scanf("%d", (arr + i));
    // }

    // for (int i = 0; i < 5; i++)
    // {
    //     printf("Value of array[%d]: %d\n", i, *(arr + i));
    //     printf("Address of array[%d]: %p\n\n", i, (arr + i));
    // }

    // Define an array of integers to store 5 elements. Let user
    // input the elements of the array. Then find the max and min element of the array.

    // int arr[5];

    // for (int i = 0; i < 5; i++)
    // {
    //     printf("Input array element: ");
    //     scanf("%d", arr + i);
    // }

    // int max = *arr, min = *arr;
    // for (int i = 0; i < 5; i++)
    // {
    //     if (*(arr + i) > max){
    //         max = *(arr + i);
    //     }
        
    //     if (*(arr + i) < min){
    //         min = *(arr + i);
    //     }
    // }

    // printf("Min: %d\nMax: %d\n", min, max);

    int num1 = 5;
    int num2 = 10;

    printf("MAIN: a - %d, b - %d \n", num1, num2); //5 , 10
    swap(num1, num2);
    printf("MAIN: a - %d, b - %d \n", num1, num2); //5 , 10

    printf("P-MAIN: a - %d, b - %d \n", num1, num2); //5 , 10
    p_swap(&num1, &num2);
    printf("P-MAIN: a - %d, b - %d \n", num1, num2); //10 , 5

     


    printf("\n");
    return 0;
}

// Call by value
void swap(int a, int b){
    printf("FUNCTION: a - %d, b - %d \n", a, b); //5, 10
    int temp = a;
    a = b;
    b = temp;
    printf("FUNCTION: a - %d, b - %d \n", a, b); //10, 5
}

// Call by pointer

void p_swap(int *a, int *b){
    printf("P-FUNCTION: a - %d, b - %d \n", *a, *b); //5, 10
    int temp = *a;
    *a = *b;
    *b = temp;
    printf("P-FUNCTION: a - %d, b - %d \n", *a, *b); //10, 5
}
