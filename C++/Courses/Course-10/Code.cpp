#include "GroomingStore.h"
#include <iostream>
using namespace std;

int main() { 
    GroomingStore store; 
 
    // Creating dogs with vaccinations 
    std::string vaccines1[] = {"Rabies", "Parvo"}; 
    Dog* dog1 = new Dog("Buddy", "Golden Retriever", 3, true, 2, vaccines1); 
 
    std::string vaccines2[] = {"Rabies"}; 
    Dog* dog2 = new Dog("Max", "Beagle", 2, false, 1, vaccines2); 
 
    // Creating cats with favorite toys 
    std::string toys1[] = {"Feather Wand", "Laser Pointer"}; 
    Cat* cat1 = new Cat("Whiskers", "Siamese", 4, true, 2, toys1); 
 
    std::string toys2[] = {"Ball", "Scratching Post"}; 
    Cat* cat2 = new Cat("Mittens", "Persian", 5, false, 2, toys2); 
 
    // Adding pets to the store 
    store.addPet(dog1); 
    store.addPet(dog2); 
    store.addPet(cat1); 
    store.addPet(cat2); 
 
    // Display all pets 
    store.displayAllPets(); 
 
    // Remove a pet 
    store.removePet(1); 
 
    // Display again 
    store.displayAllPets(); 
 
    return 0; 
}