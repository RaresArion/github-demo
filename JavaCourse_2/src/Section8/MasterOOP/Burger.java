package Section8.MasterOOP;

public class Burger {

    // constructor only has burger type and price
    private String type;
    private double price;

    // default constructor:
    public Burger () {
        this ("normal");
    }

    public Burger (String type) {
        this.type = type;
        switch (type) {
            case "Cheeseburger" -> this.price = 2;
            case "Double Cheeseburger" -> this.price = 3;
            case "Vegan" -> this.price = 2.5;
            case "Deluxe Burger" -> this.price = 20.00;
            default -> this.price = 1.95;
        };
    }

    @Override
    public String toString() {
        return "Burger = " + this.type + " " + this.price;
    }

    public double getPrice () {
        return this.price;
    }

    public String getType() {
        return this.type;
    }
    // PRICE:

    // TYPES of burgers
    //  - Cheeseburger
    //  - 2x cheese
    //  - vegan
    //  - normal (default)

    // You should be able to add up to 3 types of extras

    // Deluxe burger:
    //  - no charge for extras
    //  - up to 2 extras
    //  - fixed price


}

