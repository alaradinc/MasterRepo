#include "Person.h"

// Default Constructor
Person::Person() {
    this->name = "No Name";
    this->age = 0;
}

// Parameterized Constructor
Person::Person(string name, int age) {
    this->name = name;
    this->age = age;
}

// Copy Constructor
Person::Person(const Person &person) {
    this->name = person.name;
    this->age = person.age;
}

// Destructor

Person::~Person() {
    cout << "Destructor Called" << endl;
}

void Person::display() {
    // Person bir sinif, bu sinifin icindeki Display functionlari
    // bu bir ornek benzer syntax -> std::cout << "Hello, World!" << std::endl;
    // std namespaceinin altindaki cout functioni
    
    cout << "Name: " << this->name << endl;
    cout << "Age: " << this->age << endl << endl;
}