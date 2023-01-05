package Singleton;

public class Database {
    int num = 10;
    private static Database instance; //private attribute of type Database(e.g. int age;) - no access to it outside of this class file
                                //instance is the variable name
    private Database(){ //must stay as default constructor  (aka do not write new Database) otherwise creates a recursion - calling function within function

    }

    static Database getInstance(){
        if(instance == null)
            instance = new Database();
        return instance;
    }
}
