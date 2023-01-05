package Encapsulation;

public class Student {
    private String name;
    private int ID;

    public Student(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    // accessor & mutator methods

    public String getName(){ //not void because it must return a value
        return name;
    }

    public void setName(String name){ //void because it doesn't have to return any value
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
