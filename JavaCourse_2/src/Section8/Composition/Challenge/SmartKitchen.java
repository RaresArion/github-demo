package Section8.Composition.Challenge;

public class SmartKitchen {

    private Refrigerator iceBox;
    private DishWasher dishWasher;
    private CoffeeMaker coffeeMaster;

    /*
    * No args constructor
    * I am passing class creators to the other constructor*/
    public SmartKitchen () {
        this(new Refrigerator(false), new DishWasher(false),
                new CoffeeMaker(false));
/*
        this.iceBox = new Refrigerator(false);
        this.dishWasher = new DishWasher(false);
        this.coffeeMaster = new CoffeeMaker(false);
*/
    }

    private SmartKitchen (Refrigerator iceBox, DishWasher dishWasher, CoffeeMaker coffeeMaster) {
        this.iceBox = iceBox;
        this.dishWasher = dishWasher;
        this.coffeeMaster = coffeeMaster;
    }

    // getters
    public CoffeeMaker getCoffeeMaker () {
        return this.coffeeMaster;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    // =======

    public void addWater () {
        System.out.println("Smart Kitchen is Adding water");
        this.coffeeMaster.setHasWorkToDo(true);
    }

    public void pourMilk () {
        System.out.println("Smart Kitchen is Pouring Milk");
        this.iceBox.setHasWorkToDo(true);
    }

    public void loadDishwasher () {
        System.out.println("Smart Kitchen is Loading the Dish Washer :>");
        this.dishWasher.setHasWorkToDo(true);
    }

    public void setKitchenState (boolean a, boolean b, boolean c) {
        System.out.printf("Smart Kitchen is Setting its: state %b, %b, %b\n", a, b, c);
        this.coffeeMaster.setHasWorkToDo(a);
        this.iceBox.setHasWorkToDo(b);
        this.dishWasher.setHasWorkToDo(c);
    }

    public void doKitchenWork () {
        System.out.println("\nSmart Kitchen is Doing some work");
        this.coffeeMaster.brewCoffee();
        this.iceBox.orderFood();
        this.dishWasher.doDishes();
    }

    public void getKitchenState () {
        System.out.println("Is coffee master working? " + this.coffeeMaster.getHasWorkToDoFromCoffee());
        this.dishWasher.getHasWorkToDoFromCoffee();
        System.out.println("Is the Fridge working? " + this.iceBox.getHasWorkToDoFromCoffee());
    }
}
