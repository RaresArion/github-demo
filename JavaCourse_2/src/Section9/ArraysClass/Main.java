package Section9.ArraysClass;
/*
* Use Arrays class to deal with arrays
*   Arrays.toString(arr) -> prints the array
*   Arrays.sort(arr); -> sorts the array
*   Arrays.fill(arr, number) -> fills / changes all elements to number's value
*   Arrays.copyOf(arr, arr.length); copies the array to a new reference
* */

import java.util.Arrays;
import java.util.Random;

public class Main {

    static Random r = new Random();

    public static void main (String[] args) {
        int[] arr = getRandomArray(10);
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        Arrays.fill(arr2, 5);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }

    // METHODS
    public static int[] getRandomArray(int len) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = r.nextInt(100);
        }
        return arr;
    }

    public static StringBuilder[] getRandomArray (int len, boolean x) {

        return new StringBuilder[] {new StringBuilder("123")};
    }
}
