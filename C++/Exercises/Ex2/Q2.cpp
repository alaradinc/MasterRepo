    // 2. Write a function that takes a string as input and returns the number of vowels in the string.

#include <iostream>
#include <string>
using namespace std;

int countVowels(string str) {
    string vowels = "aeiou";
    int count = 0;

    for (int i = 0; i < str.length(); i++)
    {
        if (vowels.find(str[i]) != string::npos){
            count++;    
        }
    }
    
    return count;
}

int main() {
    string str;
    cout << "Enter a string: ";
    cin >> str;
    cout << "Number of vowels in the string: " << countVowels(str) << endl;
    return 0;
}
