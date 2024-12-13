#include <stdio.h>
#include <stdlib.h>

// malloc -> uninitialized (casttype*)malloc(size);
// calloc -> initialized to 0 (casttype*)calloc(n, size);
// realloc -> reallocates memory realloc(pointer variable, size );

int main(){

    int n, *ptr, n2;

    printf("Enter size: ");
    scanf("%d", &n); //make ampersand because we need to change the variable

    ptr = (int*)malloc(n* sizeof(int));

    for (int i = 0; i < n; i++)
    {
        printf("%pc\n", ptr + i);
    }

    printf("Enter values: ");
    for (int i = 0; i < n; i++)
    {
        scanf("%d", ptr + i );
    }

    for (int i = 0; i < n; i++)
    {
        printf("%d", *(ptr + i));
    }
    
    printf("Enter new value: ");
    scanf("%d", &n2);

    ptr = realloc(ptr, n2* sizeof(int));

    for (int i = 0; i < n2; i++)
    {
        printf("%pc\n", ptr + i);
    }

    printf("Enter values: ");
    for (int i = 0; i < n2; i++)
    {
        scanf("%d", ptr + i );
    }

    for (int i = 0; i < n2; i++)
    {
        printf("%d", *(ptr + i));
    }


    
    free(ptr);

}
