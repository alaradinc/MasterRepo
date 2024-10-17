package SearchAlgorithms.LinearSearch;

public class Main {
    public static void main(String[] args) {
        int[] data = {124,65,245,54,74,654,564765,456,7456,458};

        int target = 456;
        int idx = linearSearch(data,target);
        System.out.println(target + " at index: " + idx);
    }

    private static int linearSearch(int[] data, int target) {
        for(int i = 0; i<data.length; i++){
            if(data[i] == target)
                return i;
        }
        return -1;
    }
}
