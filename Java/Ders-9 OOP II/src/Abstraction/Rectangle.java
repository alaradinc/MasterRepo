package Abstraction;

public class Rectangle implements Polygon { ///cannot use 'extends' for instances

    @Override
    public void getArea(int length, int breadth) {
        System.out.println("The area is: " + length * breadth);
    }
}
