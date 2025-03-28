package Section9.BinarySearch.Challenge;

import java.util.Arrays;
import java.util.Random;

public class Main {

    static Random r = new Random();

    public static void main(String[] args) {

//        Object[] arr = getRandomArray(10);
//        System.out.println(Arrays.toString(arr));
//        Arrays.sort(arr, Collections.reverseOrder());
//        System.out.println(Arrays.toString(arr));


        int[] arr = getRandomArray(10);
        arr.clone();
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(reverseSort2(arr)));

    }

    public static int[] reverseSort2 (int[] arr) {
        int tmp;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i+1]) {
                    tmp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = tmp;
                    flag = true;
                }
            }
        }
        return arr;
    }

    public static int[] reverseSort(int[] arr) {
        Arrays.sort(arr);
        int[] tmpArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            tmpArr[i] = arr[arr.length - 1 - i];
        }
        return tmpArr;
    }

    public static int[] getRandomArray (int len) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = r.nextInt(10);
        }
        return arr;
    }

    public static Integer[] getRandomArray (Integer len) {
        Integer[] arr = new Integer[len];
        for (int i = 0; i < len; i++) {
            arr[i] = r.nextInt(10);
        }
        return arr;
    }


}
