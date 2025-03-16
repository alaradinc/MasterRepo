#include "Student.h"

Student::Student(const string& name, int age) : Person(name, age){
}

Student::~Student(){
    grades.clear();
}

void Student::displayInfo() const {
    cout << "Student ID: " << getID() << ", Name: " << getName() << ", Age: " << getAge() << "\nGrades: ";
    for (vector<int>::const_iterator it = grades.begin(); it != grades.end(); ++it)
    {
        cout << *it << " ";
    }
}
  //Grade Mgmt
void Student::addGrade(int grade){
    grades.push_back(grade);

}
void Student::removeGrade(int index){
    if (index >= 0 && index < grades.size())
    {
        grades.erase(grades.begin() + index);
    }
    else
    {
        cout << "Invalid index\n";
    }
}


double Student::calculateGPA() const{
    double sum = 0;
    for (vector<int>::const_iterator it = grades.begin(); it != grades.end(); ++it)
    {
        sum += *it;
    }

    return sum/grades.size();
}

//Getters
vector<int> Student::getGrades() const {
    return grades;
}