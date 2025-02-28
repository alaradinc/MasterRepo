#include "Book.h"

Book::Book(string title, string author, int publicationYear){
    //because a 'constructor' has no rturn type, we do not define 'string' or 'void' etc. before the function
    //constructors must have the same name as the class (e.g. for Book, constructor name must be "Book()")
    this->title = title;
    this->author = author;
    this->publicationYear = publicationYear;
}

Book::~Book(){}
//we must define the deconstructor even if it doesn't return anything or have any parameters

void Book::display() const {
    cout << "Title: " << title;
    cout << "Author: " << author;
    cout << "Publication Year: " << publicationYear;
}