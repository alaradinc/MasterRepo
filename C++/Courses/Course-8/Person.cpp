#include "Person.h"

Person::Person() {
    name = "No name";
    age = 0;
}

Person::Person(string name, int age) { //The sytanx means: 'From the Person class, we will now define the constructo we identified within the class file 'header'
    this->name = name; //we use pointers because we want to make permenant change (vs using a '.' would make temporary change that would get deleted after runtime)
    this->age = age;
}

string Person::getName() { // sytax: [type of function] [where the function comes from aka class] :: [name of function we defined in class file]
    return name;
}

int Person::getAge() {
    return age;
}

void Person::setName(string name) {
    this->name = name;
}

void Person::setAge(int age) {
    this->age = age;
}

void Person::display() {
    cout << "Name: " << name << endl;
    cout << "Age: " << age << endl;
}