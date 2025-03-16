#ifndef PROFESSOR_H
#define PROFESSOR_H

#include "Person.h"
#include <iostream>
#include <vector>
using namespace std;

class Professor : public Person
{
    private:
        vector<string> courses; //define the new attributes (ones that are not in the original Person class)

    public:
        Professor(const string& name, int age);
        ~Professor();
        void displayInfo() const override;
        void addCourse(const string& course);
        void removeCourse(const string& course);
        bool teachesCourse(const string& course) const; //return true if the prof teaches a given course
        vector<string> getCourses() const;
};
#endif