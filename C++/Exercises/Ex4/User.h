#ifndef USER_H
#define USER_H

#include <iostream>
using namespace std;

class User
{
    private:
        string name;
        int age;
        char gender; //(M/F)
    
    public: // Constructors have to be defined as public because we cannot create objects in another class if they are private
        User(); //Default Constructor
        User(const string name, const int age, const char gender); // Parameter Constructor
        /*
            If we define the parameters as constant, we are telling the compiler that the parameters will not be modified, so the compiler will not leave pointers to the parameters, but will pass the values directly to the function.
            If we do not define the parameters as constant, the compiler will leave pointers to the parameters, so the function will have to follow the pointers to get the values of the parameters.
        */
        User(const User& user);
        ~User(); // Destrcutors are used for freeing memory that was allocated in the heap (applicable for 'dynamic' variables)
        // This is for example used when we need to delete a user that has dynamically allocated memory (e.g. a pointer to some course) 
        // and we want to delete the user and the course at the same time. If we do not clean courses that are dynamically allocated, we will have memory leaks when the user is deleted.

        // Getters
        string getName() const;
        int getAge() const;
        char getGender() const;

        //^ getters do not have any parameters in them as we only use these functions to call upon other information

        //Setters

        void setName(const string name);
        void setAge(const int age);
        void setGender(const char gender);

        //Methods
        void display() const;
};

#endif // USER_H

