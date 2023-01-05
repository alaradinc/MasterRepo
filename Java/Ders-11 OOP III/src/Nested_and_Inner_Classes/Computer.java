package Nested_and_Inner_Classes;

public class Computer {
    double price;

    // nested class
    class Processor{
        double cores;
        String manufacturer;

        double getCache(){
            return 4.3;
        }
    }

    // nested protected class - only accessible by files within the package
    protected class RAM{
        double memory;
        String manufacturer;

        double getClockSpeed(){
            return 5.5;
        }
    }
}
