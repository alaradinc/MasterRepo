// 3. Write a function that takes a string as input and returns the number of words in the string.

#include <iostream>
#include <string>
using namespace std;

int countWords(string str) {
    // Trim the string
    while (str[0] == ' ') { //deletes the spaces in [0] so that it 'moves up' the other spaces (if there re any), and makes them = [0]
                            // have to use ' ' instead of " " because we can't compare character (index) with string
        str.erase(0, 1);
    }
    while (str[str.length() - 1] == ' ')
    {
        str.erase(str.length()-1, 1); // str.length() - 1, 1 : the '1' at the end represents the amount of space you delete (1 index)
        // .erase always deletes to the right
        // example 'delete the 9th index'
    }

    int count = 0;

    for (int i = 0; i < str.length(); i++)
    {
        if (str[i] == ' '){
            count++;
        }

    }

    return count + 1;
}

int main() {
    string str;
    cout << "Enter a string: ";
    getline(cin, str);
    cout << "Number of words in the string: " << countWords(str) << endl;
    return 0;
}
