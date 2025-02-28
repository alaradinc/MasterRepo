#include "EBook.h"

EBook::EBook(string title, string author, int year, int formatCount, string* formats) : Book(title, author, publicationYear) {
    //we do not define the variable type of the parameters in the base class constructor
    // Book (title, author, publicationYear) - is like 'calling a function' which is why we only input the variables
    this->formatCount = formatCount;
    this->formats = new string[formatCount]; //dynamic allocation - we are allocating space for the defined array
    //formats is an array that holds as many variables as assigned to 'formatCount'
    //we must copy the elements in the 'formats' array into this->formats (formats is an array and a pointer, all arrays are pointers)
    for (int i = 0; i < formatCount; i++)
    {
        this->formats[i] = formats[i];
        // *(this->formats + i) = *(formats + i); //this is the same as the above line
    }  
}

void EBook::display() const {

    Book::display(); //calling the display function from the base class
    //we cann the function here unlike a constructor because this is a function not a constructor we are building

    cout << "Formats: ";
    for (int i = 0; i < formatCount; i++)
    {
        cout << formats[i] << " ";
    }
}

EBook::~EBook(){
    delete[] formats; //deleting the dynamic array
    // 'delete formats' would only delete the first element of the array
    // delete[] formats; deletes the entire array
    // If the elements of the array are pointers, we must delete them first 
    // before deleting the array
    // unlike Java (which has a 'garbage collector' we must manually delete in C++)
}
