#ifndef GROOMINGSTORE_H
#define GROOMINGSTORE_H
#include "Cat.h"
#include "Dog.h"

class GroomingStore {

    private: 
        Pet** pets; //dynamically allocated array of pet*(stores both Dog and Cat objects)
        int petCount;
        
    public:
        GroomingStore();
        void addPet(Pet* newPet);
        void removePet(int index);
        void displayAllPets()const;
        ~GroomingStore();


};

#endif // GROOMINGSTORE_H

