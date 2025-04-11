package Section11.AbstractClasses.Challenge;

public abstract class ProductForSale {

    public String type, description;
    public double price;

    public ProductForSale(String type, String description, double price) {
        this.type = type;
        this.description = description;
        this.price = price;
    }

    public double getSalesPrice(int quantity) {
        return quantity * this.price;
    }

    public void printPricedItem (int quantity) {
        System.out.println(this.type + " is " + this.price + " per unit => " + getSalesPrice(quantity) + " $ (" + quantity + "u)");
    }

    public abstract void showDetails ();

}
