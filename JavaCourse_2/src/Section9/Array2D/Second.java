package Section9.Array2D;

import java.util.Arrays;

public class Second {
    public static void main(String[] args) {

        Object[] anyArray = new Object[3];
        System.out.println(Arrays.toString(anyArray));

        anyArray[0] = new String[] {"a", "b", "c"};
        System.out.println(Arrays.deepToString(anyArray));

        anyArray[1] = new String[][] {
                {"1", "2"},
                {"3", "4", "5"},
                {"6", "7", "8", "9"}
        };
        System.out.println(Arrays.deepToString(anyArray));

        anyArray[2] = new int[2][4][3];
        System.out.println("\n" + Arrays.deepToString(anyArray));
        System.out.println();
        for (int i = 0; i < anyArray.length; i++) {
            System.out.println(Arrays.deepToString((Object[]) anyArray[i]));

        }
        System.out.println();
        for (Object elem : anyArray) {
            System.out.println("Elem type = " + elem.getClass().getSimpleName());
            System.out.println("Elem toString() = " + elem);
            System.out.println(Arrays.deepToString((Object[]) elem));
        }


    }
}
