#ifndef EBOOK_H
#define EBOOK_H

#include "Book.h"

class EBook : public Book {
    public:
        string* formats; // here we are 'defining'
        //this is a string pointer (dynamic)
        int formatCount;
        EBook(string title, string author, int year, int formatCount, string* formats);
        void display() const override;
        //function we override MUST have the same name as the original function in the original class we override from
        ~EBook();
};

#endif
