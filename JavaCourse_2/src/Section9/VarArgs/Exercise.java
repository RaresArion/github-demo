package Section9.VarArgs;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {

//        int x = readInteger();
        System.out.println("Min value is: " + findMin(readElements(readInteger())));


    }

    private static int readInteger () {
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Number of elements: ");
        return scanner.nextInt();
    }

    private static int[] readElements (int x) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[x];
        int counter = 0;
        while (counter < x) {
//            System.out.print("Give the elements #" + x + ": ");
            arr[counter] = scanner.nextInt();
            counter++;
        }
        return arr;
    }

    private static int findMin(int[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }
}
