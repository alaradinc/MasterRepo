package Abstraction; //java wrote this and told itself that this code is in the package called Abstraction (which we named)
                    // opened this 'package' akak 'folder' for our organizational purposes (to group all relevant animal classes in one folder) - was not necessary for the functioning of the code

public abstract class Animal { //abstract means there is no one 'standard' of the instances (e.g.,there is no one example animal but many different types of animals (objects)
    int age;

    public abstract void sleep(); //similarly, every instance has its own type of 'sleep (e.g., different animals have different sleeping patterns, therefore you cannot sum it in one method)
    public abstract void eat(); //therefore, it cannot be implemented directly, you must create an individual method for each instance in an abstract class
                        // you can right a non-abstract method that is applicable to all - it must work for all animals
    void whoAmI(){
        System.out.println("I am an animal!");
    }
}