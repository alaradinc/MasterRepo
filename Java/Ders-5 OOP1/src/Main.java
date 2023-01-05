import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Object Creation
        // ClassName objName = new Constructor();

//        Person alara = new Person();
//        Person ayberk = new Person("Ayberk","Saygı",22);
//        Person tara = new Person(alara);
//
//        alara.printInfo();
//        ayberk.printInfo();
//        tara.printInfo();

        Scanner scan = new Scanner(System.in);

        System.out.print("How many objects do you want to form? ");
        int objNum = scan.nextInt(); //obtained and stored input from scan into variable called objNum - we have to define the type of scan variable we are receiving (nextInt)

        Student[] studentArray = new Student[objNum]; //you are creating an array of 'Student[]' type. You define the number of indexes through objNum (which the user will input)

        for (int i = 0; i < objNum; i++) {
            scan.nextLine(); //buffer poisoning - happens because you ask for a string after an integer

            System.out.print("Input Student[" + i + "] name: ");
            String name = scan.nextLine();
            System.out.print("Input Student[" + i + "] grade: ");
            int grade = scan.nextInt();

            studentArray[i] = new Student(name, grade); //we don't need to define a separate variable for the Student object because its name is the Array's index position
            System.out.println();
        }

        System.out.println(Arrays.toString(studentArray));
//
//        bubbleSort(studentArray);
//
//        for(Student iterator : studentArray) // for-each loop - short-cut for usual for loop (int i ... etc.)
//            iterator.printInfo();

       /* Scanner reader = new Scanner(System.in);

        System.out.println("Enter a string");
        String input = reader.nextLine();

        if (input.equals("a string")) {
            System.out.println("Great! You read the instructions correctly.");
        } else {
            System.out.println("Missed the mark!");
        }

        // We are able to call a function cousse its defined a static in X class
        X.a();
        // we cannot call a() function in Y class couz a() function is not defined statically. You have to create an instance of Y class to use a () function
        Y y = new Y();
        y.a();

*/

    }


//    static void bubbleSort(Student[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length - 1; j++) {
//                if (arr[j].grade > arr[j + 1].grade) {
//                    Student temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//    }



}