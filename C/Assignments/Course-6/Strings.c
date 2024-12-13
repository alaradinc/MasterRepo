#include <stdio.h>

int main(int argc, char const *argv[])
{
    char c[6] = "abcde";
    //arrays and strings do not support assignment opertor once it is declred

/*
    char name[20];
    printf("Enter name: ");
    scanf("%19s", name);
    printf("Your name is: %s\n", name); // this is wrong because it would only print the letters until the 'space'
*/
    
    //how to read a line of text...
    char str[30];
    printf("What's your dog's first and last name: \n");
    fgets(str, sizeof(str), stdin); // reads string
    

    printf("Name: ");
    puts(str); // Display string


    //notice that we use 'name' instead of '&name' with scanf()
    //this is because name is a char array and we know that array names are pointers in c
    //thus the 'name' used in scn already points to th address of the first element in the string
    //this is why we don't need to use '&'

    //how to read a line of text...
    //you can use the fgets() function to red  line of string
    //use puts() to display the string

    //Question for Ayberk - can I reuse the same 'name' array and write over it?

/*

    char str[30];
    printf("What's your dog's first and last name: \n");
    fgets(str, sizeof(str), stdin); // reads string
    printf("Name: ");
    puts(str); //display string
    
*/



    return 0;
}
