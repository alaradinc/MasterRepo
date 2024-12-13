// Implement a method that takes an integer as input and return the factorial of that number.

#include <stdio.h>

int get_factorial(int num); // Function prototype

int main(){

    int pageNum;
    printf("Input your latest book's page number: ");
    scanf("%d", &pageNum);

    int factorial = get_factorial(pageNum);
    printf("The factorial of %d is %d", pageNum, factorial);
    
    printf("\n");
    return 0;
}

int get_factorial(int num){
    int product = 1;
    for (int i = 1; i <= num; i++) {
        product *= i;
    }
    return product;
}