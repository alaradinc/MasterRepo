#include "Library.h"
#include <iostream>
using namespace std;


// we don't have to #include the other classes, because we already included them in the library header

int main(int argc, char const *argv[])
{
    //CREATE LIBRARY OBJECT
    Library library; //created a library object of Library class type

    //CREATE BOOK

    Book* b1 = new Book("The Alchemist", "Paulo Coelho", 1988);
    Book* b2 = new Book("1984", "George Orwell", 1949);
    //we form these books over a 'pointer' - it gives you more control over the variable (you allow the variable to be used elsewhere, outside of the lifecycle of this code - otherwise it gets deleted)
    //form objects over pointers to allow for permenant storage of the data

    //CREATE EBOOK
    string formats[] = {"PDF", "EPUB"}; //created an array that holds string variables
    //we created this variable in our Ebook class, but did not define its inputs there, so we define it here to use it
    //formats means the types of format the given book is available in (which we define for each book)
    EBook* e1 = new EBook("Clean Code", "Robert C. Martin", 2008, 2, formats);

    //ADD TO LIBRARY
    library.addBook(b1);
    library.addBook(b2);
    library.addBook(e1);

    //DISPLAY ALL BOOKS
    library.displayAllBooks();

    //REMOVE BOOK
    library.removeBook(1);

    //DISPLAY AGAIN
    library.displayAllBooks();


    return 0;
}
