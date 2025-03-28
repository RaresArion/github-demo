package Section9.Array2D;

import java.util.Arrays;

public class First {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);

        for (int[] i : arr) {
            System.out.println(Arrays.toString(i));
        }

        System.out.println("Nested 'for' loops");
        for (int i = 0; i < arr.length; i++) {
            var innerArr = arr[i];
            for (int j = 0; j < innerArr.length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("Nested enhanced 'for' loops");
        for (var i : arr) {
            for (var j : i) {
                System.out.print(j + "  ");
            }
            System.out.println();
        }

        System.out.println("Using 'Arrays.deepToString(arr)': ");
        System.out.println(Arrays.deepToString(arr));

        System.out.println("Assigning values to the array: ");
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            var innerArr = arr[i];
            for (int j = 0; j < innerArr.length; j++) {
                arr[i][j] = x + 1;
                x = arr[i][j];
            }
        }
        System.out.println(Arrays.deepToString(arr));

    }
}
