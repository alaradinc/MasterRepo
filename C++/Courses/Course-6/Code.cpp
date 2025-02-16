#include <iostream>
using namespace std;

typedef struct {
    int age;
    char name[50];
} Person;

int main() {
    
    // // Static memory allocation
    // int arr[] = {1, 2, 3, 4, 5}; // all variables names of arrays are pointer
    // cout << arr[0] << endl;

    // // Dynamic memory allocation
    // int *ptr = new int[5];
    
    // ptr[0] = 1; // *(ptr + 0) = 1
    // *(ptr + 1) = 2; // ptr[1] = 2 ; ptr is an address and with + 1 we are shifting the address by 4 byte (in this case the ptr type is 4 bytes, because it is an integer pointer)
    
    // cout << ptr[0] << endl;
    // cout << *(ptr + 1) << endl;

    // // Freeing the memory
    // delete[] ptr; // we do this for dynamic arrays (not required for static arrays)

    // // ---------------------------------------------------------

    // // Static memory allocation for single variable
    // int a = 10;
    // cout << a << endl;

    // // Dynamic memory allocation for single variable
    // int *p = new int;
    // *p = 10;
    // cout << *p << endl; // *p is the value of the address stored in p

    // // Freeing the memory - if you do not free, memory leak occurs (e.g. you may close a program but it will still continue to consume RAM)
    // delete p;

    // // ---------------------------------------------------------

    // // Static memory allocation for structure
    // Person p1;
    // p1.age = 20; // p1 is an object of structure, not an address so we use dot operator
    // cout << p1.age << endl;

    // // Dynamic memory allocation for structure
    // Person *p2 = new Person;
    // p2->age = 20; // because p2 is an address, we use '->' , if it was an object we would have used '.'
    // cout << p2->age << endl;

    // // Freeing the memory
    // delete p2;

    // // -------------------------------------------------------------

    // Person* persons[3]; // Static memory allocation for array of pointers
    //         // bu array, 'Person address - person tipinden pointerlar' i tutuyor
    //         // Person persons[3] -> boyle olsa bu array, 'person' objectleri tutardi
    // for (int i = 0; i < 3; i++) {
    //     persons[i] = new Person; // Person is an object, we point this Person object with the person pointer in the array 'person[i]'
    //     persons[i]->age = 20; // 'i' ninci elemani bir adres
    // }

    // for (int i = 0; i < 3; i++) {
    //     delete persons[i];
    // }

    // -----------------------------------------------------------------------------------------------------------------------

    // Let user define a statically allocated array of 3 Person objects, then fill the array with user input. 
    // Finally, print the array.

    // Person arr_persons[3];

    // for(int i = 0; i < 3; i++){
        
    //     cout << "Enter age of Person #" << i << ":";
    //     cin >> arr_persons[i].age;

    //     cout << "Enter name of Person #" << i << ":";
    //     cin >> arr_persons[i].name;
    // }

    // for (int i = 0; i < 3; i++)
    // {
    //     cout << "Person " << i << " age: " << arr_persons[i].age;
    //     cout << "Person " << i << " name: " << arr_persons[i].name;
    // }
    

    // -----------------------------------------------------------------------------------------------------------------------
    // Let user define a statically allocated array of 3 Person pointers, then fill the array with user input. 
    // Finally, print the array.

    Person* arr_PersonPointers[3]; // this array will hold the pointers that point to Person objects

    // [NULL, ptr, NULL] -> holding 'NULL' pointers
    //   0     1     2

    for (int i = 0; i < 3; i++)
    {
        arr_PersonPointers[i] = new Person; // We allocate memory for each pointer in the array, because we form a new object for each pointer (in for loop [i])
                                            // we point to the 'space created via new Person' by the pointer in our array
    // the moment this runs, the space in the array will be replaced by the 'address' of the Person object -> example: [0x16ff12ac, NULL, NULL]
        cout << "Enter name of Person " << i << ": ";
        cin >> arr_PersonPointers[i]->name; //we use arrow because it is an address 'oraya git'
        cout << "Enter age of Person " << i << ": ";
        cin >> arr_PersonPointers[i]->age; 
    }
    

    /*
        arr_PersonPointers ==> [0x16ff12ac, 0x16ff12bc, 0x16ff12cc]
                                  ADDR_A    ADDR_B     ADDR_C

        Person* arr_PersonPointers[3];
        
        arr_PersonPointers + 0 ==> ADDR_A (0x12ACADAF)
        arr_PersonPointers + 1 ==> ADDR_B (0x12ACADB0)
        arr_PersonPointers + 2 ==> ADDR_C (0x12ACADB1)

        *(arr_PersonPointers + 0) ==> 0x16ff12ac
        *(arr_PersonPointers + 1) ==> 0x16ff12bc
        *(arr_PersonPointers + 2) ==> 0x16ff12cc
        
        *(*(arr_PersonPointers + 0)) ==> Person object at 0x16ff12ac
        *(*(arr_PersonPointers + 1)) ==> Person object at 0x16ff12bc
        *(*(arr_PersonPointers + 2)) ==> Person object at 0x16ff12cc

        Array bir address, adresin icinde adresler tutuyorum. bu tuttugum adreslerde Person objectlerimin adresleri
    */

    //  -----------------------------------------------------------------------------------------------------------------------------------------

    /*
        Ask user to enter the number of persons, then create an array of Person pointers with the size of the number entered by the user. 
        Then, fill the array with user input. Finally, print the array.    
    */


    int num_peop;
    cout << "Enter the number of people: ";
    cin >> num_peop;

    Person** person_pointers = new Person*[num_peop]; // we create an array of Person pointers with the size of the number entered by the user
    //Person pointer cesitinden pointer array i olusturuyoruz
    // Arrayler bir pointer oldugu icin, arrayin elemanlari da pointer olabilir. Bu durumda arrayin elemanlari, pointerlarin adreslerini tutarlar

    // Person *person = new Person; // we create a pointer to a Person object
    
    // Person* *person_pointers = new Person*[num_peop]; // we create an array of Person pointers with the size of the number entered by the user 
    // *person_pointers -> is the array
    // Person* is the type of element we are holding in the array
    // Person*[num_peop] is the type of array
    // this is a 'static alllocation version of what is above -> array of Person pointers -> "Person* persons[num_peop];" 
    // array'in elemanlari da bir adres


    for (int i = 0; i < 3; i++)
    {
        *(person_pointers + i) = new Person;  // must create Person object in the pointer to 'allocate memory'

        cout << "Enter Person " << i << " name:";
        cin >> *(*(person_pointers + i))->name; // we use arrow because it is an address 'oraya git'
    }

    for (int i = 0; i < 3; i++)
    {
        cout << "Person " << i << " name: " << *(*(person_pointers + i))->name;
    }
    
    
    return 0;
}

