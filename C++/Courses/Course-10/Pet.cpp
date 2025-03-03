#include "Pet.h"

Pet::Pet(string name, string breed, int age){
    this->name = name;
    this->breed = breed;
    this->age = age;
}

void Pet::displayInfo() const{
    cout << "Name: " << name << endl;
    cout << "Breed: " << breed << endl;
    cout << "Age: " << age << endl;

}

Pet::~Pet(){}