/*
        Nested structures question:

        Create a structure called "Date" that contains three members: day, month, and year. 
        Create another structure called "Student" that contains the following members:
        - Name
        - ID
        - Date of Birth (of type Date)

        Write a program that creates a variable of type Student and initializes it with the following values:
        - Name: "John Doe"
        - ID: 12345
        - Date of Birth: 1/1/2000

        Print the values of the Student variable.
        
        Expected input:

        Enter student name: John Doe
        Enter student ID: 12345
        Enter birth date: 1/1/2000

        Expected output:
        
        Name: John Doe
        ID: 12345
        Date of Birth: 1/1/2000
*/

#include <stdio.h>
#include <stdlib.h>

typedef struct 
{
    int day;
    int month;
    int year;
}Date;

typedef struct      
{
    char name[50];
    int id;
    Date dateOfBirth; //it's own structure
} Student;


int main(){

    int id, day, month, year;
    Student student1; //no need to form 'date' object, because it is already created when Student is formed (because it is within)
    
    printf("Enter student name: ");
    fgets(student1.name, sizeof(student1.name), stdin); // if I just wanted to assign in main - strcpy(student1.name, "John Doe");
        // no need to write '&' as name is already an address (because it is an array / char pointer)

    printf("Enter student ID: ");
    scanf("%d", &student1.id);
    
    printf("Enter student day of birth: ");
    scanf("%d/%d/%d", &student1.dateOfBirth.day, &student1.dateOfBirth.month, &student1.dateOfBirth.year);

    printf("Name: %s", student1.name);
    printf("ID: %d\n", student1.id);
    printf("Date of birth: %d/%d/%d\n", student1.dateOfBirth.day, student1.dateOfBirth.month, student1.dateOfBirth.year);
}