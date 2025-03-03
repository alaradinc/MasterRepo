#include "Dog.h"

Dog::Dog(string name, string breed, int age, bool needsHaircut, int vaccineCount, string* vaccinationsList) : Pet (name, breed, age){
    this->needsHaircut = needsHaircut;
    this->vaccineCount = vaccineCount;
    this->vaccinationsList = new string[vaccineCount];

    for (int i = 0; i < vaccineCount; i++){
        this->vaccinationsList[i] = vaccinationsList[i];
    }
}

void Dog::displayInfo() const{
    Pet::displayInfo();
    cout << "Needs Haircut: " << needsHaircut << endl;
    cout << "Vaccine Count " << vaccineCount << endl;
    cout << "Vaccinations: ";

    for (int i = 0; i < vaccineCount; i++)
    {
        cout << vaccinationsList[i];
    }
    cout << endl;
    cout << "----------------------" << endl;

}

Dog::~Dog(){}