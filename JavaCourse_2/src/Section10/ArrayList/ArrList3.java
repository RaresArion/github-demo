package Section10.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
*   === find methods ===
*   grArray.get(2) <- gets item at index 2
*   grArray.contains(obj) <- 'true' if obj exists in array 'false' otherwise
*   grArray.indexOf(obj) <- returns first index of obj
*   grArray.lastIndexOf(obj) <- returns last index of obj
*
*  ======================
*
*  === remove methods ===
*
*  grArray.remove(index);
*  grArray.remove(obj);
*  grArray.removeAll();
*  grArray.removeAll(List.of(array of objs)); <- removes a list of object from the ArrayList; if one obj does NOT exist it will ignore that
*  grArray2.removeAll(grArray2); <- the list itself to remove all objs
*  grArray2.retainAll(list); <- retains only the list found in the 'list'
 *  grArray.clear(); <-
 *  grArray.isEmpty();
*
 *  ======================
 *
 *  === sort methods ===
 *
 *  grArray4.sort(Comparator.naturalOrder()); <- so far only works on wrapper, idk how to configure for custom classes
*   grArray4.sort(Comparator.reverseOrder());
*
 *  ======================
 *
 *  === List to basic array methods ===
 *
 * var grArray5 = grArray4.toArray(new String[0]);
 *
 *  ======================
*
* */
public class ArrList3 {
    public static void main(String[] args) {
        String[] list = {"Apples", "Kiwi", "Pineapple"};
        GroceryItem[] groceryList = new GroceryItem[list.length];
        for (int i = 0; i < list.length; i++) {
            groceryList[i] = new GroceryItem(list[i]);
        }

        System.out.println(Arrays.toString(groceryList));

        ArrayList<GroceryItem> grArray = new ArrayList<>(List.of(groceryList));
        System.out.println("\n" + grArray);
        System.out.println("Third item of grArray is: " + grArray.get(2));

        System.out.println("Does it contains Pineapple: " + grArray.contains("Pineapple")); // 'false' this is just a string not an obj
        System.out.println("Does it contains Pineapple: " + grArray.contains(new GroceryItem("Pineapple"))); // 'true' this is an obj

        grArray.add(new GroceryItem("Kiwi"));
        System.out.println("\n" + grArray);
        System.out.println("Index of 'Kiwi': " + grArray.indexOf(new GroceryItem("Kiwi")));
        System.out.println("Last index of 'Kiwi': " + grArray.lastIndexOf(new GroceryItem("Kiwi")));

        ArrayList<GroceryItem> grArray2 = new ArrayList<>(grArray);
        System.out.println("\ngrArray2 is: " + grArray2);
//        grArray2.removeAll(grArray2);
//        grArray2.removeAll(List.of(new GroceryItem("Pineapple"), new GroceryItem("Kiwi")));
//        grArray2.remove(new GroceryItem("Kiwi")); // <- removes only first instance of this obj
        grArray2.removeAll(List.of(new GroceryItem("Kiwi"), new GroceryItem("Pickles"))); // <- removes all instances of obj
        System.out.println("\ngrArray2 is: " + grArray2);
        System.out.println("\ngrArray is: " + grArray);

        ArrayList<GroceryItem> grArray3 = new ArrayList<>(List.of(new GroceryItem("Kiwi"), new GroceryItem("Pickles")));
        System.out.println("\ngrArray is: \n -> " + grArray);
        grArray.retainAll(grArray3);
        System.out.println("\ngrArray after 'retainAll()' is: \n -> " + grArray);

        // using clear() and isEmpty()
        System.out.println("\ngrArray3 is: \n -> " + grArray3);
        System.out.println("grArray3 isEmpty():  " + grArray3.isEmpty());
        grArray3.clear();
        System.out.println("grArray3 isEmpty():  " + grArray3.isEmpty());
        System.out.println("grArray3 after 'clear()' is: \n -> " + grArray3 + " isEmpty() -> " + grArray3.isEmpty());


        // using addAl() and Arrays.asList()
        grArray3.addAll(List.of(new GroceryItem("Kiwi"), new GroceryItem("Pickles")));
        System.out.println("\ngrArray3 after 'addAl()' is:\n -> " + grArray3 + " isEmpty() -> " + grArray3.isEmpty());

        grArray3.addAll(Arrays.asList(new GroceryItem("Mustard"), new GroceryItem("Peppers")));
        System.out.println("grArray3 after 'addAl() and Arrays.asList()' is: \n -> " + grArray3 + " isEmpty() -> " + grArray3.isEmpty());


        // sort arrays
        System.out.println("\n======== Using sort arrays ========");
        ArrayList<String> grArray4 = new ArrayList<>(Arrays.asList("Apple", "Pineapples", "Peppers",
                                        "Tomato", "Bananas"));
        System.out.println(grArray4);
        grArray4.sort(Comparator.naturalOrder());
        System.out.println(grArray4);
        grArray4.sort(Comparator.reverseOrder());
        System.out.println(grArray4);

        System.out.println("\n Using toArray()");
        var grArray5 = grArray4.toArray(new String[0]);
        System.out.println(Arrays.toString(grArray5) + " size = " + grArray5.length);
    }
}
