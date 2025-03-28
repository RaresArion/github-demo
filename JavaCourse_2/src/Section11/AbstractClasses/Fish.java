package Section11.AbstractClasses;

public class Fish extends Animal{

    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {

        if (speed.equalsIgnoreCase("slow")) {
            System.out.println(this.type + " is lazily swimming");
        } else {
            System.out.println(this.type + " is power swimming, just like D. Popovici");
        }
    }

    @Override
    public void makeNoise() {
        if (this.type.equalsIgnoreCase("Goldfish")) {
            System.out.println("swish... ");
        } else {
            System.out.println("splash... ");
        }
    }
}
