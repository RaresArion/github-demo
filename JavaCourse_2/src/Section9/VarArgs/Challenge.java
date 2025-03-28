package Section9.VarArgs;

import java.util.Arrays;
import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.print("Write a list of nr delimited by \", \": ");
//        String stringArray = scanner.nextLine();
//
//        String[] sArray = stringArray.split(", ");
//        int[] iArr = readIntegers(sArray);

        int[] iArr = readIntegers("1", "2", "3", "-2", "2");

        System.out.println("Min value is: " + findMin(iArr));
    }

    public static int[] readIntegers (String... args) {

        System.out.println("Class of 'args' is: " + args.getClass().getSimpleName());
        int[] arr = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Class is: " + arr.getClass().getSimpleName());
//
//        for (int i : arr) {
//            System.out.print(i + " - " + (i + 0.5) + "\n");
//        }
        return arr;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
