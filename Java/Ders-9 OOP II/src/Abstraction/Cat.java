package Abstraction;

public class Cat extends Animal{ //instance is the same as object
    private int sleepTime; //attribute

    public Cat(int sleepTime) { // shortcut for the 'generate menu' which you can choose to create a constructor = alt + 'insert' key
        this.sleepTime = sleepTime; //assign value to attribute
    }

    @Override //in the superclass (aka Animal), there is a method called sleep which we must modify to fit our 'cat' class, which is why we say 'override
    public void sleep() {
        System.out.println("Cat sleeps " + this.sleepTime + " hrs."); // use attribute to populate output
    }//

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }
}

