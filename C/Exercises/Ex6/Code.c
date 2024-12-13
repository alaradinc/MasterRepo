/*
        Implement a structure called Complex to represent complex numbers. The structure should have 
        two fields, real and imaginary, of type double. Implement the following functions:

        a) A function called readComplex that reads a complex number from the user.
        b) A function called printComplex that prints a complex number.
        c) A function called addComplex that adds two complex numbers.

        Write a program to test your functions.
*/

#include <stdio.h>
#include <stdlib.h>

typedef struct
{
    double real;
    double imaginary;
    
}Complex;

// (5j+9) + (3j+4) = 8j+13

void readComplex(Complex *complex){
    printf("Enter the real part of the complex number: ");
    scanf("%lf", &complex->real);
    printf("Enter the imaginary part of the complex number: ");
    scanf("%lf", &complex->imaginary);

}

double printComplex(Complex complex){
    if(complex.imaginary < 0){
        printf("The complex number is: %.2lf - %.2lfi\n", complex.real, (double)abs(complex.imaginary));
    }else{
        printf("The complex number is: %.2lf + %.2lfi\n", complex.real, complex.imaginary);
    }
}

Complex addComplex(Complex complex1, Complex complex2){ //need to return Complex form
    Complex sum;
    sum.real = complex1.real + complex2.real;
    sum.imaginary = complex1.imaginary + complex2.imaginary;
    return sum;
}


int main(){

    Complex complex1, complex2;

    readComplex(&complex1);
    readComplex(&complex2);

    printComplex(complex1);
    printComplex(complex2);

    Complex sum = addComplex(complex1, complex2);
    printComplex(sum);

    return 0;
    



}