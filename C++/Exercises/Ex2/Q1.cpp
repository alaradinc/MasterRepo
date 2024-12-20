// 1. Write a function that takes a string as input and returns the reverse of the string.

#include <iostream>
#include <string>
using namespace std;

string reverseString(string str) {
    string rvs = ""; 

    for (int i = str.length() - 1; i >= 0; i--)
    {
        rvs += str[i];
    }

    return rvs;
}

int main() {
    std::string str = "Hello World!";
    std::cout << reverseString(str) << std::endl;
    return 0;
}

