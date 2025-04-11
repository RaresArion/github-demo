package Section5.Ex3;

record MultipleTries (int kiloBytes) {

}

public class Main {
    public static void main(String[] args) {
        System.out.println(new NormCls().printMegaBytesAndKiloBytes(2512));
        new MultipleTries(123);
    }
}
