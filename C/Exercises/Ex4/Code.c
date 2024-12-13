/*
    Define a structure named Student with the following members:
    - Name: character array of size 50
    - Roll: integer
    - Marks: float

    In main function, ask user to enter the number of students and then create an array of students of that size.
    Then implement the following functions:
    - readStudent: This function should take a studentpointer as input and read the values of name, roll and marks from the user.
    - printStudent: This function should take a studentpointer as input and print the values of name, roll and marks.
*/

#include <stdio.h>
#include <stdlib.h>

typedef struct
{
    char name[50];
    int roll;
    int marks;

}Student;

void fillStudent(Student *student){
    char temp[255]; //create temp array to use in fgets to clear the buffer

    printf("Enter student name: ");
    fgets(student->name, sizeof(student->name), stdin);
    
    printf("Enter roll number: ");
    scanf("%d", &student->roll);

    printf("Enter marks number: ");
    scanf("%d", &student->marks);

    printf("\n");
    fgets(temp, sizeof(temp), stdin); // to clear the buffer
    // fflush(stdin); // to clear the buffer
}

void displayStudent(Student student){
    printf("Name: %s", student.name);
    printf("Roll Number: %d\n", student.roll);
    printf("Marks: %d\n\n", student.marks);
}

int main(){
    char temp[255];
    int num;
    printf("Enter number of students: ");
    scanf("%d", &num);
    fgets(temp, sizeof(temp), stdin);

    Student *arr = (Student*)malloc(num * sizeof(Student)); //we determine array of type 'Student' - important as we will save 'student' info

    for (int i = 0; i < num; i++) {
        fillStudent(&arr[i]);
    }

    for (int i = 0; i < num; i++) {
        displayStudent(arr[i]);
    }
    
    return 0;
}