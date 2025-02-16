#include "User.h" // use quotation instead of '<>' because you are refering a custom defined library
//You do not need to write #include <iostream> or 'using namespace std;' in this file, because these autoatically come to this file when you import 'User.h' file
//implement these constructors here
// all definitions of constructors are within our 'header (.h) file'

//Default Constructor
User::User(){
    // we use -> because we are using a pointer to access the member variables
    // "this" is a pointer to the object that is calling the function
    this->name = "N/A";
    this->age = 0;
    this->gender = '-'; // ' ' single quotations for characters
}

//Parameter Constructor

User::User(const string name, const int age, const char gender){
    // the parameter must have the exact same inputs as what defined in the User.h file (which means we have to include 'const')
    this->name = name;
    this->age = age;
    this->gender = gender;
}

//Copy Constructor

User::User(const User& user){ // refering to something of user type - & is a reference to another object of user type
    
    //the 'user' in user.name refers to the user we input as a parameter, because it is specific we use '.' instead of '->'
    this->name = user.name;
    this->age = user.age;
    this->gender = user.gender;
}

//Deconstructor

User::~User(){
    cout << "User object is being deleted" << endl;
}

//Getters

string User::getName() const{
    return this->name;
}

int User::getAge() const{
    return this->age;
}

char User::getGender() const{
    return this->age;
}


//Setters

void User::setName(const string name){
    this->name = name;
}

void User::setAge(const int age){
    this->age = age;
}

void User::setGender(const char gender){
    this->gender = gender;
}

//Methods
void User::display() const{
    cout << "Name: " << this->name << endl;
    cout << "Age: " << this->age << endl;
    cout << "Gender: " << this->gender << endl;
}