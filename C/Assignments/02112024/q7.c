#include <stdio.h>
#include <stdbool.h>

bool is_prime(int n) {
    if (n < 2) { // we handle negatives, zero, and one with this line of code
        return false;
    }

    for (int i = 2; i <= n/2; i++)
    {
        if(n % i == 0){
            return false;
        } // do not write 'else' so that the loop continues, otherwise it will immediately jump to else
    }
    return true;
}

int main() {
    int n;
    printf("Enter a number: ");
    scanf("%d", &n);

    if (is_prime(n)) {
        printf("%d is a prime number.\n", n);
    } else {
        printf("%d is not a prime number.\n", n);
    }    

    return 0;
}