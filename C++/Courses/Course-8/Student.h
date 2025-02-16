#ifndef STUDENT_H
#define STUDENT_H
#include "Person.h"

class Student : public Person // this portion of the code is inheritence
{
    private:  //'encapsulation' are 'getters' and 'setters'
        int rollNo;
        string major;
    
    public:
        Student();
        Student(string name, int age, int rollNo, string major);
        void display();
        void setRollNo(int rollNo);
        void setMajor(string major);
        int getRollNo();
        string getMajor();    
};

#endif // STUDENT_H