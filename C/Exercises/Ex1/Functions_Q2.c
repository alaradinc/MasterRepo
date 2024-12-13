// Implement a method that takes two integers as input and returns the GCD of the two numbers.
// Implement a method that takes two integers as input and returns the LCM of the two numbers.

#include <stdio.h>

int get_gcd(int x, int y);
int get_lcm(int x, int y);

int main(int argc, char const *argv[])
{
    int x, y;

    printf("Provide the ages of your 2 dogs: ");
    scanf("%d %d", &x, &y);

    printf("The GCD of %d and %d is: %d\n", x, y, get_gcd(x, y));
    printf("The LCM of %d and %d is: %d\n", x, y, get_lcm(x, y));
    return 0;
}

int get_gcd(int x, int y)
{
    int min = x < y ? x : y;

    for (int i = min; i > 0; i--)
    {
        if (x % i == 0 && y % i == 0)
        {
            return i;
        }
    }
    return 1;
}

int get_lcm(int x, int y)
{
    /*
        Ternary operator: If the condition is true, the first statement is executed, otherwise the second statement is executed.
    */
    int max = x > y ? x : y; // if... x > y... then this statement is equal to x, otherwise it is equal to y

    for (int i = max; i <= x * y; i++)
    {
        if (i % x == 0 && i % y == 0)
        {
            return i;
        }
    }
    return 1;
}