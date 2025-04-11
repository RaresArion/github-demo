package Section10.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
*  List<String> list = List.of(items);
*  ArrayList<String> groceries1 = new ArrayList<>(list);
*  groceries4.addAll(groceries3); <- adds an ArrayList (groceries3) to another ArrayList (groceries4)
* */
public class MoreList {
    public static void main(String[] args) {

        // Use List to create ArrayList from simple basic arrays
        String[] items = new String[] {"apples", "bananas", "milk", "eggs"};
        List<String> list = List.of(items);

        ArrayList<String> groceries1 = new ArrayList<>(list);
        ArrayList<String> groceries2 = new ArrayList<>(List.of(items));
        ArrayList<String> groceries3 = new ArrayList<>(List.of(new String[] {"apples", "bananas", "milk", "eggs"}));
        ArrayList<String> groceries4 = new ArrayList<>(List.of("pickles", "mustard", "cheese"));

//        list.remove("eggs");
        groceries1.remove("apples");
        groceries2.set(2, "herring");
        groceries3.add("pineapple");

        System.out.println(Arrays.toString(items));
        System.out.println("list - " + list.size() + " -> " + list);

        System.out.println("\n" + Arrays.toString(items));
        System.out.println("groceries1 - " + groceries1.size() + " -> " + groceries1);
        System.out.println("groceries2 - " + groceries2.size() + " -> " + groceries2);
        System.out.println("groceries3 - " + groceries3.size() + " -> " + groceries3);

        groceries4.addAll(groceries3);
        System.out.println("\ngroceries4 - " + groceries4.size() + " -> " + groceries4);
        System.out.println("groceries3 - " + groceries3.size() + " -> " + groceries3);
        groceries3.addAll(List.of(items));
        System.out.println("groceries3 - " + groceries3.size() + " -> " + groceries3);
    }
}
