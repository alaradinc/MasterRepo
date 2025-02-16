/*
    Implement a class called User that has the following attributes:
    - Name 
    - Age
    - gender (M/F)

    The class should have the following methods:
    - Constructor (Default, parameterized, copy)
    - Destructor
    - Setters and Getters
    - Display method that prints the user's information
*/
#include "User.h"

int main(int argc, char const *argv[])
{
    // 1. Staticly create a User object using default constructor
    User user1;
    cout << "Printing the user object that was created statically using default constructor" << endl;
    user1.display();

    // 2. Dynamically create a User object using default constructor
    User *user2 = new User();
    cout << "Printing the user object that was created dynamically using default constructor" << endl;
    user2->display(); //use the arrow as opposed to '.' because this is a dynamically created object
    //we create an object to be able to modify it's information (e.g. a student adding a few more classes to their schedule)

    // 3. Staticly create a User object using parameterized constructor
    User user3("John Doe", 25, 'M');
    cout << "Printing the user object that was created statically using parameterized constructor" << endl;
    user3.display();

    // 4. Dynamically create a User object using parameterized constructor
    User *user4 = new User("Jane Doe", 30, 'F');
    cout << "Printing the user object that was created dynamically using parameterized constructor" << endl;
    user4->display();

    // 5. Staticly create a User object using copy constructor
    User user5 = user3;
    cout << "Printing the user object that was created statically using copy constructor" << endl;
    user5.display();

    // 6. Dynamically create a User object using copy constructor
    User *user6 = new User(*user4);
    cout << "Printing the user object that was created dynamically using copy constructor" << endl;
    user6->display();

    return 0;
}

// void addCourse(User &user, string courseName, string courseCode, int courseCredits)
// {
//     Course *course = new Course(courseName, courseCode, courseCredits); 
//     // we create this dynamically so that when the program stops running the compiler doesn't delete this variable
//     // (Remmember that the compiler deletes all variables that are created in a block when the lifetime of that block ends)
//     // Course course = Course(courseName, courseCode, courseCredits); // If we create this course object statically, it will be deleted when the function ends
//     user.getCourses().push_back(course);
// }


