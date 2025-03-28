package Section7.Inheritance;

public class Animal {

    protected String type; // any subclass can access this filed
    private String size; // no other class can access this filed
    private double weight;

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public Animal () {}

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void move (String speed) {
        System.out.println(this.type + " moves " + speed);
    }

    public void makeNoise () {
        System.out.println(this.type + " makes some kind of noise");
    }
}
