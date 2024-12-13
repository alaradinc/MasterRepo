/*
    Structures in C

    A structure is a user-defined data type in C/C++. A structure creates a data type 
    that can be used to group items of possibly different types into a single type. 
    A structure is a helpful tool to handle a group of logically related data items.

    Syntax:
    
    struct structure_name
    {
        data_type member1;
        data_type member2;
        .
        .
        .
    };

    object creation: struct structure_name object_name;

    OR

    struct structure_name
    {
        data_type member1, member2, ...;
    };

    object creation: struct structure_name object_name;

    OR

    struct
    {
        data_type member1, member2, ...;
    } structure_name;

    object creation: struct structure_name object_name;

    OR (Typedef)

    typedef struct
    {
        data_type member1, member2, ...;
    } alias_name;

    object creation: alias_name object_name;
*/

#include <stdio.h>

// Define a structure
typedef struct
{
    char name[50];
    int roll;
    float marks;
} Student;

int main()
{
    // Declare a structure variable
    Student s1; // Static memory allocation

    // Assign values to the structure members
    printf("Enter information:\n");
    printf("Enter name: ");
    scanf("%s", s1.name);
    printf("Enter roll number: ");
    scanf("%d", &s1.roll);
    printf("Enter marks: ");
    scanf("%f", &s1.marks);

    // Display information
    printf("\nDisplaying Information:\n");
    printf("Name: %s\n", s1.name);
    printf("Roll: %d\n", s1.roll);
    printf("Marks: %.2f\n", s1.marks);

    return 0;
}

