#ifndef LIBRARY_H
#define LIBRARY_H

#include "EBook.h"

class Library {

    //inheritence (defined class Library : public Book) is different than using it within
    //because Library class is not inheriting any properties from 

    public:
        Book** books; //dynamically allocated array of Book*
        //your have an 'array of book pointers' - first star means the data type you will hold in the array 'Book pointers' 
        //the second start means you will be creating an array
        //stores both Book and EBook objects
        int bookCount;
        Library(); //default constructor initializing an empty library
        void addBook(Book* newBook); //adds a book
        void removeBook(int index); //removes a book from, a given index (shifts elements)
        void displayAllBooks() const; //display book details
        ~Library(); // deconstructor to clean dynamically allocated memory
};

#endif // LIBRARY_H

