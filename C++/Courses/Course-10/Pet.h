#ifndef PET_H
#define PET_H

#include <iostream>
using namespace std;

class Pet
{
    private:
        string name;
        string breed;
        int age;

    public:
        Pet(string name, string breed, int age); //Constructor to initialize pet
        virtual void displayInfo() const; //Display pet details (to be overridden in derived classes)
        //we do not write 'virtual' when defining the constructor, but instead in the definition only
        virtual ~Pet(); //Virtual destructor

};

#endif // PET_H