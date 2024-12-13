#include <stdio.h>
#include <stdlib.h>

typedef struct
{
    char street[50];
    char city[30];
    int zipCode;

}Address;

typedef struct 
{
    char name[50];
    int id;
    char department[30];
    float salary;
    Address address;
    
}Employee;

void clearBuffer(){
    while (getchar() != '\n'); // as long as the input is not enter, continue with the program, otherwise use getchar to clear the enter asad
}

void readAddress(Address *address){
    printf("Input street: ");
    fgets(address->street, sizeof(address->street), stdin);
    
    printf("Input city: ");
    fgets(address->city, sizeof(address->city), stdin);
    
    
    do{ 
    printf("Input zip code (5 digits): ");
    scanf("%d", &address->zipCode);
    clearBuffer();

        if(address->zipCode < 10000 || address->zipCode > 99999){
            printf("Invalid input, zipcode must be 5-digit number.\n");
        }

    } while (address->zipCode < 10000 || address->zipCode > 99999); 
}

void printAddress(Address address){
    printf("Street: %s", address.street);
    printf("City: %s", address.city);
    printf("Zip code: %d", address.zipCode);

}

void readEmployee(Employee *employee){
    printf("Input name: ");
    fgets(employee->name, sizeof(employee->name), stdin);

    printf("Input id: ");
    scanf("%d", &employee->id);
    clearBuffer();

    printf("Input department: ");
    fgets(employee->department, sizeof(employee->department), stdin);


    while(1){

        printf("Input salary: ");
        scanf("%f", &employee->salary);
        clearBuffer();
        
        if(employee->salary >= 0){
            break;
        }
   
        printf("Salary cannot be negative. Input positive salary.");
        
        }
    
    readAddress(&employee->address); //instead of input, directly call the address input function

    
}

void printEmployee(Employee employee){
    printf("Employee Name: %s", employee.name);
    printf("Employee ID: %d\n", employee.id);
    printf("Employee Department: %s", employee.department);
    printf("Employee Salary: %lf\n", employee.salary);
    printAddress(employee.address);
    printf("\n");

    
}

float calculateAvgSalary(Employee *employees, int arr_elements){
    //calculates and returns average salary of employees

    float sum = 0;

    if (arr_elements == 0) {
        return 0;
    }

    for (int i = 0; i < arr_elements; i++)
    {
        sum += (employees + i)->salary;          
    }
    
    float avg = sum / arr_elements;
    return avg;
}


int main(){

    int num_employees;

    printf("Enter number of employees to register: ");
    scanf("%d", &num_employees);
    clearBuffer();

    Employee *employees = (Employee*)malloc(num_employees* sizeof(Employee));

    for (int i = 0; i < num_employees; i++)
    {
        readEmployee(employees+i);
        printf("\n");  
    }

    for (int i = 0; i < num_employees; i++)
    {
        printEmployee(*(employees+i));
        printf("\n");
    }

    printf("Average salary: %f\n", calculateAvgSalary(employees, num_employees));

    printf("Writing employee details to file.");

    FILE *fptr, *rfptr;
    Employee emp;

    fptr = fopen("employee.dat", "wb");

    fclose(fptr); // do you need to close a file after everytime you open/read it?

    rfptr = fopen("employee.dat", "rb"); // Do I have to create a separate file pointer to read the same binary file?
                            //how do i determine location of file?
    if (rfptr == NULL){
        printf("Error opening file.");
        return 1; //can I return something else, why 1?
    }

    while (fread(&emp, sizeof(Employee), 1, rfptr)){
            // can I use something other than fread?   

        printEmployee(emp);
        printf("\n");
    }
    
    fclose(rfptr);


    

    

    return 0;
}