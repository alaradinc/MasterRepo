#include "Library.h"

#include <iostream>
using namespace std;

Library::Library(){
    this->books = nullptr; //we are saying the 'books pointer' array has 'no pointers'
    this->bookCount = 0;
}

void Library::addBook(Book* newBook){
    // Create a new array with one more space
    Book** newBooks = new Book*[this->bookCount + 1]; //(e.g. 'new int arr' 'new Book pointer - new Book*')
    // Copy the old array to the new array
    for(int i = 0; i < this->bookCount; i++){
        newBooks[i] = this->books[i]; //'books' is the old array
    }
    // Add the new book to the new array
    newBooks[this->bookCount] = newBook; //the last index is given by 'bookCount' and placed into the newBooks array
    //newBooks[10] - 11 elements present in the array, but arrays satrt from 0, so technically using 'bookCount' is like saying the 11th element
    // Delete the old array
    delete[] this->books;
    // Update the books pointer to point to the new array
    this->books = newBooks;
    // Update the book count
    this->bookCount++;    
}

void Library::removeBook(int index){
    //check if i is valid
    if (index < 0 || index >= bookCount) 
    {
        cout << "Invalid index" << endl;
        return;
    }
    
    // 1-) Delete the book at the given index
    delete books[index];

    // 2-) Shift all the books after the given index to the left
    for (int i = index; i < bookCount - 1; i++)
    {
        books[index] = books[index+1];
    }

    // 3-) Decrease the book count
    
    --bookCount;

    // 4-) Create a new array with one less space if the book count is greater than 0
    
    Book** newbooks = nullptr;
    //newbooks is an array we create
    //books is the original array (defined in the header file)
    
    if (bookCount > 0)
    {
        // Because our initial 'books' array holds 'book pointer' types, the new array we form must be of the same type 'Books**'
        newbooks = new Book*[bookCount]; 
        //here we define the amount of elements that will be in the new array ('newbooks')
        for (int i = 0; i < bookCount; i++)
        {
            newbooks[i] = books[i];
        }
    }

    // 5-) Delete the old array

    delete[] books;
    //the same as delete [] this->books;
    
    // 6-) Update the books pointer to point to the new array
    books = newbooks;
    
}

void Library::displayAllBooks() const{ //display details of all books

    for (int i = 0; i < bookCount; i++)
    {
        books[i]->display();
        cout << endl;
    }
}

Library::~Library(){
    //dynamically allocate ettigim neler var? (e.g. Books)

    for (int i = 0; i < bookCount; i++)
    {
        delete books[i];
    }

    delete[] books;
    
}

// int nums[5]; // sizeof(nums) = 20 bytes
    // int* nums2 = new int[5]; // sizeof(nums2) = 8 bytes
    /*
        Why? Because the first one is a stack array and the second one is a heap array
        ** dynamically allocated arrays are called 'heap array'

        nums2 is a pointer, so it takes 8 bytes of memory
        nums is an array of 5 integers, so it takes 20 bytes of memory

        nums2 is a pointer that points to the first element of the array, 
        so it takes 8 bytes of memory, but the array itself takes 20 bytes of memory
    */

    /*
    0x16ff12ac  0 [n1]
                1 [n2]
                2 [n3]
                3 [n4]
                4 [n5]
                5 []
                6 []
                7 []
                8 [0x16ff12ac]
                9 []
            
            int* nums2 = new int[5]; // sizeof(nums2) = 8 bytes
            sizeof(nums2) = 8 bytes
    
    */