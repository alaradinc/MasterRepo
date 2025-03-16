#ifndef PERSON_H
#define PERSON_H

#include <iostream>
using namespace std;

class Person {
    private:
        string name;
        int age;
        int id;
        static int idCounter; // auto increment id

    public:
        Person(const string& name, int age); //'string&' - means string reference which brings in the 'reference' to the original variable
        //we use & to denote a reference and save memory (by preventing the system from copying the variable - e.g. both active in main and the function)
        virtual ~Person(); //allows custom deconstruction within the subclasses (those who inherited this)
        virtual void displayInfo() const = 0; // will be overridden by derived classes
        string getName() const;
        int getAge() const;
        int getID() const;
};

#endif

/*
    int main(){
        int num = 5;
        foo(num);
    }

    foo (int& x){
        cout << x << endl;
    }
*/