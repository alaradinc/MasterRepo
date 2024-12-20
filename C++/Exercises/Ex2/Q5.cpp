// 5. Write a function that takes a string as input and removes all non-alphabetic characters from the string.

#include <iostream>
#include <string>

using namespace std;

string removeNonAlphabetic(string str) {
    string result = "";

    for (int i = 0; i < str.length(); i++)
    {
        if (isalpha(str[i]))
        {
            result += str[i];
        }
        
    }

    return result;
    
}

int main() {
    string str = "Hello, World!";
    cout << removeNonAlphabetic(str) << endl;
    return 0;
}