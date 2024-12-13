/*
    Generate a structure called "Student" with the following fields:
    - Name
    - Age
    - Roll Number

    Write a program to take input from the user for 5 students and display the details of the student with the highest age.
*/

#include <stdio.h>

typedef struct 
{
    char name[50];
    int age;
    int rollNo;
}Student;

void fillStudent(Student* student){ //create a student pointer of Student type
                                    //we have to input a pointer becuse we are 'chnging/writing' the values inside the array
                                    //create function to fill in student info (rather than do it within for loop in main)
    printf("Input student name: "); // BUFFER ==> [] 
    fgets(student->name, sizeof(student->name), stdin); //use fgets because this is n array // BUFFER ==> []

    printf("Input student age: "); // BUFFER ==> [], think of it like an empty box we store info in tht fgets/scan uses to store
    scanf("%d", &(student->age)); // within function converted to '->' because it is a pointer (in pointers we can't use '.')
                                  // //because student is a pointer I have to use an arrow, i cannot use 'period'
                                  // use '&' to access address of the function so we can input the variable directly in (otherwise we ar working with it's copy)

    printf("Input student rollNo: ");
    scanf("%d", &(student->rollNo)); // BUFFER ==> [] 
    // fflush(stdin); // BUFFER ==> [] cleans buffer
    getchar(); // This is a function that reads the next character from the standard input (stdin) and returns it as an 
               // unsigned char cast to an int, or EOF on end of file or error.
    // Buffer is a kind of a temporary storage area that stores the data while it is being transferred from one place to another
}

void displayStudent(Student student){
    printf("Student name is %s", student.name); //fgets already prints an \n, so we don't need to rewrite it 
    printf("Student age is %d\n", student.age);  
    printf("Student rollNo is %d\n\n", student.rollNo);  
}

int main(int argc, char const *argv[])
{
    Student students[5];
    for (int i = 0; i < 5; i++)
    {
        fillStudent(students+i); // 'students' is a pointer itself, because it is an array
                                 // &students[i] you can also do this
                                 // students + i = address of student, everytime we increase it by 1, it bumps up to the next address
    }

    printf("\n\n\n");
    
    for (int i = 0; i < 5; i++)
    {
        // displayStudent(students[i]); //sending a 'student' within the students array
        displayStudent(*(students+i)); //or another version of writing this is to send the content of the student using it's address (as the students array is a pointer )
    }  

    // Student alara; // Here I declare a variable of type Student (STATIC MEMORY)
    // alara.age = 20;
    // printf("Alara's age: %d\n", alara.age);

    // Student* alaraPtr = &alara; // Here I declare a pointer of type Student (DYNAMIC MEMORY)
                                // Student pointer cesidinden 'alaraPtr' diye bir variable olusturdum
                                // alara bir Student nesnesi, alara nesnesinin adresini student pointer tipinden pointer ile point etmeye basladim
    // alaraPtr ==> Pointer to the address of alara
    // *alaraPtr ==> Value at the address of alara
    // alara ==> Value of alara
    // &alara ==> Address of alara

    // alaraPtr = 'address of another variable of type student'; // this will then change the content of alaraPtr (for ex it will hold Ayberk's info)
    // alaraPtr is a pointer to a student type, so it can only point to a student type
    // alara's content will not change
    // you cnnot simply assign alaraPtr = 3, because alaraPtr is of type Student (not int)

    return 0;
}
