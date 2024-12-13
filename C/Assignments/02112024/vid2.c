#include <stdio.h>

int binary_search(int arr[], int length, int search);

int main(int argc, char const *argv[])
{
    int arr1[] = {1, 3, 6, 12, 15};
    int output = binary_search(arr1, 5, 6);

    printf("The number's index you were looking for if found is: %d and number is %d", output, arr1[output]);

    return 0;
}

int binary_search(int arr[], int length, int search)
{
    int l = 0;
    int r = length - 1;

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