import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class MyBubbleSort {
    public static void main(String[] args) { //this is a static function, if you want to reach another function from the static context, that function has to be static
//        int[] array = new int[5]; //all variables start with lower case! Only the class names start with uppercase letters
//        Scanner numInput = new Scanner(System.in); //class is Scanner (this is a Java class and imported, newInput is an instance of the Scanner class)

        for(int i = 10; i < 1000000; i*=10){ //create arrays with elements in factors of 10 (10, 100, 1000 elements... )
            int[] arr = generateArray(i); // use the 'generateArray' function to populate the 'arr' array variable

            Date start = new Date(); //before we start the bubblesort record the time/date
            bubble(arr); //begin the bubble sort
            Date end = new Date(); //record the end time of the bubblesort function completion
            //we see the time passed during the run of the program

            System.out.println("Sorted " + i + " elements on " + (end.getTime()-start.getTime()) + "ms.");
        }

    }

     static int[] generateArray(int size){ //generateArray is function name; size is the number of places an array will have (given by user)
        //by making a function static, we ensure that the computer reserves memory space (whether we use it or not) when we run the program, otherwise program will allocate memory if and only if the function will be used
        int[] arr = new int[size]; // arr is variable name
        Random generator = new Random(); //a variable of 'random' type called generator (which is also a class instance - the class is called Random)

        for(int i = 0; i<size; i++){
            arr[i] = generator.nextInt(100000);
        }

        return arr;
    }

    static void bubble(int[] array){
        for(int i = 0; i < array.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < (array.length - i - 1); j++) { // we put -1 because we don't want it to exceed past the max integers in the array, otherwise it will give us an error
                if (array[j] > array[j + 1]) {              // we put - i because we don't want the loop to run unnecessarily to the end (since we've already determined the max value in the first run)
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    swapped = true; // if one of these integer places change (meaning the array is not in order), make 'swapped' statement true so the for loop runs
                }
            }

            if(!swapped) //if swapped is false, meaning the array is in order, break the for loop so you don't waste time running it
                break;
        }
    }
}

// 1 2 3 4 5
