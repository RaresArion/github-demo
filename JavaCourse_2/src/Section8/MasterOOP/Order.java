package Section8.MasterOOP;

public class Order {

    private Burger burger;
    private Drink drink;
    private SideItem sideItem;
    private Extras extras;
    private int orderNr;
    private static int nrOfOrders;
//
//    private Order () {
//        this (new Burger(), new Drink(), new SideItem(), new Extras());
//    }

    private Order(Burger burger, Drink drink,
                 SideItem sideItem, Extras extras) {
        this.burger = burger;
        this.drink = drink;
        this.sideItem = sideItem;
        this.extras = extras;
        this.orderNr = nrOfOrders;
    }

    // use composition to add:
    //      - a type of burger / drink / side / extras

    // create a factory for meals
    public static Order getOrder () {
        return getOrder("Normal", "Small",
                "Coke", "Fries");
    }

    public static Order getOrder (String burgerType, String size, String drink,
                                  String sideItem) {
        nrOfOrders++;
        return new Order(new Burger(burgerType),
                         new Drink(drink, size),
                         new SideItem(sideItem, size),
                         new Extras());
    }

    public static Order getOrder (String burgerType, String size, String drink,
                                  String sideItem, String extraType) {
        nrOfOrders++;
        return new Order (new Burger(burgerType),
                          new Drink(drink, size),
                          new SideItem(sideItem, size),
                new Extras(burgerType, extraType));
    }

    public static Order getOrder (String burgerType, String size, String drink,
                                  String sideItem, String extraType1, String extraType2) {
        nrOfOrders++;
        return new Order (new Burger(burgerType),
                          new Drink(drink, size),
                          new SideItem(sideItem, size),
                          new Extras(burgerType, extraType1, extraType2));
    }

    public static Order getOrder (String burgerType, String size, String drink,
                                  String sideItem, String extraType1, String extraType2, String extraType3,
                                  String extraType4) {
        nrOfOrders++;
        return new Order(new Burger(burgerType),
                new Drink(drink, size),
                new SideItem(sideItem, size),
                new Extras(burgerType, extraType1, extraType2, extraType3, extraType4));
    }

    public static Order getOrder (String burgerType, String size, String drink,
                                  String sideItem, String extraType1, String extraType2, String extraType3) {
        nrOfOrders++;
        return new Order(new Burger(burgerType),
                new Drink(drink, size),
                new SideItem(sideItem, size),
                new Extras(burgerType, extraType1, extraType2, extraType3));
    }

    public static Order getOrder (String burgerType, String size, String drink,
                                  String sideItem, String extraType1, String extraType2, String extraType3,
                                  String extraType4, String extraType5) {
        nrOfOrders++;
        return new Order(new Burger(burgerType),
                new Drink(drink, size),
                new SideItem(sideItem, size),
                new Extras(burgerType, extraType1, extraType2, extraType3, extraType4, extraType5));
    }

    public static Order getDeluxe (String extraType1, String extraType2, String extraType3,
                                   String extraType4, String extraType5,
                                   String drink, String sideType) {
        return getOrder("Deluxe Burger", "Big", drink, sideType,
                        (extraType1 != null ? extraType1 : ""),
                        (extraType2 != null ? extraType2 : ""),
                        (extraType3 != null ? extraType3 : ""),
                        (extraType4 != null ? extraType4 : ""),
                        (extraType5 != null ? extraType5 : "")
                        );
    }
    public static Order getDeluxe (String extraType1, String extraType2, String extraType3,
                                     String extraType4,
                                     String drink, String sideType) {
        return getOrder("Deluxe Burger", "Big", drink, sideType,
                (extraType1 != null ? extraType1 : ""),
                (extraType2 != null ? extraType2 : ""),
                (extraType3 != null ? extraType3 : ""),
                (extraType4 != null ? extraType4 : "")
        );
    }

    @Override
    public String toString() {
//        double totalCost = burger.getPrice() + drink.getPrice() + sideItem.getPrice() + extras.getPrice();
        System.out.println(burger.getType());
        if (burger.getType().equals("Deluxe Burger")) {
            System.out.println(" --> TRUE IF");
            return "\tOrder - " + orderNr +": " +
                    "\n" + burger.toString() +
                    ",\n" + drink.toString() +
                    ",\n" + sideItem.toString() +
                    (extras.getType() != null ? ",\n" + extras.toString() : "") +
                    "\nTotal = " + (burger.getPrice() + extras.getPrice()) +
                    "$\n- - - - - - - -";
        } else {
            System.out.println(" --> FALSE IF");
            return "\tOrder - " + orderNr + ": " +
                    "\n" + burger.toString() +
                    ",\n" + drink.toString() +
                    ",\n" + sideItem.toString() +
                    (extras.getType() != null ? ",\n -> " + extras.toString() : "") +
                    "\nTotal = " + (burger.getPrice() + drink.getPrice() + sideItem.getPrice() + extras.getPrice()) +
                    "$\n- - - - - - - -";
        }
    }
}
