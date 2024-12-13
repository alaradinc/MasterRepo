#include <stdio.h>

void sort_bubble(int arr[], int length); // neden core dumoed htasi veriyor?

int main(int argc, char const *argv[])
{
    int arr1[] = {1, 3, 50, 2, 4};

    sort_bubble(arr1, 5);
    printf("Sorted Array: ");

    for (int i = 0; i < 5; i++)
    {
        printf("%d ", arr1[i]);
    }

    return 0;
}

// Sort Bubble

void sort_bubble(int arr[], int length)
{
    for (int i = 0; i < length - 1; i++) // [1,2,3,4,5]
    {
        for (int j = 0; j < length - i - 1; j++)
        {
            if (arr[j] > arr[j + 1])
            {
                int a = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = a;
            }
        }
    }
}