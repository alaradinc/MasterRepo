/*
    Define a structure named Student with the following members:
    - Name: a string of 50 characters
    - ID: an integer
    - GPA: a float

    Then, write a program that reads information of a student from the user and prints it.
*/

#include <stdio.h>
#include <string.h>

typedef struct
{
    char name[50];
    int id;
    int gpa;
} Student;

int main()
{
    Student s1;

    printf("Enter student name: ");
    fgets(s1.name, sizeof(s1.name), stdin);

    printf("Enter student id: ");
    scanf("%d", &s1.id);

    printf("Enter student gpa: ");
    scanf("%d", &s1.gpa);

    printf("Student name: %s", s1.name);
    printf("Student id: %d\n", s1.id);
    printf("Student gpa: %d\n\n", s1.gpa);

    return 0;
}
