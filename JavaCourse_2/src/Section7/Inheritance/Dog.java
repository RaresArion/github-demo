package Section7.Inheritance;

public class Dog extends Animal{

    private String earShape;
    private String tailShape;

    public Dog () {
        super("Mutt", "Big", 50);
    }

    public Dog (String type, double weight) {
        this(type, weight, "Perky", "Curled");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    @Override
    public void makeNoise() {
        if (this.type.equals("Wolf")) {
            System.out.println("Ow Woooo!");
        }
        bark();
        System.out.println();
    }

    @Override
    public void move(String speed) {
        System.out.println("Smth");
        super.move(speed);
//        System.out.println("Dogs walk, run and wag their" +
//                " tail");
        if (speed.equals("slow")) {
            walk();
            wagTail();
        } else {
            run();
            bark();
        }
        System.out.println();
    }

    private void bark () {
        System.out.print("Woof! ");
    }
    private void run () {
        System.out.print("Dog Running ");
    }
    private void walk () {
        System.out.print("Dog Walking ");
    }
    private void wagTail () {
        System.out.print("Tail Wagging ");
    }
}
