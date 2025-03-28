package Section8.MasterOOP;

public class Drink {

    // SIZE: 3 sizes
    private String size;
    private String type;
    private double price;

    public Drink() {
        this("Coke", "Small");
    }

    public Drink(String type, String size) {
        this.size = size;
        this.type = type;
        switch (size) {
            case "Medium" -> this.price = 2;
            case "Big" -> this.price = 3;
            default -> this.price = 1;
        }
    }

    @Override
    public String toString() {
        return "Drink = " + this.size + " " + this.type + " " + this.price;
    }

    public double getPrice() {
        return price;
    }

    // PRICE:

    // TYPES of drinks
    // - coke (default)
    // - fanta
    // - sprite
    // - water tap / sparkling

}
