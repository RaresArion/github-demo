package Section8.Polymorphism.Exercise;

public class Ford extends Car {

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine () {
        return super.startEngine();
    }

    @Override
    public String brake() {
        return super.brake();
    }

    @Override
    public String accelerate() {
        return super.accelerate();
    }
}
