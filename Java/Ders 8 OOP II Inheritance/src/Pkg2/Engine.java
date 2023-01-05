package Pkg2;

public class Engine {
    int horsePower;
    double motor;

    Engine(int horsePower, double motor){
        this.horsePower = horsePower;
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "horsePower=" + horsePower +
                ", motor=" + motor +
                '}';
    }
}
