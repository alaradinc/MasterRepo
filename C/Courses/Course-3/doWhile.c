#include <stdio.h>
#include <stdlib.h>

int main(int argc, char const *argv[])
{
    int ghosted;
    int i = 1;
    printf("Input the number of times you want to print 'Ghosted Message': ");
    scanf("%d", &ghosted);

    do
    {
        printf("Gurl, you got ghosted again. Sigh... :< \n");
        i++;
    } while (i <= ghosted);
    
    return 0;
}
