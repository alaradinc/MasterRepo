#include <stdio.h>

int get_min(int arr[], int length);
int get_max(int arr[], int length);
void sort_bubble(int arr[], int length);
int is_palindrome(char string[]);
int binary_search(int arr[], int size, int search);

int main(int argc, char const *argv[])
{
    // Q1 Find Min / Max
    int arr1[] = {1, 2, 10, 13, 17};

    int min = get_min(arr1, 5);
    printf("Minimum value of array is: %d\n", min);

    int max = get_max(arr1, 5);
    printf("Maximum value of array is: %d\n", max);

    int arr2[] = {17, 2, 13, 16, 1};

    // Q2 Sort Bubble
    sort_bubble(arr2, 5);

    printf("The sorted array: ");
    for (int i = 0; i < 5; i++)
    {
        printf("%d \n", arr2[i]);
    }

    // Q3 Is Palindrome?
    char string1[] = "hello";
    printf("If palindrome, output will be 1. Output: %d \n", is_palindrome(string1));

    char string2[] = "abba";
    printf("If palindrome, output will be 1. Output: %d \n", is_palindrome(string2));

    // Q4 Multiply 2 Matrixes

    //

    // Q5 Binary Search

    int arr[] = {2, 4, 6, 8, 10};
    int size = 5;
    int search = 4;
    int output = binary_search(arr, size, search);

    printf("The number you are searching for is %d. If we find it the output will be: %d in index: %d  ", search, arr[output], output);

    // End
    printf("\n");

    return 0;
}

int get_min(int arr[], int length)
{ // Q1A
    int min = arr[0];
    for (int i = 1; i < length; i++) // why can't I use sizeof()?
    {
        if (arr[i] < min)
        {
            min = arr[i];
        }
    }
    return min;
}

int get_max(int arr[], int length)
{ // Q1B
    int max = arr[0];
    for (int i = 1; i < length; i++) // why can't I use sizeof()?
    {
        if (arr[i] > max)
        {
            max = arr[i];
        }
    }
    return max;
}

void sort_bubble(int arr[], int length)
{                                        // Q2
    for (int i = 0; i < length - 1; i++) // THIS PART CONFUSED ME
    {
        for (int j = 0; j < length - i - 1; j++)
        {
            if (arr[j] > arr[j + 1])
            {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}

int is_palindrome(char string[])
{

    int length = 0;

    while (string[length] != '\0')
    { // why do we have to put \0? - Null terminator
        length++;
    }
    printf("Length: %d \n", length); // ABBA

    for (int i = 0; i < length / 2; i++)
    { // Check for palindrome
        if (string[i] != string[length - i - 1])
        {
            return 0;
        }
    }
    return 1;
}

int binary_search(int arr[], int size, int search)
{
    int l = 0;
    int r = size - 1;

    while (l <= r)
    {
        int m = l + (r - l) / 2;

        if (arr[m] == search)
        {
            return m;
        }
        else if (arr[m] < search)
        {
            l = m + 1;
        }
        else
        {
            r = m - 1;
        }
    }

    return 0;
}
