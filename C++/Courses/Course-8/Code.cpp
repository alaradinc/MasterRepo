#include <iostream>
#include "Student.h"

using namespace std;


/*
                INHERITANCE

    Syntax:
        class Derived : access-specifier Base {
            // class members
        };

        Example:
            class Student : public Person {
                // class members
            };
        

    1. Inheritance Types
        a. Single Inheritance
        b. Multiple Inheritance
        c. Multilevel Inheritance
        d. Hierarchical Inheritance
        e. Hybrid Inheritance

    2. Public, Protected, Private Inheritance
        A. Public Inheritance

            class Base {
                public:
                    int x;
                protected:
                    int y;
                private:
                    int z;
            };

            class Derived : public Base {
                // x is public
                // y is protected
                // z is not accessible
            };

        B. Protected Inheritance

            class Base {
                public:
                    int x;
                protected:
                    int y;
                private:
                    int z;
            };

            class Derived : protected Base {
                // x is protected
                // y is protected
                // z is not accessible
            };

        C. Private Inheritance
        
            class Base {
                public:
                    int x;
                protected:
                    int y;
                private:
                    int z;
            };

            class Derived : private Base {
                // x is private
                // y is private
                // z is not accessible
            };
*/

int main(){

    Student s1 = Student("Ahmed", 17, 100, "Isletme"); // Student() constructor'i cagirman lazim
    s1.display();

    Student s2 = Student("Merve", 29, 101, "Muzik");
    s2.display();

    Student s3 = Student(); //default

    Student *s4 = new Student(); //default dynamic
    //*s4 is the declared pointer
    // we use 'new' to allocate memory for the object
    // we assign the address of the memory we allocated the parameters to the 'pointer (*s4) we created

    Student *s5 = new Student("Zeynab", 12, 105, "Matematik"); // dynamic parametre

    //Student s1 = new Student();

    /*
        Different sytax, same result

        Person *p4 = new Person(); // Default Constructor
        p4->display(); //use an arrow instead of '.' because we used a pointer '*p4'
        
        // B. Using Parameterized Constructor
        Person *p5 = new Person("Ali", 20); // Parameterized Constructor
        p5->display();

        // C. Using Copy Constructor
        Person *p6 = new Person(*p5); // Copy Constructor (deep copy)
        p6->display();


    */
    
    s5->display();
    

    //HOW TO RUN ON MAC

    /*
        0. Open Terminal
        1. Go to the folder where the file is located
            cd <path> (right click to copy folder path)
        2. Compile the file
            g++ Code.cpp Student.cpp Person.cpp -o output
            or basically g++ *.cpp -o output (this is to run all)
        3. Run the file
            ./output
    */

    delete s5;
}