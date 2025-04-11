package Section11.AbstractClasses.Challenge.Example;

public class Furniture extends ProductForSale{

    public Furniture(String type, String description, double price) {
        super(type, description, price);
    }

    @Override
    public void showDetails() {
        System.out.println("This " + type + " was manufactured in North Bucovina");
        System.out.printf("The price of the piece is $%6.2f %n", price);
        System.out.println(description);
    }
}
