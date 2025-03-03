#ifndef DOG_H
#define DOG_H
#include "Pet.h"

#include <iostream>
using namespace std;

/*
    In public inheritance, the public and protected members of the base class become the public and protected members of the derived class, respectively.
    The private members of the base class are not accessible in the derived class.
    The derived class can access the public and protected members of the base class using the dot operator.
    The derived class can access the public and protected members of the base class using the arrow operator.

    In private inheritance, the public and protected members of the base class become the private members of the derived class.
    The private members of the base class are not accessible in the derived class.
    The derived class can access the public and protected members of the base class using the dot operator.
    The derived class can access the public and protected members of the base class using the arrow operator.

    In protected inheritance, the public and protected members of the base class become the protected members of the derived class.
    The private members of the base class are not accessible in the derived class.
    The derived class can access the public and protected members of the base class using the dot operator.
    The derived class can access the public and protected members of the base class using the arrow operator.
*/

class Dog : public Pet //have to write type you are inheriting the class as - this does not indicate the status of the original class
//this indicates that you inherit the 'public' and 'protected' definitions
{
    private: 
        bool needsHaircut; // indicates if dog needs haircut
        string* vaccinationsList; // dynamically allocated array storing vaccination
        int vaccineCount; // number of vaccinations

    public: 
        Dog(string name, string breed, int age, bool needsHaircut, int vaccineCount, string* vaccinationsList);
        void displayInfo() const override; //displays dog details
        ~Dog(); //deconstructor to deallocate memory


};
#endif // DOG_H
