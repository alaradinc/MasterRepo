#include <stdio.h>
#include <string.h>

typedef struct
{
    char name[100];
    int age;
    int height;
} Person;

void fillPerson(Person *person)
{
    printf("Enter name: ");
    fgets(person->name, sizeof(person->name), stdin);
    printf("Enter age: ");
    scanf("%d", &(person->age)); // why do i have to put an '&' if person is already a pointer?
    printf("Enter height: ");
    scanf("%d", &(person->height));
    getchar();
}

void displayPerson(Person person)
{
    printf("Name: %s\n", person.name);
    printf("Age: %d\n", person.age);
    printf("Height: %d\n", person.height);
    getchar();
}

int main()
{
    Person persons[2];

    fillPerson(&persons[1]);
    fillPerson(&persons[2]);
    displayPerson(persons[1]);
    displayPerson(persons[2]);

    return 0;
}
