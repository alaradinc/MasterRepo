#include "Cat.h"

Cat::Cat(string name, string breed, int age, bool needsNailTrim, int toyCount, string* favoriteToys) : Pet(name, breed, age){
    this->needsNailTrim = needsNailTrim;
    this->toyCount = toyCount;
    this->favoriteToys = new string[toyCount];

    for (int i = 0; i < toyCount; i++)
    {
        this->favoriteToys[i] = favoriteToys[i];
    }
}

void Cat::displayInfo() const {
    Pet::displayInfo();
    cout << "Needs Nail Trim: " << needsNailTrim << endl;
    cout << "Toy Count: " << toyCount << endl;
    cout << "Toy List: ";
    for (int i = 0; i < toyCount; i++)
    {
        cout << favoriteToys[i];
        if (i != toyCount - 1) //if we are at the end of our array, we do not print ','
        {
            cout << ", ";
        }
    }  
    cout << endl;
    cout << "----------------------" << endl;
}

Cat::~Cat(){};

