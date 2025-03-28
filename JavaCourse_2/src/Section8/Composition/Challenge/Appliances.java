package Section8.Composition.Challenge;

public class Appliances {

    private boolean hasWorkToDo;


}

class Refrigerator extends Appliances {

    private boolean hasWorkToDo;

    public Refrigerator (boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood() {
        if (this.hasWorkToDo) {
            System.out.println("Getting food for master");
            this.hasWorkToDo = false;
        } else {
            System.out.println("I am NOT COOKING any FOOD");
        }
    }

    public void setHasWorkToDo(boolean a) {
        this.hasWorkToDo = a;
    }

    public boolean getHasWorkToDoFromCoffee () {
        return this.hasWorkToDo;
    }
}

class DishWasher extends Appliances {

    private boolean hasWorkToDo;
    public DishWasher(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes() {
        if (this.hasWorkToDo) {
            System.out.println("Washing dishes for the beautiful master");
            this.hasWorkToDo = false;
        } else {
            System.out.println("I am NOT WASHING any DISHES");
        }
    }

    public void setHasWorkToDo(boolean a) {
        this.hasWorkToDo = a;
    }

    public void getHasWorkToDoFromCoffee () {
        System.out.println("Is the Dish Washer working? " + this.hasWorkToDo);
    }
}

class CoffeeMaker extends Appliances {

    private boolean hasWorkToDo;
    public CoffeeMaker(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee() {
        if (this.hasWorkToDo) {
            System.out.println("Here is your coffee! Oh! YOU MIGHTY MASTER");
            this.hasWorkToDo = false;
        } else {
            System.out.println("I am NOT brewing any COFFEE");
        }
    }

    public void setHasWorkToDo (boolean a) {
        this.hasWorkToDo = a;
    }

    public boolean getHasWorkToDoFromCoffee () {
        return this.hasWorkToDo;
    }
}
