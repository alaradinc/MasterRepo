#include <stdio.h>

void hello();

void main(){

    int a = 9,b = 4, c;
    
    c = a+b;
    printf("a+b = %d\n",c);
    c = a-b;
    printf("a-b = %d\n",c);
    c = a*b;
    printf("a*b = %d\n",c);
    c = a/b;
    printf("a/b = %d\n",c);    
    c = a%b;
    printf("Remainder when a divided bbbbbby b = %d \n",c);
}