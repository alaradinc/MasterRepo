public class Student {

    String name;
    int grade;

    Student(){ //default constructor
        this.name = "N/A";
        this.grade = 0;
    }

    Student(String name, int grade){
        this.name = name;
        this.grade = grade;
    }

    Student (Student obj){
        this.name = obj.name;
        this.grade = obj.grade;
    }

    void printInfo(){ // you will be calling this function using an obj (e.g., alara.printInfo) which is why this.name will know to print your name
        System.out.println("Name: " + this.name);
        System.out.println("Grade: " + this.grade);
        System.out.println();
    }

    @Override  //overrides the default toString method located in the object class (default given by Java) - replaces the deafult Class+HasCode output with whatever you assign
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}

