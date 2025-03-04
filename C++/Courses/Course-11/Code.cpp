/*
        STL - Standard Template Library
        - Containers
        - Algorithms
        - Iterators

        Containers
        - Sequence Containers
            - Vector
            - List
            - Deque
            - Stack
            - Queue

        - Associative Containers
            - Set
            - Map
*/

#include <iostream>
#include <vector>

using namespace std;

int main (){
    // How to create a vector
    vector<int> v1;

    // How to create a vector dynamically
    vector<int> *v2 = new vector<int>();

    // How to add elements to a vector
    v1.push_back(10);
    v1.push_back(20);
    v1.push_back(30);
    v1.push_back(40);
    v1.push_back(50);

    // How to access elements of a vector
    cout << v1[0] << endl;
    cout << v1.at(0) << endl;

    // How to get the size of a vector
    cout << v1.size() << endl;

    // How to get the capacity of a vector
    cout << v1.capacity() << endl;

    // How to get the front element of a vector
    cout << v1.front() << endl;

    // How to get the back element of a vector
    cout << v1.back() << endl;

    // How to check if a vector is empty
    cout << v1.empty() << endl;

    // How to remove the last element of a vector
    v1.pop_back();

    // How to remove all elements of a vector
    v1.clear();

    // How to delete a vector
    delete v2;

    // How to traverse a vector
    // 1-) Using for loop

    for (int i = 0; i < v1.size(); i++){
        cout << v1[i] << " ";
    }
    cout << endl;

    // 2-) Using iterator
    for (vector<int>::iterator it = v1.begin(); it != v1.end(); it++){
        cout << *it << " "; // iterators objects are actually pointers, which is why we use '*' to obtain its content
    }

    // 3-) Using auto keyword
    for (auto it = v1.begin(); it != v1.end(); it++){
        cout << *it << " ";
    }

    // How to delete a specific element from a vector

    // 1-) Using erase method
    v1.erase(v1.begin() + 1); // This will delete the second element of the vector 
    
    for (auto it = v1.begin(); it != v1.end(); it++){
        if (*it == 30){
            v1.erase(it);
            break;
        }
    }

    for (int i = 0; i < v1.size(); i++){
        if (v1[i] == 40){
            v1.erase(v1.begin() + i);
            break;
        }
    }

    return 0;
}