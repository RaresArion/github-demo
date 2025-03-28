package Section9.BinarySearch;

/*
* Binary search array requirements:
*       Arrays.binarySearch(arr, key);
*  - sorted;
*  - if duplicate values exit => no guarantee which one it'll match on
*  - elements must be comparable, NO elements of different types => errors
*
* Test two arrays are equal
*   Arrays.equals(arr1, arr2);
*  - Requirements:
*       - same length;
*       - same elements in the same order
* */

import java.util.Arrays;
import java.util.Random;

public class Main {

    static Random r = new Random();

    public static void main(String[] args) {

        String[] sArr = {"Able", "Jane", "Mark", "Ralph", "David"};
        Arrays.sort(sArr);
        if (Arrays.binarySearch(sArr, "Mark") >= 0) {
            System.out.println(Arrays.toString(sArr));
            System.out.println("Found Mark in the list");
        }
        System.out.println();
        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {5, 2, 3, 4, 1};
        if (Arrays.equals(s1, s2)) {
            System.out.println("Array are equal");
        } else {
            System.out.println("Array are NOT equal");
        }
    }

    // METHODS
    public static int[] getRandomArray(int len) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = r.nextInt(10);
        }
        return arr;
    }
}
