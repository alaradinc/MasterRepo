// 4. Write a function that takes a string as input and returns if the string is a palindrome or not.

#include <iostream>
#include <string>
using namespace std;

/*
    Input: a man, a plan, a canal, panama
    Output: The string is a palindrome.

    Input: hello
    Output: The string is not a palindrome.

    Input: racecar
    Output: The string is a palindrome.

    Input: 12321
    Output: The string is a palindrome.
*/

bool isPalindrome(string str) {

    //remove spaces and commas / non characters
    //compare first index with last, if not equal, break

    // a man, a plan, a canal, panama
    //         i               j

    for (int i = 0, j = str.length()-1; i < str.length() / 2;) // do not update i == and j-- because we control the updte logic inside the for loop
    {
        if (isalpha(str[i]) && isalpha(str[j]))
        { //if they are equal, we will step out of this condition and increase i nd j
            if(str[i] != str[j])  {
                return false;
            }
            i++; //when both i and j are alphabetic and match, we will update their values (index)
            j--;
        }
        else if (isalpha(str[i]) && !isalpha(str[j]))
        {
            j--;
        }
        else if (!isalpha(str[i]) && isalpha(str[j]))
        {
            i++;
        }
        else
        {
            i++;
            j--;
        }
    }
    return true; // should not return true inside the for loop because it will return it with every iteration
}

int main() {
    string str;
    cout << "Enter a string: ";
    cin >> str;

    if (isPalindrome(str)) {
        cout << "The string is a palindrome." << endl;
    } else {
        cout << "The string is not a palindrome." << endl;
    }

    return 0;
}
