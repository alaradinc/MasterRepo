#include <stdio.h>
#include <stdlib.h>

int main()
{

    /*
        if (condition) {
            // code
        } else if(condition){
            // code
        } else {
            // code
        }
        else {
            // code
        }
    */

    // Let user enter a number then print out if it is positive, negative or zero

    // int x;
    // printf("Input a number: ");
    // scanf("%d", &x);

    // if(x > 0){
    //     printf("The number %d is positive\n", x); //place the format where you want the number to go, the input must always be last
    // } else if(x == 0){
    //     printf("The number %d is zero\n", x);
    // }
    // else {
    //     printf("The number is %d negtive.\n", x);
    // }

    /*

            switch (expression) {
                case constant1:
                    // code
                    break;
                case constant2:
                    // code
                    break;
                default:
                    // code
            }
    */

    // Let user enter a number between 1 and 7 and print out the day of the week
    // If the number is not between 1 and 7, print out "Invalid day"

    // int day;

    // printf("Input the day number: ");
    // scanf("%d", &day);

    // switch(day){
    //     case 1:
    //         printf("Monday, Funday");
    //         break;
    //     case 2:
    //         printf("$2 Taco Tuesdays");
    //         break;
    //     case 3:
    //         printf("Wednesday Humpday");
    //         break;
    //     case 4:
    //         printf("Thursday Almost Yay");
    //         break;
    //     case 5:
    //         printf("TGIF"); // Thank God It's Friday
    //         break;
    //     case 6:
    //         printf("Saturday Drinks Day");
    //         break;
    //     case 7:
    //         printf("Sunday Sleep Day");
    //         break;
    //     default:
    //         printf("Unknown");
    //         break;
    // }

    /*
        // 1. For loop

        for (initialization; condition; increment/decrement) {
            // code
        }

        for (int i = 0; i < 10; i++) {
            printf("%d\n", i);
        }
    */

    // Let user enter a number then print out the multiplication table of that number

    /*
        Enter a number: 5
        5 x 1 = 5
        5 x 2 = 10
        5 x 3 = 15
        ...
        5 x 10 = 50

    */

    // int mult;
    // printf("Input a number to multiply: ");
    // scanf("%d", &mult);

    // for (int i = 0; i <= 10; i++)
    // {
    //     printf("%d x %d = %d\n", mult, i, mult * i);
    // }

    // Let user enter a number then print out the sum of all numbers that can be divisible by 3 but not 5, from 1 to that number

    // int num;
    // printf("Input a number: ");
    // scanf("%d", &num);
    // int sum = 0;

    // for (int i = 1; i < num; i++)
    // {
    //     if (i % 3 == 0 & i % 5 != 0)
    //     {
    //         sum += i;
    //     }
    // }

    // printf("Sum: %d", sum);

    // Print multiplication table of 1 to 10

    /*
            1 x 1 = 1
            1 x 2 = 2
            ...
            5 x 1 = 5
            ...
            9 x 10 = 90
            10 x 1 = 10
            ...
    */

    // for (int i = 1; i <= 10; i++)
    // {
    //     for (int mult = 1; mult <= 10; mult++)
    //     {
    //         printf("%d x %d = %d\n", i, mult, i * mult);
    //     }
    //     printf("\n");        
    // }

    int ghosted;
    int i = 1;
    printf("Input the number of times you want to print 'Ghosted Message': ");
    scanf("%d", &ghosted);

    do
    {
        printf("Gurl, you got ghosted again. Sigh... :< \n");
        i++;
    } while (i <= ghosted);

    printf("\n");
    return 0;
}