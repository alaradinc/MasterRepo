#include "GroomingStore.h"


GroomingStore::GroomingStore(){
    this->pets = nullptr;
    this->petCount = 0;
}

void GroomingStore::addPet(Pet* newPet) {
    
    Pet** temp = new Pet*[this->petCount + 1]; //pets pointer cesitinden item tutan bit array olusturuyoruz (temp)
                                                // int* numbers = new int[5]; // 5 elemanli bir array olusturduk
                                                // int** numbers = new int*[5]; // 5 elemanli bir pointer array olusturduk
    //ornek: eskiden 10 elemanli bir array in vardi, simdi "+1" diyerek 11 elemanli yeni bir array olusturduk (temp)
    
    for (int i = 0; i < petCount; i++)
    { 
        temp[i] = pets[i]; // temp arrayine pets arrayindeki elemanlari kopyaliyoruz
        // son elemanimiz su an 'temp' array inde bos
        // bunlar pointer oldugu icin, kopyalama olmuyor, bu yeni pointerlar eski pointerlari point ediyor
        // bunlar ram de sabit duruyor, adreslerin pointerlari degisiyor (yani sadece her objeden 1 tane var RAM de)
    }

    temp[petCount] = newPet; // yeni peti temp arrayinin son elemani yap
    delete[] pets; //eski array i siliyoruz - 'kutuyu sildim' icindekileri yeni array e aldim
    pets = temp; //temp arrayini pets arrayine atiyoruz
    this->petCount++; //pet sayisini bir arttiriyoruz
            // 'this; used to refer to the current object' so basically this->petCount is the same as petCount because there is no other variable named petCount in the function
            // this->petCount refers to the inputted parameter (we use this to avoid confusion when working with the variables)
            // using petCount++ without 'this->' refers to the original petCount object defined in the class
}

void GroomingStore::removePet(int index) {

    if (index < 0 || index >= petCount)
    {
        cout << "Out of bounds." << endl;
        return; //we use return to stop the function from running
    }   

    delete pets[index];

    for (int i = index; i < petCount - 1; i++)
    {
        pets[i] = pets[i+1];
    }

    petCount--;
    Pet** temp = new Pet*[petCount];

    for (int i = 0; i < petCount; i++)
    {
        temp[i] = pets[i];
    }
    
    delete[] pets; //pets in pointerini sildik
    pets = temp;  //no need to delete temp, because we are accessing its address via pets now
}

void GroomingStore::displayAllPets() const{
    for (int i = 0; i < petCount; i++)
    {
        pets[i]->displayInfo(); //because pets is an object, we use '.' to call upon a fucntion
        // we use '->' here to call displayInfo because 'pets' array is a pointer 
    }
}

GroomingStore::~GroomingStore(){
    //deconstructor works to delete the object, but in the case that we have dynamically allocated objects (e.g. arrays) we must delete the objects individually as well
    
    for (int i = 0; i < petCount; i++)
    {
        delete pets[i];
    }
    
    delete[] pets;
}


// void main(){
//     int a = 5;
//     b(a); // a = 5
//     cout << a; // a = 5
//     // Explanation: Call by value, the value of a is copied to the function, so the function does not change the original value of a

//     c(&a);
//     cout << a; // a = 10
//     // Explanation: Call by reference, the address of a is passed to the function, so the function changes the original value of a
// }

// void b(int num){
//     num *= 2;
// }

// void c(int* num){
//     *num *= 2;
// }