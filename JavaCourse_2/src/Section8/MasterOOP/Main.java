package Section8.MasterOOP;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static String[] arr;
    static Order o;
    public static void main(String[] args) {

//        Burger b = new Burger("Deluxe Burger");
//        Extras e = new Extras("Deluxe Burger", "Tomatoes",
//                "Fries", "Peppers", "Sauces", "Pickles");
//        System.out.println(e);
//        System.out.println("- - - - - -");
        Order o1 = Order.getDeluxe("Tomatoes",
                "Fries", "Peppers",
                "Pickles", "Coke", "Onions");
        System.out.println(o1);
        System.out.println("- - - - - -");
        Order o2 = Order.getOrder("Vegan", "Medium",
                "Mineral Water", "Onions",
                "Pickles", "Fries", "Tomatoes", "Sauces");

        System.out.println(o2);



//        Extras e = new Extras("Fries", "Peppers");
//        Order o1 = Order.getOrder("Cheeseburger", "normal",
//                                  "Mineral Water", "Onions", "Pickles", "Sauces");
//        Order o2 = Order.getOrder("Cheeseburger", "normal",
//                "Mineral Water", "Onions", "Pickles", "Sauces", "Pickles");
//        Order o3 = Order.getOrder("Cheeseburger", "normal",
//                "Mineral Water", "Onions", "Tomatoes");
//        Order o4 = Order.getOrder("Cheeseburger", "normal",
//                "Mineral Water", "Onions");
//        Order o5 = Order.getOrder("Double Cheeseburger", "Big",
//                "Mineral Water", "Coleslaw Salad", "Tomatoes", "Tomatoes", "Tomatoes");

//        String extraType1, String extraType2,
//                String extraType3, String drink, String sideType

//        Order o = Order.getDeluxe("Sauces", "Fries",
//                                  "Coke", "Onions");


//        System.out.println(o);


//        System.out.println(o);
//        System.out.println(o1);
//        System.out.println(o2);
//        System.out.println(o3);
//        System.out.println(o4);
//        System.out.println(o5);


//
//        while (true) {
//            System.out.println("Order! (y/default/N/Deluxe Burger): ");
//            String x = scanner.nextLine();
//            if (x.equals("N")) {
//                break;
//            } else if (x.equals("y")) {
//
//                System.out.println("What burger would you like?");
//                arr = new String[] {"Cheeseburger", "Double Cheeseburger",
//                        "Vegan", "Normal"};
//                String burgerType = order(arr);
//
//                System.out.println("What drink would you like?");
//                arr = new String[] {"Coke", "Fanta",
//                        "Sprite", "Tap Water", "Mineral Water"};
//                String drinkType = order(arr);
//
//                System.out.println("What side would you like?");
//                arr = new String[] {"Fries", "Onions",
//                        "Coleslaw Salad"};
//                String sideType = order(arr);
//
//                System.out.println("What size?");
//                arr = new String[] {"Small", "Normal",
//                        "Big"};
//                String size = order(arr);
//
//
//                System.out.println("Your order is: ");
//                System.out.printf(" - %s%n".repeat(3), burgerType, drinkType, sideType);
//
//                o = Order.getOrder(burgerType, size, drinkType, sideType);
//                System.out.println(o);
//            } else if (x.equals("default")) {
//                o = Order.getOrder();
//                System.out.println(o);
//            } else if (x.equals("Deluxe Burger")) {
//
//                System.out.println("What drink would you like?");
//                arr = new String[] {"Coke", "Fanta",
//                        "Sprite", "Tap Water", "Mineral Water"};
//                String drinkType = order(arr);
//
//                System.out.println("What side would you like?");
//                arr = new String[] {"Fries", "Onions",
//                        "Coleslaw Salad"};
//                String sideType = order(arr);
//
//                System.out.println("What extras? (extra 1)");
//                arr = new String[] {"Pickles", "Fries",
//                        "Tomatoes", "Sauces", "Peppers"};
//                String extra1 = order(arr);
//                System.out.println("What extras? (extra 2)");
//                arr = new String[] {"Pickles", "Fries",
//                        "Tomatoes", "Sauces", "Peppers"};
//                String extra2 = order(arr);
//
//                o = Order.getDeluxe(extra1, extra2, drinkType, sideType);
//                System.out.println(o);
//            }
//        }


//        Order o1 = Order.getOrder();
//        (String burgerType, String size, String drink, String sideItem)
//        Order o2 = Order.getOrder("Cheeseburger", "big", "fanta", "onions");
//        Order o3 = Order.getOrder("Vegan", "big", "fanta", "onions", "pickles");
//
//        ArrayList<Order> list = new ArrayList<>();
//        list.add(o1);
//        list.add(o2);
//        list.add(o3);
//
//
//
//        for (Order o : list) {
//            System.out.println(o);
//        }


    }

    public static String order(String[] arr) {
        String allItems = "";
        String itemType = "";
        while (true) {
            for (String s : arr) {
                System.out.println(" - " + s);
                allItems += s;
            }
            System.out.println(allItems);
            itemType = scanner.nextLine();
            if (allItems.contains(itemType) || itemType.isEmpty()) {
                break;
            } else {
                System.out.println("Item NOT on the menu");
            }
        }
        return itemType;
    }

}
