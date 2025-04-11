package Section11.Interfaces;

public class Bird extends Animal implements FlightEnabled, Trackable {

    @Override
    public void takeOff() {
        System.out.println(this.getClass().getSimpleName() + " is taking off");
    }

    @Override
    public void land() {
        System.out.println(this.getClass().getSimpleName() + " lands");
    }

    @Override
    public void fly() {
        System.out.println(this.getClass().getSimpleName() + " flies");
    }

    @Override
    public void track() {
        System.out.println(this.getClass().getSimpleName() + " is tracking something");
    }


    @Override
    public void move() {
        System.out.println("Class Bird is moving");
    }

    public void eat() {
        System.out.println("Class bird is eating");
    }
}
