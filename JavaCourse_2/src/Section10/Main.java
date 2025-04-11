package Section10;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        rmDuplicates();
    }

    private static void rmDuplicates () {
        Integer[] arr = new Integer[] {14, 40, 14, 45, 14, 80, 80, 80, 1, 14, 5, 80, 12, 40, 80, -2, 12, 14, -6, 12};
        ArrayList<Integer> arr1 = new ArrayList<>(List.of(arr));

//        System.out.println(Arrays.toString(arr));
//        System.out.println(arr1);

        Arrays.sort(arr);
        arr1.sort(Comparator.naturalOrder());

//        System.out.println(Arrays.toString(arr));
        System.out.println(arr1);

        for (int i = 0; i < arr1.size() - 1; i++) {
            System.out.println(" -> " + i);
            if(!Objects.equals(arr1.get(i), arr1.get(i + 1))) {
                continue;
            }
            System.out.println(arr1.get(i) + " is equal to " + arr1.get(i + 1));
            System.out.println(arr1.get(i) + " at index " + arr1.indexOf(arr1.get(i)));
            System.out.println(arr1.get(i) + " at index " + arr1.lastIndexOf(arr1.get(i)));
            System.out.println("------------");
            int nr = arr1.get(i);

            while (nr == arr1.get(i+1)) {
                arr1.remove(arr1.get(i+1));
//                if (nr == arr1.get(i+1) && arr1.indexOf(arr1.get(i)) == arr1.size()) {
//                    arr1.remove(arr1.get(i+1));
//                    break;
//                } else {
//                    break;
//                }
            }
//            for (int j = arr1.indexOf(arr1.get(i)); j <= arr1.lastIndexOf(arr1.get(i)); j++) {
//                System.out.println("j = " + j);
//                arr1.remove(arr1.get(j));
//            }
//            arr1.removeAll(List.of(arr1.get(i)));

            System.out.println(" <- " + i);
            System.out.println(arr1);
            System.out.println("------------");
//            i = arr1.lastIndexOf(arr1.get(i));
//
//            for (int j = arr1.indexOf(arr1.get(i)); j < arr1.lastIndexOf(arr1.get(i)); i++) {
////                System.out.println(arr1.get(i) + " at index " + i);
//            }
        }
        System.out.println(arr1);
    }
}
