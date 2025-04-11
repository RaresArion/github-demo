package Section8.MasterOOP;

public class Extras {

    public String type1, type2, type3, type4, type5;
    private double price;


    public Extras(String burger, String type1, String type2, String type3, String type4, String type5) {
        this(burger, type1, type2, type3, type4);
        this.type5 = type5;
        this.price += calculatePrice(type5);
//        System.out.println(type5);
//        System.out.println("Extras 5: " + this.price);
    }

    public Extras(String burger, String type1, String type2, String type3, String type4) {
        this(burger, type1, type2, type3);
        this.type4 = type4;
        this.price += calculatePrice(type4);
//        System.out.println(type4);
//        System.out.println("Extras 4: " + this.price);
    }

    public Extras(String burger, String type1, String type2, String type3) {
        this(burger, type1, type2);
        this.type3 = type3;
        if (!burger.equals("Deluxe Burger")) {
//            System.out.println(type3);
            this.price += calculatePrice(type3);
//            System.out.println("Extras 3: " + this.price);
        }
    }

    public Extras(String burger, String type1, String type2) {
        this(burger, type1);
        this.type2 = type2;
        if (!burger.equals("Deluxe Burger")) {
//            System.out.println(type2);
            this.price += calculatePrice(type2);
//            System.out.println("Extras 2: " + this.price);
        }
    }

    public Extras(String burger, String type1) {
        this.type1 = type1;
        if (!burger.equals("Deluxe Burger")) {
//            System.out.println(type1);
            this.price = calculatePrice(type1);
//            System.out.println("Extras 1: " + this.price);
        }
    }

    private double calculatePrice(String type) {
        return switch (type) {
            case "Pickles" -> 1.0;
            case "Fries" -> 2.0;
            case "Tomatoes" -> 2.5;
            case "Sauces" -> 0.6;
            case "Peppers" -> 0.5;
            default -> this.price = 0.0;
        };
    }

    public Extras() {
        this.type1 = null;
    }


    @Override
    public String toString () {
        return "Extras = " + this.getComposedType() + " " + this.price;
    }

    public String getComposedType () {
        String allExtras = this.type1;
        if (this.type2 != null) {
            allExtras += " " + this.type2;
        }
        if (this.type3 != null) {
            allExtras += " " + this.type3;
        }
        if (this.type4 != null) {
            allExtras += " " + this.type4;
        }
        if (this.type5 != null) {
            allExtras += " " + this.type5;
        }
        return allExtras;
    }

    public String getType() {
        return this.type1;
    }

    public double getPrice() {
        return price;
    }

    public double getPricePerItem(String type) {
        return switch (type) {
            case "Pickles" -> 1.0;
            case "Fries" -> 2.0;
            case "Tomatoes" -> 2.5;
            case "Sauces" -> 0.6;
            case "Peppers" -> 0.5;
            default -> 0.0;
        };
    }
}
