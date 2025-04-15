public class Tests {
    public static void main(String[] args) {

        String x = "Something";
        String y = "Something";
        String z = "Smth";

        System.out.println(x.compareTo(y));
        System.out.println(x.compareTo(z));

        int xP = 'o';
        int zP = 'm';
        System.out.println(xP + " " + zP + " result = " + (xP - zP));

        Integer a = 5;
        Integer b = 6;
        System.out.println(a.compareTo(b));
    }
}
