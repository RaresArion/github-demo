package Section9.ArrayBasic;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = i;
        }
//        System.out.println(arr.getClass().getSimpleName());
//        System.out.println(Arrays.toString(arr).getClass().getSimpleName());

        Object newObj = arr;
//        if (newObj instanceof int[]) {
//            System.out.println("arr is an instance of int[]");
//        }

        Object[] arrObj = new Object[] {new StringBuilder("\"Hello, World!\""), 14, Arrays.toString(new int[] {1, 2, 123, 5})};

        // System.out.print("Object arr: "); // Object arr:    ["Hello, World!",   14,             [1, 2, 5, 123]]
        // System.out.println(Arrays.toString(arrObj));




    }
}
