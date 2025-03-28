package Section10.AutoboxingAndUnboxing;

import java.util.ArrayList;
import java.util.List;

public class BoxingWIthArrays {
    public static void main(String[] args) {
        Integer[] wrapperArray = new Integer[5];
        wrapperArray[0] = 50;
//        System.out.println(Arrays.toString(wrapperArray));
//        System.out.println(wrapperArray[0].getClass().getSimpleName());

        Character[] charArray = {'a', 'b', 'c', 'd'};
//        System.out.println(Arrays.toString(charArray));

//        System.out.println(returnAnInt(5).getClass());
//        System.out.println(returnAnInteger(5).getClass().getName());

        System.out.println(getList(1, 2, 3, 5));
        ArrayList<Integer> ourList = getList(6, 7, 8, 9);
        var ourList2 = List.of(6, 7, 8, 9);
//        ArrayList<Integer> ourList3 = List.of(6, 7, 8, 9);
        Integer x = 15;
    }

    private static ArrayList<Integer> getList (int... varargs) {
        ArrayList<Integer> aList = new ArrayList<>();
        for (int i : varargs) {
            aList.add(i);
        }
        return aList;
    }

    private static int returnAnInt(Integer i) {
        return i;
    }

    private static Integer returnAnInteger (int i) {
        return i;
    }
}
