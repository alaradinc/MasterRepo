package Accessing_Members_of_Outer_Class_within_Inner_Class;

class Car{ //do not say 'public class Car' because this is a nested class. if we said public, we would have to create a .java file for it
    String carName; //define attributes
    String carType;

    public Car(String carName, String carType){
        this.carName = carName; //assign attributes (where it is going to pick up the data from)
        this.carType = carType;
    }

    private String getCarName(){
        return this.carName; //create a private method
    }

    // nested inner Class
    class Engine{
        String engineType; //define attributes

        void setEngine(){ //because car type is not static we cannot say Car.carType
            if(Car.this.carType.equals("Truck")){ //we cannot compare strings with == (only primitive types of variables), which is why we have to use the .equals function when comparing Strings (non-primitive variable)
                this.engineType = "Big";
            }
            else if(Car.this.carType.equals("Bus")){
                this.engineType = "Medium";
            }
            else{
                this.engineType = "Small";
            }
        }

        String getEngineType(){ //method to return engineType
            return this.engineType; //Why do we use "this."? why not simply state Engine.engineType
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda","Automobile"); //java vm allocates space automatically to the variable (including all probabilities - given that engine is a nested class it assumes that you might allocate engine to it so it leaves a room for it)
        Car car2 = new Car("MAN","Bus");
        Car car3 = new Car("Ford","Truck");

        Car.Engine engine1 = car1.new Engine(); // Why do we do Car.Engine and not just Engine to create the object? (Is it because it is nested?)
        engine1.setEngine(); //engine1 is the variable in which car1's info is assigned to
        System.out.println("Mazda Engine => " + engine1.getEngineType()); //print the output

        Car.Engine engine2 = car2.new Engine(); //engine object is created inside the car object (pre allocated space to it by java vm since engine is a nested class)
        engine2.setEngine();
        System.out.println("MAN Engine => " + engine2.getEngineType());

        Car.Engine engine3 = car3.new Engine(); //created inside car3 which is why there is only 1 type of engine
        engine3.setEngine();
        System.out.println("Ford Engine => " + engine3.getEngineType());
    }
}
