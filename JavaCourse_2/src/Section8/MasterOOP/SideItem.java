package Section8.MasterOOP;

public class SideItem {

    // SIZE: 3 sizes
    private String size;
    private String type;
    private double price;

    public SideItem() {
        this("Fries", "Small");
    }

    public SideItem(String type, String size) {
        this.size = size;
        this.type = type;
        switch (type) {
            case "Onions" -> this.price = 2;
            case "Coleslaw Salad" -> this.price = 3.5;
            default -> this.price = 1.5;
        }
        switch (size) {
            case "Medium" -> this.price = this.price + 2;
            case "Big" -> this.price = this.price + 3;
        }
    }

    @Override
    public String toString() {
        return "Side Dish = " + this.size + " " + this.type + " " + this.price;
    }

    public double getPrice() {
        return price;
    }
}
