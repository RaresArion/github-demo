package Section5.Ex1;

public abstract class Ex1Intf {

    abstract int getNr();

    void checkNumbers(Ex1Intf obj) {
        System.out.printf("%d is ", obj.getNr());
        int REFER = 0;
        if (obj.getNr() > REFER) {
            System.out.println("Positive");
            return;
        } else if (obj.getNr() < REFER) {
            System.out.println("Negative");
            return;
        }
        System.out.println("Zero");
    }
}
