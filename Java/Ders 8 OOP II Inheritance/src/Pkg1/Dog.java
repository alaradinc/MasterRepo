package Pkg1;

public class Dog extends Animal{ // ilk basta bir animal uretecegiz, sonra onu kopege cevirecegiz
    String type;

    Dog(String name, int age, String type){
        super(name,age); // The super keyword is a referance variable which is used to refer immediate parent class.
        //super is like copying this.name this.age again under the dog object
        //prevents repetition
        this.type = type;
    }

    void printInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Type: " + this.type);
    }

    @Override // overrides printing the original hex class' instead we modify the toString function to print the contents of the dog class
    public String toString() {
        return "Name: " + this.name + "\nAge: " + this.age + "\nType: " + this.type;
    }
}
