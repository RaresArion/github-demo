package Section10.ArrayList;

import java.util.ArrayList;
/*
*   ArrayList<Class> x = new ArrayList<>();
*       x.add(obj); <- it will add the obj at the end of the list
*       x.add(index, obj); <- it will add the obj at the 'index' of the list
*       x.remove(obj);
*       x.remove(index);
*       x.set(index, obj);
*
* === Detailed in 'MoreList' java file ===
*
*   List<String> list = List.of(items);
*   ArrayList<String> groceries1 = new ArrayList<>(list);
*   groceries4.addAll(groceries3); <- adds an ArrayList (groceries3) to another ArrayList (groceries4)
*
*   ArrayList<GroceryItem> arr0 = new ArrayList<>();
*   ArrayList<GroceryItem> arr = new ArrayList<>(arr0); <- 'arr0' must be an arrList of 'GroceryItem'
* ======================================
*
 * === Detailed in 'ArrList3' java file ===
*
*
*
 * ======================================
* */
record GroceryItem(String name, String type, int count) {
    // contains constructor with all parameters
    // also contains getters
    // toString() method
    public GroceryItem(String name) {
        this(name, "DAIRY", 1);
    }

    @Override
    public String toString() {
        return String.format(">%d %s in %s<", this.count, this.name.toUpperCase(), this.type);
    }
}

public class Main {
    public static void main(String[] args) {

        Class cls = GroceryItem.class;
        cls.getSimpleName();

        GroceryItem[] groceryArray = new GroceryItem[4];
        Object[] groceryArray2 = new Object[5];

        GroceryItem gI1 = new GroceryItem("Potato", "Vegetable", 3);
        for (int i = 0; i < 3; i++) {
            groceryArray2[i] = new GroceryItem("Potato", "Vegetable", i);
        }
        groceryArray2[3] = "5 organges"; // works because gA2 is of type Object => any obj can be placed here
        groceryArray2[4] = 4; // this will be added as Integer not as int
//        System.out.println("Object array is: ");
//        System.out.println(Arrays.toString(groceryArray2));
//        System.out.println("Last elem of Object array is of type: " + groceryArray2[4].getClass().getSimpleName() + "\n");


        GroceryItem gI2 = new GroceryItem("Potato");
//        System.out.println(gI2.toString());
        groceryArray[0] = new GroceryItem("Milk");
        groceryArray[1] = new GroceryItem("apples", "PRODUCE", 6);
        groceryArray[2] = gI2;

//        System.out.println(Arrays.toString(groceryArray));


        // I can place any kind of obj in this array
        ArrayList objList = new ArrayList(15);
        objList.add(new GroceryItem("Butter"));
        objList.add("Yogurt");
        objList.add(5);
//        System.out.println(objList);

        // Create an array list that only accept a kind of object => list only accepts that kind of obj
        ArrayList<GroceryItem> groceryList = new ArrayList<>();
//        groceryList.add("Yogurt");
//        groceryList.add(5);
        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("milk"));
        groceryList.add(new GroceryItem("oranges", "PRODUCE", 5));
        System.out.println("1=== " + groceryList);
        groceryList.add(0, new GroceryItem("apples", "PRODUCE", 6));
        System.out.println("2=== " + groceryList);
        groceryList.set(0, new GroceryItem("Pineapple", "PRODUCE", 3));

        System.out.println("3=== " + groceryList);
        groceryList.remove(1);
        System.out.println("4=== " + groceryList);
        



    }
}
