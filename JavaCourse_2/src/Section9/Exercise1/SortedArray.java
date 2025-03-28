package Section9.Exercise1;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static void main(String[] args) {
        int[] x = getIntegers(4);
        printArray(x);
        x = sortIntegers(x);
        printArray(x);
    }

    public static int[] getIntegers (int len) {
        int[] arr = new int[len];
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i < len) {
            arr[i] = scanner.nextInt();
            i++;
        }
        return arr;
    }

    public static int[] sortIntegers (int[] arr) {
        int[] sortedArr = Arrays.copyOf(arr, arr.length);
        int tmp;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (sortedArr[i] < sortedArr[i + 1]) {
                    tmp = sortedArr[i];
                    sortedArr[i] = sortedArr[i + 1];
                    sortedArr[i + 1] = tmp;
                    flag = true;
                }
            }
        }
        return sortedArr;
    }

    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println("Element " + i + " contents " + arr[i]);
        }
    }
}
