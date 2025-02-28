#ifndef BOOK_H
#define BOOK_H
#include <iostream>
using namespace std;

class Book
{
 
    public:
        string title;
        string author;
        int publicationYear;

        Book(string title, string author, int year);
        virtual void display() const;
        //const is defined to improve system speed, we are letting C++ know that nothing can be modified in the display function
        //virtual means this function is polymorphic and will be used in subsidiary classes
        virtual ~Book(); 
        //deconstructor
};


#endif // BOOK_H