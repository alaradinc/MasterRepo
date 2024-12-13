#include <stdio.h>

int main(int argc, char const *argv[])
{
    /*         char text;
            int sum = 0;

            printf("He texted, want to reply? (y/n) ");
            scanf(" %c", &text);

            while(text == 'y' || text == 'Y'){

                printf("... text sent, send another? (y/n) ");
                scanf(" %c", &text);
                ++sum;
            }

            printf("Total texts sent: %d \n", sum); */

    /* int ghosted;
    int i = 1;
    printf("Input # of times you want to print 'Ghosted :<': ");
    scanf("%d", &ghosted);

    do
    {
        printf("You got ghosted.\n");
        ++i;
    } while (i <= ghosted);
     */

    // Array

    // int numGhosted;
    // printf("Enter the number of guys that ghosted you this year: ");
    // scanf("%d", &numGhosted);

    // // int array[numGhosted]; // needs to know how much space to reserve during the compile time
    // int *array = (int *)malloc(numGhosted * sizeof(int)); // dynamic memory allocation - malloc tells system to skip this part during compilation
    // /*
    //     Explanation: Compiler has no clue about how much space to reserve for the array in the compile time.
    //     So, we need to use dynamic memory allocation to reserve the space for the array during the runtime.

    //     Malloc is used to dynamically allocate a single large block of memory with the specified size. In the compile time, the compiler doesn't know
    //     how much memory to reserve for the array. So, we use malloc to reserve the space for the array during the runtime.
    // */

    // for (int i = 0; i < numGhosted; i++)
    // {
    //     printf("Age of guy#%d ", i);
    //     scanf("%d", &array[i]);
    // }

    // for (int i = 0; i < numGhosted; i++)
    // {
    //     printf("%d\n", array[i]);
    // }


    // free(array); // free the memory allocated by malloc
    printf("\n");

    return 0;
}
