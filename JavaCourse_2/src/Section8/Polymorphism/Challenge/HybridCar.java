package Section8.Polymorphism.Challenge;

public class HybridCar extends Car{

    private double avgKmPerLitre;
    private int batterySize, cylinders;

    public HybridCar(String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public void tonnage() {
        if (this.batterySize > 130 && this.cylinders > 1600) {
            System.out.println("This " + getClass().getSimpleName() + " is a heavy but powerful car");
        } else {
            System.out.println("This " + this.getClass().getSimpleName() + " is small and agile");
        }
    }
}
