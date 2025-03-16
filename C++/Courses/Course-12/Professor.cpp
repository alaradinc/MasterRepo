#include "Professor.h"

Professor::Professor(const string &name, int age) : Person(name, age) {}

Professor::~Professor()
{
    // vector<string> courses;
    courses.clear();
}

void Professor::displayInfo() const
{
    cout << "Professor ID: " << getID() << ", Name: " << getName() << ", Age: " << getAge() << "\nCourses: ";
    for (vector<string>::const_iterator it = courses.begin(); it != courses.end(); ++it)
    {
        cout << *it << " ";
    }
}

void Professor::addCourse(const string& course){
    courses.push_back(course);
}

void Professor::removeCourse(const string &course){
    for (auto it = courses.begin(); it != courses.end(); it++){
        if (*it == course){
            courses.erase(it);
            break;
        }
    }

    // Alternatively: courses.erase(remove(courses.begin(), courses.end(), course), courses.end());
}
bool Professor::teachesCourse(const string &course) const{
    // return true if the prof teaches a given course
    for (auto it = courses.begin(); it != courses.end(); it++){
        if(*it == course){
            return true;
        }
    }
} 


vector<string> Professor::getCourses() const {
    return courses;
}

