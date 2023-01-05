public class Person {
    // Attributes
    String name, surname;
    int age;

    // Constructors

    // Default Constructor
    Person(){
        this.age = -1;
        this.name = "Undefined!";
        this.surname = "Undefined!";
    }

    // Parameterised Constructor
    Person(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    // Copy
    Person(Person obj){
        this.age = obj.age;
        this.name = obj.name;
        this.surname = obj.surname;
    }

    // Methods
    void printInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Surname: " + this.surname);
        System.out.println("Age: " + this.age);
        System.out.println();
    }
}

