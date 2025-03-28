package Section11.AbstractClasses.Challenge;

public class Laptops  extends ProductForSale {

    public Laptops (String type, String description, double price) {
        super (type, description, price);
    }

    public void showDetails () {
        System.out.println("Laptop: \t" + this.type + " (" + this.description + ") -> " + this.price);
    }
}
