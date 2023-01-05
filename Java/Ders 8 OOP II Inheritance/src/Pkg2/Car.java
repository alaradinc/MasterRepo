package Pkg2;

public class Car { //can t use super because engine is not a superclass of car - there is no inheritence
    Engine engine;
    int tankCapacity;

    Car(Engine engine, int tankCapacity){ // directly use the entire engine class's attributes
        this.engine = engine;
        this.tankCapacity = tankCapacity;
    }
}

/*
                    STUDENT

          double gpa;
          List<Course> takenCourses;
          Transcript tr;






 */
