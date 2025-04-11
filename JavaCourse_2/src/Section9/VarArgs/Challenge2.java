package Section9.VarArgs;

import java.util.Arrays;

public class Challenge2 {
    public static void main(String[] args) {

        int[] arr = {1, 8, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(arr));
        reverse3(arr);
//        System.out.println(Arrays.toString(arr));

    }

    private static void reverse(int[] arr) {
        int[] tmpArr = Arrays.copyOf(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = tmpArr[arr.length - 1 - i];
        }
    }

    private static void reverse2(int[] arr) {
        int tmp;
        for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
            tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
    }

    private static void reverse3 (int[] arr) {
        int tmp;
        System.out.println("Array = " + Arrays.toString(arr));
        for (int i = 0; i < arr.length / 2; i++) {
            tmp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = tmp;
        }
        System.out.println("Reversed array = " + Arrays.toString(arr));
    }
}
