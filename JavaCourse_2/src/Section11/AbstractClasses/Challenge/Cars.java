package Section11.AbstractClasses.Challenge;

public class Cars extends ProductForSale {

    public Cars (String type, String description, double price) {
        super (type, description, price);
    }

    public void showDetails () {
        System.out.println("Car: \t\t" + this.type + " (" + this.description + ") -> " + this.price + "$");
    }
}
