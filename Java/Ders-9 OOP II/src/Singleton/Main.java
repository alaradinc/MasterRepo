package Singleton;

public class Main {
    public static void main(String[] args) {
//        Database database = new Database(); // WILL NOT WORK! - because Database constructor is private
        Database database1 = Database.getInstance(); // Calling the getInstance class through the public Database class
        // you are creating the object / instance through the method (which is different than normal)

        Database database2 = Database.getInstance();
        System.out.println("DB1: " + database1.num);
        database1.num--;
        System.out.println("DB2: " + database2.num); //prints the same inputs as those in db1 because there exists only 1 database - singleton allows for only one
        System.out.println("DB1: " + database1.num);

    }
}
