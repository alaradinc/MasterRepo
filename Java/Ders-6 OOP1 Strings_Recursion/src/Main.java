import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        //calling methods I wrote beneath - outside of main method

        length("Hello");
        char[] lengthOf = toCharArray("Hello");
        System.out.println(uppercase("Hello"));

        // length
//        String name = "Alara";
//        System.out.println(name.length());
//
//        //------------------
//        String first = "Alara";
//        String sec = " Dinç";
//
//        String joined = first.concat(sec);
//        System.out.println(joined);
//
//        //------------------------------------------
//        String name1 = "Ayberk";
//        String name2 = "Alara";
//
//        char c1 = 'A';
//        System.out.println(c1);
//        System.out.println((int) c1);
//
//        System.out.println(name2.compareTo(name1));
//
//        //---------------------------------------------
//
//        String str = "Hello World!";
//        System.out.println(str.contains("o"));
//
//        //*******************************
//        String str1 = "Alara Dinç";
//        System.out.println(str1.substring(2, 5)); // beginning number inclusive, end number exclusive
//
//        //-----------------------------------
//        String str2 = "Ala1ra1 D1inç1";
//        System.out.println(str2.replace("1", ""));
//
//        String str3 = "Al13a324ra16 D5in43224ç";
//        // regex
//        System.out.println(str3.replaceAll("\\d+", ""));
//        String test = "A23LA12324RA1323 d23i213#$#nc2345";
//        System.out.println(test.replaceAll("[^A-Za-z]", ""));
//
//        //------------------------------------------
//        String str4 = "Alara Dinç";
//        System.out.println(str4.charAt(4));
//
//        //--------------------------------
//        System.out.println(str4.indexOf('a'));
//        // -----------------------------
//        String test1 = "Alara,Dinc,23,Istanbul";
//        String[] arr = test1.split(",");
//
//        System.out.println("Name: " + arr[0]);
//        System.out.println("Surname: " + arr[1]);
//        System.out.println("Age: " + arr[2]);
//        System.out.println("City: " + arr[3]);

        //----------------------

//        System.out.println("JAVA: " + "Ayberk".compareTo("Alara"));
//        System.out.println("MINE: " + compare("Ayberk","Alara"));

//        System.out.println(uppercase("AlaRa"));

//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Input string: ");
//        String str = scan.nextLine();
//
//        int output = length(str);
//        System.out.println(output);

//        String name = "Alara";
//        char[] chars = toCharArray(name); //assign the method's return value to a char array
//
//        // int length = length(name); //because this is a method you must assign it to a variable to store its return value
//        System.out.println();


    }

    // AlaRa
    // ALARA

    static char[] toCharArray(String str) { //char[] type of method - we may also use str.length (pre-defined function)
        char[] charArray = new char[length(str)];//we created a new array and defined how many boxes it should have (allocate memory) by inputting our total characters from the length method we created
        for (int i = 0; i < length(str);i++) { //no need to define int i outside because we will not be using the i variable after the completion of this loop
            charArray[i] = str.charAt(i); // assign the character to the specific index
        }
        return charArray; // must have return outside of for loop but inside method
    }


    static String uppercase(String str) {
        String strNew = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                char upper = (char) (str.charAt(i) - 32); // TYPECASTING
                strNew = strNew.concat(String.valueOf(upper)); // 'A' -> "A" must convert into string - must reassign to strNew so we continue building on the string
            } else {
                strNew += str.charAt(i); //the same as concat - but you just add the characters without needing the function
            }
        }
        return strNew;
    }

    static int length(String str) {
        // Alara Dinç
        int i = 0; //defined int i outside of the loop to preserve its type - otherwise it will be deleted along with everything in the for block given an error
        try {
            for (i = 0; ; i++) {
                str.charAt(i);

            }
        } catch (Exception ignored) {

        }
        return i;
    }




//    static int compare(String str1, String str2) {
//        for (int i = 0; i < Math.min(str1.length(), str2.length()); i++) {
//            if (str1.charAt(i) != str2.charAt(i)) {
//                return str1.charAt(i) - str2.charAt(i);
//            }
//        }
//
//        return str1.length()-str2.length();
//    }


    /*
                            ASSIGNMENT

            .length()
            .toCharArray()

            implement those functions
     */
}