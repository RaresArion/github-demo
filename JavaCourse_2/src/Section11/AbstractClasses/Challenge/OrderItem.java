package Section11.AbstractClasses.Challenge;

public class OrderItem {

    public int quantity;
    public ProductForSale product;

    public OrderItem (int quantity, ProductForSale product) {
        this.quantity = quantity;
        this.product = product;
    }

    public static OrderItem getProduct(String cls, int quantity, String type, String description, double price) {
        return switch (cls) {
            case "Cars" -> new OrderItem(quantity, new Cars(type, description, price));
            case "Laptops" -> new OrderItem(quantity, new Laptops(type, description, price));
            default -> null;
        };
    }
}
