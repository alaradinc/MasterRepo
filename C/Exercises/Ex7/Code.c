/*
    PART-1 (File Handling)
    
    Define a structure named Student with the following members:
    - Name: character array of size 50
    - Roll: integer
    - Marks: float

    Implement Below functions:
    - void readStudent(struct Student* s): This function should read the student details from the user.
    - void printStudent(struct Student* s): This function should print the student details.

    In the main function, ask user to enter how many students he wants to enter. Then, dynamically allocate memory for the students.
    Read the student details and print the student details.

    Then write all student details to a binary file named "students.dat".
    

    PART-2 (File Handling)

    Read the student details from the file "students.dat" and print the student details.
*/

#include <stdio.h>
#include <stdlib.h>

#define MAX_NAME_SIZE 50 //global variable

typedef struct 
{
    char name[MAX_NAME_SIZE]; //50 byte (global variable)
    int roll; //4 byte
    float marks; //4 byte
} Student; // total size = 58 byte

void clearBuffer(){
    while(getchar() != '\n'){

    }
}

void readStudent(Student *student){
    printf("Enter student name: ");
    fgets(student->name, sizeof(student->name), stdin);

    printf("Enter student roll: ");
    scanf("%d", &student->roll);
    clearBuffer(); // Clearing the buffer

    printf("Enter student marks: ");
    scanf("%f", &student->marks);   // we write scnf because scanf only takes in the number we enter, '5' 
                                    //but after we enter the number we press 'enter', so in the terminal we still have '\n' which gets used by the following fgets or scanf

    clearBuffer();
    printf("\n");
}

/*
    Single Responsibility Principle
    - A function should do only one thing and do it well.
*/

void printStudent(Student student){
    printf("Name: %s", student.name);
    printf("Roll: %d\n", student.roll);
    printf("Marks: %g\n\n", student.marks);
}

// In the main function, ask user to enter how many students he wants to enter. Then, dynamically allocate memory for the students.
// Read the student details and print the student details.

// Then write all student details to a binary file named "students.dat".

int main(){
    int num_students;

    printf("Enter number of students you want to create: ");
    scanf("%d", &num_students);
    clearBuffer();

    Student* students = (Student*)malloc(num_students * sizeof(Student)); // Student students[num_students]; // This is also correct but this is static memory allocation
    // This is dynamic memory allocation where we create number of students of type Student
    // These variable students are stored in RAM and pointed to via 'students' - '*students' is our pointer
    // students is an dynamic sized array, all arrays are pointers
    //(Student*) = we are typecasting malloc into Student pointer type, which is why we add * (otherwise malloc returns void * by default)

    // Student* students[] (can be written as Student** students also) = students array with elements of 'Student pointers'
    // which means that in this array w will hold the 'ADRESSES' of the students example: [123gfhbsf, 13x3352, 1228nfk2] 


    for (int i = 0; i < num_students; i++)
    {
        readStudent(students + i); // or can be written as '&students[i]'
    }

    printf("\n\nStudent Details:\n");
    
    for (int i = 0; i < num_students; i++)
    {
        printStudent(*(students + i)); //we need to provide the 'content' of the address which is why we write *
    }
    
    printf("\n\nWriting student details to file...\n");

    FILE* file = fopen("students.dat", "wb"); // wb = write binary
    if(file == NULL){
        printf("Error opening file\n");
        return 1;
    }

    fwrite(students, sizeof(Student), num_students, file); // fwrite is used to write to a file

    //students is the address of our data [0], system registers the whole size (num of students * Student type size)
    // then it breaks it down into 'Student' size components (which we provide via num_students)
    // file = pointer to file

    fclose(file);

    printf("Reading student details from file...\n");

    file = fopen("students.dat", "rb"); // rb = read binary
    if(file == NULL){
        printf("Error opening file\n");
        return 1;
    }

    Student student;
    while(fread(&student, sizeof(Student), 1, file)){
        // same as while(1)
        //because we use while loop, we don't have to define the specific number of contents (can use 1 instead)

        printStudent(student);
    }

    fclose(file);

    free(students); // free the memory allocated by malloc
    // we do this because students is an array whose size is allocated dynamically 
    // C compiler deallocates the memory of static variables automatically
    // but for dynamic variables we have to deallocate the memory manually

    return 0;
}