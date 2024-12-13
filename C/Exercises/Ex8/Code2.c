#include <stdio.h>
#include <stdlib.h>

typedef struct
{
    char street[50];
    char city[30];
    int zipCode;

} Address;

typedef struct
{
    char name[50];
    int id;
    char department[30];
    float salary;
    Address address;

} Employee;

void clearBuffer()
{
    while (getchar() != '\n')
        ; // as long as the input is not enter, continue with the program, otherwise use getchar to clear the enter asad
}

void readAddress(Address *address)
{
    printf("Input street: ");
    fgets(address->street, sizeof(address->street), stdin);

    printf("Input city: ");
    fgets(address->city, sizeof(address->city), stdin);

    do
    {
        printf("Input zip code (5 digits): ");
        scanf("%d", &address->zipCode);
        clearBuffer();

        if (address->zipCode < 10000 || address->zipCode > 99999)
        {
            printf("Invalid input, zipcode must be 5-digit number.\n");
        }

    } while (address->zipCode < 10000 || address->zipCode > 99999);
}

void printAddress(Address address)
{
    printf("Street: %s", address.street);
    printf("City: %s", address.city);
    printf("Zip code: %d", address.zipCode);
}

void readEmployee(Employee *employee)
{
    printf("Input name: ");
    fgets(employee->name, sizeof(employee->name), stdin);

    printf("Input id: ");
    scanf("%d", &employee->id);
    clearBuffer();

    printf("Input department: ");
    fgets(employee->department, sizeof(employee->department), stdin);

    while (1)
    {
        printf("Input salary: ");
        scanf("%f", &employee->salary);
        clearBuffer();

        if (employee->salary >= 0)
        {
            break;
        }

        printf("Salary cannot be negative. Input positive salary.");
    }

    readAddress(&employee->address); // instead of input, directly call the address input function
}

void printEmployee(Employee employee)
{
    printf("Employee Name: %s", employee.name);
    printf("Employee ID: %d\n", employee.id);
    printf("Employee Department: %s", employee.department);
    printf("Employee Salary: %lf\n", employee.salary);
    printAddress(employee.address);
    printf("\n");
}

float calculateAvgSalary(Employee *employees, int arr_elements)
{
    // calculates and returns average salary of employees

    float sum = 0;

    if (arr_elements == 0)
    {
        return 0;
    }

    for (int i = 0; i < arr_elements; i++)
    {
        sum += (employees + i)->salary;
    }

    float avg = sum / arr_elements;
    return avg;
}

int main()
{
    int num_employees;
    printf("Enter number of employees to register: ");
    scanf("%d", &num_employees);
    clearBuffer();

    Employee* employees = (Employee *)malloc(num_employees * sizeof(Employee)); // this is actually employees[num_employees], but because we are dynamically allocating it, we chnage the syntax
    //we cannot do static allocation via employees[num_employees] because system needs to allocate a set memory - which is why we define a pointer 'employees' instead (initial address)

    printf("Enter employee details: \n");
    for (int i = 0; i < num_employees; i++)
    {
        readEmployee(employees + i);
        printf("\n");
    }

    printf("Writing employee details to file.\n");
    FILE *fptr = fopen("employee.dat", "wb"); // I only need to create one file pointer if I am working with the same file
    // I should create two file pointers when I need to work with two different files

    if (fptr == NULL)
    {
        printf("Error opening file.");
        return 0;
    }

    for (int i = 0; i < num_employees; i++)
    {
        fwrite(employees + i, sizeof(Employee), 1, fptr); //use file pointer to reference where to write data
    }

    fclose(fptr); // do you need to close a file after everytime you open/read it?

    fptr = fopen("employee.dat", "rb"); // Do I have to create a separate file pointer to read the same binary file?
                                        // how do i determine location of file?
    if (fptr == NULL)
    {
        printf("Error opening file.");
        return 1; // can I return something else, why 1?
    }

    Employee *read_employees = (Employee *)malloc(num_employees * sizeof(Employee));

    for (int i = 0; i < num_employees; i++)
    {
        fread(read_employees + i, sizeof(Employee), 1, fptr);
        //create new array 'read_emplyees' to show that we can read from the file, as 'employees' array is already full of info
    }

    printf("Reading employee details from file.\n");
    for (int i = 0; i < num_employees; i++)
    {
        printEmployee(*(read_employees + i));
        //print the info in the newly created array 'read_employees'

    }

    float avg_salary = calculateAvgSalary(read_employees, num_employees);
    printf("Average salary of employees: %f\n", avg_salary);

    fclose(fptr);

    return 0;

    // We had to use wsl on windows to run the code, as it was not working on windows terminal
    // We had to use the command 'gcc -o Code2' to compile the code
    // We had to use the command './Code2' to run the code

    // But here, on MacOS, we can simply use the command 'gcc Code2.c' to compile the code
    // And then use the command './a.out' to run the code

    // The reason for this is that MacOS uses a different compiler than Windows (clang vs gcc)
    // And the terminal commands are different as well (wsl vs gcc)
    // This is why the commands are different on the two operating systems
}