package Section11.AbstractClasses;

public class Dog extends Animal{

    public Dog (String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {

        if (speed.equalsIgnoreCase("slow")) {
            System.out.println(this.type + " is walking");
        } else {
            System.out.println(this.type + " is running");
        }
    }

    @Override
    public void makeNoise() {
        if (this.type.equalsIgnoreCase("Wolf")) {
            System.out.println("Howling! ");
        } else {
            System.out.println("Woof! ");
        }
    }

// Can't override final methods
//    @Override
//    public String getExplicitType() {
//        return "";
//    }
}
