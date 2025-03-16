#ifndef STUDENT_H
#define STUDENT_H
#include "Person.h"

#include <iostream>
#include <vector>
using namespace std;

class Student : public Person {

    private:
        vector<int> grades; 

    public: 
        //Constructor
        Student(const string& name, int age);
        //Destructor
        ~Student();
        //Override displayInfo()
        void displayInfo() const override;
        //Grade Mgmt
        void addGrade(int grade);
        void removeGrade(int index);
        double calculateGPA() const;
        //Getters
        vector<int> getGrades() const;


};
#endif