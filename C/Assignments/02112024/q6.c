#include <stdio.h>

int fact_iter(int n) {
    int fact = 1;
    for (int i = 0; i < n; i++)
    {
        fact *= (n-i);
    }
    return fact;
}

int fact_rec(int n) {
    if(n == 1){
        return 1; // Base case
    }

    return n * fact_rec(n-1); // Recursive call

    /*
        CALL.1:
        5! = 5 * 24

        CALL.2:
        4! = 4 * 6

        CALL.3:
        3! = 3 * 2

        CALL.4:
        2! = 2 * 1

        CALL.5:
        1! = 1
    */
}


int main() {
    int n;
    printf("Enter a number: ");
    scanf("%d", &n);

    printf("Factorial of %d using iterative method: %d\n", n, fact_iter(n));
    printf("Factorial of %d using recursive method: %d\n", n, fact_rec(n));
    
    return 0;
}