#ifndef CAT_H
#define CAT_H
#include "Pet.h"

#include <iostream>
using namespace std;

class Cat : public Pet { //remember to extend the class! (because you utilize Pet class attributes, you must include ': public Pet')

    private:
        bool needsNailTrim;
        string* favoriteToys; // dynamically allocated array storing favorite toys
        int toyCount;

    public:
        Cat(string name, string breed, int age, bool needsNailTrim, int toyCount, string* toyList);
        void displayInfo() const override; //only write 'override' in definition, not implementation
        ~Cat();
};

#endif // CAT_H