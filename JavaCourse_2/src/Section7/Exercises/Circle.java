package Section7.Exercises;

public class Circle {

    private double radius;

    public Circle (double radius) {
        this.radius = radius < 0 ? 0 : radius;
    }

    public double getRadius () {
        return this.radius;
    }

    public double getArea () {
        return Math.pow(this.radius, 2) * Math.PI;
    }
}
