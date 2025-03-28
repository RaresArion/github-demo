package Section8.Polymorphism.Challenge;

public class ElectricCar extends Car {

    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar (String description, double avgKmPerCharge, int batterySize) {
        super (description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    public double topSpeed () {
        return this.avgKmPerCharge * (this.batterySize / 20);
    }

    @Override
    public void startEngine() {
        System.out.println(" -> EV is being started by the full of himself dude");
//        super.runEngine();
    }
}
