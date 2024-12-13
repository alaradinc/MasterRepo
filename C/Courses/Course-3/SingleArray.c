#include <stdio.h>

int main(int argc, char const *argv[])
{
    int num;
    int sum = 0;
    printf("Enter the number of guys that looked normal but ghosted you: ");
    scanf("%d", &num);

    int dates[num];

    for(int i = 0; i< num; i++){
        printf("Enter guy #%d age: ", i+1);
        scanf("%d", &dates[i]);

    }

    printf("The ages of the guys that ghosted you: ");
    for (int i = 0; i < num; i++)
    {
        printf("%d ", dates[i]);
        sum += dates[i];
        
    }

    printf("\n");

    int avg = sum / num;
    
    printf("Average age of ghosts: %d \n", avg);

    return 0;
}
