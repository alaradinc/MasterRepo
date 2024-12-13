#include <stdio.h>
#include <string.h>
#include <ctype.h>

int main(int argc, char const *argv[])
{
    // char name[50];
    // printf("Input full name: ");
    // fgets(name, sizeof(name), stdin);
    // printf("Your name is: %s", name);

    /*
        Let user enter a string then print the string in reverse order
    */

    // char str[50];
    // printf("Enter full name: ");
    // fgets(str, sizeof(str), stdin); // "Alara\n\0"
    // printf("Their full name is: %s", str);

    // // "Alara" ==> ["A", "l", "a", "r", "a", "\n"] ==>  6
    // //               0    1    2    3    4    5
    // //strict babe

    // printf("Their full name in reverse is: ");
    // for (int i = strlen(str)-2; i >= 0; i--)
    // {
    //     printf("%c", str[i]);
    // }

    /*
        Let user enter a string then print the count of vowels and consonants in the string
    */

    // char arr[50];
    // int vowel = 0;
    // int consonant = 0;

    // printf("Enter a string: ");
    // fgets(arr, sizeof(arr), stdin);

    
    // for (int i = 0; i < strlen(arr); i++)
    // {
    //     arr[i] = tolower(arr[i]);
    // }
    

    // for (int i = 0; i < strlen(arr); i++)
    // {
    //     if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u')
    //     {
    //         ++vowel;
    //     }
    //     else if (arr[i] > 'a' && arr[i] < 'z')
    //     {
    //         ++consonant;
    //     }
    // }

    // printf("# of Vowels: %d", vowel);
    // printf("# of Consonants: %d", consonant);

    

    printf("\n");
    return 0;
}

