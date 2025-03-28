package Section10.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayVsList {
    public static void main(String[] args) {

        String[] originalArr = new String[] {"First", "Second", "Third"};
        ArrayList<String> originalList = new ArrayList<>(List.of(originalArr));
        var originalList2 = Arrays.asList(originalArr); // this creates another reference to originalArr

        originalList.set(0, "one");
        System.out.println("originalArr\n -> " + Arrays.toString(originalArr));
        System.out.println("originalList\n -> " + originalList);
        System.out.println("originalList2\n -> " + originalList2);

        System.out.println();

        // originalList2.remove("Third");
        originalList2.set(1, "two");
        System.out.println("originalArr\n -> " + Arrays.toString(originalArr));
        System.out.println("originalList\n -> " + originalList);
        System.out.println("originalList2\n -> " + originalList2);



    }
}
