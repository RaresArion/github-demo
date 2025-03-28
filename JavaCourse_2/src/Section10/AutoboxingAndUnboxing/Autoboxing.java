package Section10.AutoboxingAndUnboxing;

public class Autoboxing {
    public static void main(String[] args) {
        int x = 15;
        Integer y = x;
        Integer z = Integer.valueOf(x);
        int a = z;
        int b = y;

//        System.out.println(y.getClass().getSimpleName());
//        System.out.println(z.getClass().getSimpleName());

        System.out.println(getDoubleObj());

    }

    public static Double getDoubleObj () {
        return Double.valueOf(100.00);
    }
    public static Double getDoubleObj2 () {
        double x = 100.00;
        return (Double) x;
    }
}
