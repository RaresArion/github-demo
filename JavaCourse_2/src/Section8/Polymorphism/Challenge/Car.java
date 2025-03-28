package Section8.Polymorphism.Challenge;

public class Car {

    private String description;

    public Car (String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println(this.getClass().getSimpleName() + " starts engine");
        this.runEngine();
    }

    public void drive() {
        System.out.println(this.getClass().getSimpleName() + " drives around");
    }

    protected void runEngine() {
        if (this instanceof GasPoweredCar) {
            System.out.println(this.getClass().getSimpleName() + " farts its engine\n");
        } else {
            System.out.println(this.getClass().getSimpleName() + " has its engine running\n");
        }
    }

    public static Car getCar (String description, double avgKm, int battery, int cylinders) {
        description = description.toUpperCase().charAt(0) + description.substring(1);
        System.out.println("Car type in factory method: " + description);
        return switch (description) {
            case "Gas" -> new GasPoweredCar(description, avgKm, cylinders);
            case "Electric" -> new ElectricCar(description, avgKm, battery);
            case "Hybrid" -> new HybridCar(description, avgKm, battery, cylinders);
            default -> new Car(description);
        };
    }

}
