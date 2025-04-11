package Section5.Ex2;

public class Main {
    public static void main(String[] args) {
        NormalCls nC = new NormalCls();

        System.out.println(nC.toMilesPerHour(-10.25));
        nC.printConversion(10.25);
        nC.printConversion(-10.25);
    }
}
