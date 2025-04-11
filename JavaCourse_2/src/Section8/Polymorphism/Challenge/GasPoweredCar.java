package Section8.Polymorphism.Challenge;

public class GasPoweredCar extends Car{

    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar (String description, double avgKmPerLitre, int cylinders) {
        super (description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    private double zeroTo100(double zerTo100) {
        System.out.println(this.getClass().getSimpleName() + " is going from 0 km/h to 100 km/h in " + zerTo100 * 1.65);
        return zerTo100 * 1.65;
    }

    // if zeroTo100 returns a value grater than 50.00 => sport Car
    public void sportCar(double kmTarget) {
        if (this.zeroTo100(kmTarget) > 50.00 && (double) this.cylinders / 1000 > 2.2) {
            System.out.println("This is a sport car, very Cool!");
        } else {
            System.out.println("This is a safe car, very Nice!");
        }
    }
}
