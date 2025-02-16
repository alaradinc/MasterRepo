#include <iostream>
#include <string> // why do I need to include string?
void display_data(const Person&); // why is 'Person' a const type?
                                    // Is this true for all structures?
enum season { spring, summer, autumn, winter };

struct Person{ // what tyoe do I need to import?

    //when a structure is defined no memory is allocated!

    string first_name;
    string last_name; //giving an error 'import type'
    int age;
    float salary;

    void displayInfo() {
        cout << "First Name: " << first_name << endl;
        cout << "Last Name: " << last_name << endl;
        cout << "Age: " << age << endl;
        cout << "Salary: " << salary << endl;
    }

};

using namespace std;

int main() {
    // int num; // static variable - memory is allocated at compile time
    // int* numPtr = new int; // dynamic variable - memory is allocated at run time
    //
    // num = 5;
    // *numPtr = 10;
    //
    // // num will be automatically deallocated when it goes out of scope
    // delete numPtr; // deallocate memory when done

    // int nums[10]; // STATIC MEMORY ALLOCATION
    //
    // int num;
    // cout << "Enter a number: ";
    // cin >> num;
    //
    // int* numsPtr = new int[num]; // DYNAMIC MEMORY ALLOCATION
    // delete[] numsPtr; // deallocate memory when done



// NEW EXPRESSION - DYNAMIC MEMORY ALLOCATION

    // declare an int pointer - Why though?
    int* point_var;

    // dynamically allocate memory
    // 'new' expression returns the address of the memory allocation

    // SYNTAX for 'new' expression --> : data_type* pointer_variable = new data_type[value];

    point_var = new int; // ?Q? what if I put '*' before point_var variable?

    // assign value to allocated memory
    *point_var = 45;

    delete pointer_variable; // returns memory back to operating system

// STRUCTURES

     //Structure is a collection of variables of different data types and member functions under a single name

     //It is similar to a class as both hold a collection of data of different types

    Person Alara;
    Alara.age = 25;
    cout << "Input Alara's last name";
    cin >> Alara.last_name;

// STRUCTURE - MEMBER FUNCTIONS

    //member functions are similar to regular functions but are defined within the scope of the structure
    //they can access and manipulate the data members of the structure directly
    //to define a member function, declare it directly in the structure definition

    Alara.displayInfo(); // vs. --> why can't we do this? displayInfo(Alara);

// PASSING STRUCTURE TO FUNCTION

    //A structure variable can be passed to a function just like any other variable.

display_data(Alara); //function wrtten outside of struct

// RETURN STRUCTURE FROM FUNCTION
    //Return a structure variable from a function
    // *** I don't get the difference of this ' returning a structure', how is this different than just print function in struct?


//POINTERS TO STRUCTURE

    // Pointers can be created for built-in types (int, float, etc.) & User Defined types like 'structure'

    Person a;
    Person* ptr = &a; // ?Q? Can you help explain how we would use this pointer?

    cout << "Enter salaryt: ";
    cin >> (*ptr).salary; // you may also use the 'arrow operator'  ptr -> salary (is equivelant)


//ENUMERATION
    //a user-defined data type that consists of integral constants.
    //To define an enumeration, use 'enum'.

    //Define enum above:^^
    //enum season { spring, summer, autumn, winter };

    enum season
    {   spring = 0, // by default spring is '0'
        summer = 4,
        autumn = 8,
        winter = 12
    };

    //Can you explain how an enum is used in a boolean case?
    //Can you explain how enums are used with 'flags'

    return 0;

}

// do I define 'struct' outside of the main function?



void display_data(const Person& p) {
    cout << "First Name: " << p.first_name << endl;
    cout << "Last Name: " << p.last_name << endl;
    cout << "Age: " << p.age << endl;
    cout << "Salary: " << p.salary;
