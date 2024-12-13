#include <stdio.h>

// Syntax of a function : return_type function_name(arguments) { body of the function }


// 1. Function with return type and no arguments
int add1() { // function definition
    int a = 10, b = 20; // function body
    return a + b;
}


// 2. Function with return type and arguments
int add2(int a, int b) {
    return a + b;
}


// 3. Function with no return type and arguments
void add3(int a, int b) {
    printf("Sum is %d\n", a + b);
}


// 4. Function with no return type and no arguments
void add4() {
    int a = 10, b = 20;
    printf("Sum is %d\n", a + b);
}


int main() {
    // Function call
    int sum = add1(); // function call
    printf("Sum is %d\n", sum);

    sum = add2(10, 20);
    printf("Sum is %d\n", sum);

    add3(10, 20);

    add4();

    return 0;
}