package Pkg2;

public class BMW extends Car{
    String color;

    public BMW(int horsePower, double motor, int tankCapacity, String color) {
        super(new Engine(horsePower,motor), tankCapacity); //super is car, we determine this by writing extends car
        this.color = color;
    }

    @Override
    public String toString() {
        return "BMW{" +
                "color='" + color + '\'' +
                ", engine=" + engine +
                ", tankCapacity=" + tankCapacity +
                '}';
    }
}
