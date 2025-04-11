package Section11.AbstractClasses.Challenge.Example;

import java.util.ArrayList;

record OrderItem (int qty, ProductForSale product) {

}

public class Store {

    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();

    public static void main(String[] args) {

        storeProducts.add(new ArtObject("Oil Painting", "Impressionistic work by ABF painted in 2010", 1350));
        storeProducts.add(new ArtObject("Sculpture", "Bronze work by JKF, produce in 1950", 2000));
        storeProducts.add(new Furniture("Desk", "Mahogany Desk", 500));
        storeProducts.add(new Furniture("Lamp", "Tiffany Lamp with Hummingbirds", 500));
        listProducts();

        System.out.println("\nOrder 1");
        var order1 = new ArrayList<OrderItem>();
        addItemToOrder(order1, 1, 2);
        addItemToOrder(order1, 0, 1);
        addItemToOrder(order1, 2, 1);
        addItemToOrder(order1, 3, 1);
        printOrder(order1);

    }

    public static void listProducts() {
        for (var item : storeProducts) {
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }

    public static void addItemToOrder (ArrayList<OrderItem> order, int orderIndex, int qty) {
        order.add(new OrderItem(qty, storeProducts.get(orderIndex)));
    }

    public static void printOrder (ArrayList<OrderItem> order) {

        double salesTotal = 0;
        for (var item : order) {
            item.product().printPricedItem(item.qty());
            salesTotal += item.product().getSalesPrice(item.qty());
        }
        System.out.printf("Sales Total = $%6.2f %n", salesTotal);
    }
}
