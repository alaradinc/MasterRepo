package Pkg1;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird("Cik",1,"Blue"); // we are creating instances of these sub-classes
        Dog dog = new Dog("Sam",1,"Golden");
//
//        System.out.println(dog.name);
//        System.out.println(dog.age);
//        System.out.println(dog.type);
//        dog.printInfo();
        System.out.println(dog); //we can only do this because we defined the `tostring` function in the Pkg1.Dog class
//
//        System.out.println("\n"+bird.name);
//        System.out.println(bird.age);
//        System.out.println(bird.color);

        /*
                is-a relationship => Inheritance
                has-a relationship => composition (aggregation)


                class Car{
                    Engine engine;
                    Tank fuelTank;              =====> HAS - A
                    Tire tires[4];
                }

                Car car = new Car();
                car.engine.horsePower

         */
    }
}