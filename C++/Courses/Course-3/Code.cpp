#include <iostream>
using namespace std;

string reverse(string x);

int main() {
    // // How to define C-String (Character Array)
    // char name[100] = "John Doe";
    // cout << name << endl;

    // // How to define string in C++
    // string name2 = "John Doe";
    // cout << name2 << endl;
    
    //using cin you can input strins with spaces in them (no need for fgets like in c)
    // char str[100];
    // cout << "Enter your name: ";
    // cin >> str;
    // cout << "Your name is: " << str << endl;

    // char str[100];
    // cout << "Enter your name: ";
    // // cin.get(str, 100);
    // cin.getline(str, 100);
    // cout << "Your name is: " << str << endl;

    // String Object

    // string name;
    // cout << "Enter your name: ";
    // getline(cin, name);

    // cout << "Your name is: " << name << endl;

    // String Class Functions

    // string name = "John Doe";
    // cout << "Length: " << name.length() << endl;
    // cout << "Size: " << name.size() << endl;
    // cout << "Capacity: " << name.capacity() << endl;
    // cout << "Empty: " << name.empty() << endl;
    // cout << "First Character: " << name[0] << endl;
    // cout << "Last Character: " << name[name.length() - 1] << endl;
    // cout << "Substring: " << name.substr(5, 3) << endl;
    // cout << "Find: " << name.find("Doe") << endl;
    // cout << "Rfind: " << name.rfind("o") << endl;
    // cout << "Replace: " << name.replace(5, 3, "Smith") << endl;
    // cout << "Insert: " << name.insert(5, "Smith") << endl;
    // cout << "Erase: " << name.erase(5, 5) << endl;
    // cout << "Compare: " << name.compare("John Doe") << endl;
    // cout << "At: " << name.at(5) << endl;
    // cout << "C-String: " << name.c_str() << endl;
    // cout << "Append: " << name.append(" Smith") << endl;

    /*
        Coding Question: 
        1. Write a function that takes a string as input and returns the reverse of the string.

        2. Write a function that takes a string as input and returns the number of vowels in the string.

        3. Write a function that takes a string as input and returns the number of words in the string.

        4. Write a function that takes a string as input and returns if the string is a palindrome or not.  
    */

    string ans = reverse("Hello");
    cout << "Reverse of string: " << ans << endl;

    return 0;
}


string reverse(string x){ 
    string ans = "";

    for (int i = x.length() - 1; i >= 0; i--)
    {
        // could also use this if increasing i instead of decreasiing -> 'char c = x[x.length() - i];'
        ans += x[i];

    }

    return ans;
}

int vowels(string x){
    string vowels = "aeiou";
    int count = 0; 

    for(char c : x){ // 'for each' loop, for each character c in the string x (similar to x.length())
        // if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
        //     count++;
        // }
        
        // in java, we can use 'contains' method to check if a string contains a certain character
        // if("aeiou".contains(c)){ count++; }
        // similarly, in c++, we can use 'find' method to check if a string contains a certain character

        if (vowels.find(c) != string::npos){ 
            // find function returns the index of the character in the string, if it is not found, it returns string::npos
            // npos is a number (e.g. 5735757235742572UL) that is used to represent the end of the string (similar to -1)
            count++;  // iterator inside if increases count variable, find function tries to find each character of string x inside the string vowels, 
                      // if it finds it, it increases the count
        }
    }
    
    return count;
}