package Section8.Composition.Challenge;

public class Main {
    public static void main(String[] args) {

        SmartKitchen sM1 = new SmartKitchen();

        sM1.getCoffeeMaker().brewCoffee();

//        sM1.getKitchenState();
        sM1.doKitchenWork();
//        sM1.getKitchenState();
        sM1.setKitchenState(true, false, true);
        sM1.doKitchenWork();
    }
}
