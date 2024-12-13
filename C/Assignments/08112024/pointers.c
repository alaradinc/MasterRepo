#include <stdio.h>

int main(int argc, char const *argv[])
{
    int *p, c; // define *p as pointer, and c as int variable
    p = &c; // assign address to pointer 

    c = 3; //pointer at this point, 'points to c' so it is equal to c

    printf("%d\n", *p);

    printf("%d\n", c);

    *p = 17;

    printf("%d\n", *p);
    printf("%d\n", c);

    return 0;
}
