package Static_Classes;

class Animal{
    // nested (inner) class
    class Reptile{
        public void displayInfo(){
            System.out.println("I am a reptile!");
        }
    }

    // static class
    static class Mammal{ //sabit location in RAM when you identify it as static
        public void displayInfo(){
            System.out.println("I am a mammal!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Object creation of the outer class
        Animal animal = new Animal();

        // object creation of the non-static class
        Animal.Reptile reptile = animal.new Reptile(); //allocates space within the Reptile class
        reptile.displayInfo();

        // object creation of the static nested class
        Animal.Mammal mammal = new Animal.Mammal(); //allocates space in the RAM
        mammal.displayInfo();

        // Anonymous Classes...
    }
}
