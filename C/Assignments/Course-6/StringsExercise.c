#include <stdio.h>

int main(){

    char c[] = "alara likes dogs"; // '\0 - can we do spaces?

    char d[50] = "ab goes after cd";

    char e[] = {'a', 'r', 'c'};

    char cz[5] = {'a', 'c'}; 

    //can we overwrite an array?
    //a[] = 'abcd';
    //a[4] = 'ac';

    //what's the difference between assigning a set area and none


    //read the string - scanf leads to overflow
    //which is why you should use fgets()

    char a[20];
    printf("Enter your dog's name: ");
    // scanf will not pick up the string after a 'space'
    fgets(a, sizeof(a), stdin);
    printf("Your dog's name is: %s", a);
    //puts(a);
    //we can simply write 'a' because it decoposes to a pointer
    //a[0]

    printf("%c", *a); //why didn't this print?
    
    return 0;

}

