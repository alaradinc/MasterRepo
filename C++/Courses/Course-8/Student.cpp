#include "Student.h"

Student::Student() : Person() { //syntax requires me to define [class we call from] :: [constructor we define] : [call upon Person default constructor]
    rollNo = 0; // for a default constructor you may or may not use 'this->' 
    major = "";
    //no need to redefine name = "No name"; and age = 0;
}

Student::Student(string name, int age, int rollNo, string major) : Person(name, age) {
    // 'git Person class'indaki constructor da name ve age i hallet, sonra gel ve bu constructor icinde geri kalan parametreleri yap (rollNo ve major)
    // this reduces redundancy
    this->rollNo = rollNo;
    this->major = major;
}

void Student::display(){
    Person::display(); // calling the display function of the parent class
    //syntax : to call upon a function in another class we use 'Class Name':: (in this case Person::)
    cout << "Roll No: " << rollNo << endl;
    cout << "Major: " << major << endl << endl;
}

void Student::setRollNo(int rollNo){
    this->rollNo = rollNo;
}

void Student::setMajor(string major){
    this->major = major;
}

int Student::getRollNo(){
    return rollNo;
}

string Student::getMajor(){
    return major;
}