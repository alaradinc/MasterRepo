#ifndef PERSON_H
#define PERSON_H
#include <iostream>
using namespace std;

class Person
{
    public:
        // Attributes
        string name; // ==> Static memory allocation (RAM) -> Automatically deleted from RAM after use (No need to delete it manually)
        int age;

        /// string* name = new string; -> Dynamic memory allocation requires us to delete it (destructor) from RAM after use due to memory leak risk
        // we do not need to delete statically variables (e.g. string name;) as the system will auto delete them after the program ends
        
        // Constructor
        Person(); // Default Constructor
        Person(string name, int age); // Parameterized Constructor
        Person(const Person &person); // Copy Constructor (&p is a reference to the object that is being copied)
        ~Person(); // Destructor

        /*
            int* ptr ==> Pointer declaration
            *ptr ==> Dereferencing (Content of the pointer)

            &a ==> Address access
            int& a ==> Reference declaration
        */

        // Methods
        void display();
};


#endif // PERSON_H