#ifndef PERSON_H
#define PERSON_H
#include <iostream>
using namespace std;

class Person
{
    private:
        string name;
        int age;        
        
    public:
        Person();
        Person(string name, int age);
        void setName(string name);
        void setAge(int age);
        string getName();
        int getAge();
        void display();
};

#endif // PERSON_H