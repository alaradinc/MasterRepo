#include <iostream> 
#include "Person.h"

using namespace std;

int main() {
    /*
                Fundamentals of OOP

        1. Inheritence: 
            - It is a mechanism in which one class acquires the properties and behavior of another class.
            - The class that is inherited is called the base class and the class that inherits is called the derived class.
            - The derived class can access all the public and protected members of the base class.
            - The private members of the base class are not accessible in the derived class.
            - The derived class can have its own members and functions.
            - The derived class can override the base class functions.
            - The derived class can have its own constructors and destructors.
            - The derived class can have its own copy constructor.
            - The derived class can have its own assignment operator.
            - The derived class can have its own friend functions.
            - The derived class can have its own static members

                A. Types of Inheritence:
                    - Single Inheritence
                    - Multiple Inheritence

                        A (base class)   B (base class)
                            |                   |
                            C (derived class)

                    - Multilevel Inheritence

                            A (base class)
                            |
                            B (derived class)
                            |
                            C (derived class)

                    - Hierarchical Inheritence

                                    A (base class)
                                        |
                        B (derived class)  C (derived class)


                    - Hybrid Inheritence

                                A (base class)  B (base class)
                                    |               |
                                    C (derived class)
                                            |
                        D (derived class)  E(derived class)


        2. Abstraction and Encapsulation:
            - Abstraction: It is the process of hiding the implementation details and showing only the functionality to the user.
            - Encapsulation: It is the process of binding the data members and member functions into a single unit. It is also called data hiding.
                * Access Specifiers:
                    - Public: The members of the class are accessible from outside the class. 
                    - Private: The members of the class are not accessible from outside the class.
                    - Protected: The members of the class are accessible from the derived class.

                    - Getters(Accessor) and Setters(Mutators): These are the member functions that are used to access and modify the private data members of the class.
                    * public String getName() { return name; } ===> Getter
                    * public void setName(String name) { this.name = name; } ===> Setter
        
        3. Polymorphism:
            - It is the ability of an object to take many forms.
            - Compile Time Polymorphism: It is also called static binding or early binding. It is achieved by function overloading and operator overloading.

                                    void add(int a, int b) {
                                        cout << a + b << endl;
                                    }

                                    void add(int a, int b, int c) {
                                        cout << a + b + c << endl;
                                    }

                                    add(10, 20);

            - Run Time Polymorphism: It is also called dynamic binding or late binding. It is achieved by function overriding and virtual functions.

                                    List<Animal> animals = new ArrayList<>();

                                    animals.add(new Dog());
                                    animals.add(new Bird());

                                    for (Animal animal : animals) {
                                        animal.makeSound();
                                    }

                                    class Animal {
                                        public void makeSound() {
                                            System.out.println("Animal is making sound");
                                        }
                                    }

                                    class Dog extends Animal {
                                        public void makeSound() {
                                            System.out.println("Dog is barking");
                                        }
                                    }

                                    class Bird extends Animal {
                                        public void makeSound() {
                                            System.out.println("Bird is chirping");
                                        }
                                    }

            1. Class Imp
            2. Object Generation
            3. Inheritence
            4. Encapsulation and Abstraction
            5. Polymorphism
                - Function Overloading
                - Function Overriding
                - Virtual Functions
                - Pure Virtual Functions
            6. Abstract Class
            7. Operator Overloading
            8. Friend Functions
            9. Static Members
    */

    /*
            Structure of a Class:
                - Attributes (Data Members)
                - Constructors (Default, Parameterized, Copy)
                - Destructors
                - Member Functions

            Question: Create a class named Person with the following attributes:
                - Name
                - Age    
    */

    // 1. Static Defined Object
    // A. Using Default Constructor

    // Person p1 = Person(); // Default Constructor
    // p1.display();

    // // B. Using Parameterized Constructor
    
    // Person p2 = Person("Ali", 20); // Parameterized Constructor
    // p2.display();

    // // C. Using Copy Constructor

    // Person p3 = Person(p2); // Copy Constructor (deep copy)
    // p3.display();

    // 2. Dynamic Defined Object
    // A. Using Default Constructor

    Person *p4 = new Person(); // Default Constructor
    p4->display(); //use an arrow instead of '.' because we used a pointer '*p4'
    
    // B. Using Parameterized Constructor
    Person *p5 = new Person("Ali", 20); // Parameterized Constructor
    p5->display();

    // C. Using Copy Constructor
    Person *p6 = new Person(*p5); // Copy Constructor (deep copy)
    p6->display();
    // the 'new' word makes dynamic allocation

    // NOT POSSIBLE TO DO THIS -> Person *p6 = Person(*p5);
    // This is because you need to assign an address to the pointer p6 (which has the type of Person pointer)

    delete p4; // Destructor - we must delete this ourselves becuase it is dynamically defined
    delete p5; // Destructor
    delete p6; // Destructor
   
    // the other variables were deconstructed automatically by the system because they are static
    return 0;
}