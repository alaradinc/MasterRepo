package SortAlgorithms.BubbleSort;

import java.io.FileWriter;
import java.util.Random;

public class Power {

    public static void main(String[] args) throws Exception{
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            int elementSize = (int) Math.pow(10, i);
            int[] array = generateRandomArray(elementSize);
            long begin = System.currentTimeMillis();
            BubbleSort.sort(array);
            long end = System.currentTimeMillis();

            System.out.println("Total elapsed time to sort " + elementSize + " elements using bubble sort: " + (end - begin) + "ms");

            FileWriter fileWriter = new FileWriter("BubbleSort.txt",true);
            fileWriter.write("Total elapsed time to sort " + elementSize + " elements using bubble sort: " + (end - begin) + "ms\n");
            fileWriter.flush();
            fileWriter.close();
        }
        System.out.println();
    }

    public static int[] generateRandomArray(int elementSize){ 
        int[] array = new int[elementSize]; 
        Random rd = new Random();

        for (int i = 0; i < array.length; i++){
            array[i] = rd.nextInt(elementSize);
        }
        
        return array;
    }
}
