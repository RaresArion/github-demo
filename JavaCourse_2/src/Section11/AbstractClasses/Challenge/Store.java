package Section11.AbstractClasses.Challenge;

import java.util.ArrayList;

public class Store {
    public static void main(String[] args) {

        ArrayList<ProductForSale> displayedItems = new ArrayList<>();
        displayedItems.add(new Cars("Dacia", "Best 1310 in Town", 2400));
        displayedItems.add(new Cars("Renault", "Arkadia", 24000));
        displayedItems.add(new Cars("BMW", "X6", 54000));
        displayedItems.add(new Laptops("Dell", "Latitude", 540));
        displayedItems.add(new Laptops("Alienware", "M15", 800));
        displayedItems.add(new Cars("Audi", "A5", 44020));
        displayedItems.add(new Cars("Dacia", "Logan", 5400));

        for (int i = 0; i < displayedItems.size(); i++) {
            System.out.print("[" + i + "] ");
            displayedItems.get(i).showDetails();
        }
        System.out.println("\n----------------------------------------------\n");

        ArrayList<OrderItem> items2 = new ArrayList<>();
        items2.add(OrderItem.getProduct("Cars", 2, "Audi", "A5", 44020));
        addItem2(items2, OrderItem.getProduct("Laptops", 3, "Dell", "Latitude", 500));
        items2.add(new OrderItem(1, displayedItems.get(6)));
        addItem2(items2, new OrderItem(1, displayedItems.get(5)));
        printItems2(items2);
    }

    public static void addItem2 (ArrayList<OrderItem> items, OrderItem orderedItem) {
        items.add(orderedItem);
        System.out.println(orderedItem.product.type + " was added");
        orderedItem.product.showDetails();
    }

    public static void printItems2 (ArrayList<OrderItem> items) {
        System.out.println("----------------------------------------------");
        double totalPrice = 0.0;
        for (OrderItem item : items) {
            item.product.printPricedItem(item.quantity);
            totalPrice += totalPrice + item.product.getSalesPrice(item.quantity);
        }
        System.out.println("Total cost of: " + totalPrice + " $");
        System.out.println("----------------------------------------------");
    }

}
