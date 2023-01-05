package Abstraction;

public class Dog extends Animal{

    @Override
    public void sleep() {
        System.out.println("Dog sleeps 13-17 hrs a day.");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating...");
    }
}
