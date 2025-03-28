package Section8.Polymorphism.Exercise;

public class Car {

    private boolean engine;
    private String name;
    private int cylinders, wheels;

    public Car (int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public String startEngine () {
        return this.getClass().getSimpleName() + " -> startEngine()";
    }
    public String accelerate () {
        return this.getClass().getSimpleName() + " -> accelerate()";
    }
    public String brake () {
        return getClass().getSimpleName() + " -> brake()";
    }

    public String getName() {
        return this.name;
    }

    public int getCylinders() {
        return this.cylinders;
    }
}
