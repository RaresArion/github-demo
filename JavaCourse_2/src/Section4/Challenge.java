package Section4;

public class Challenge {
    public static void main(String[] args) {
        double doubleMinVar = 20.00;
        double doubleMaxVar = 80.00;
        double multDouVars = 100.00 * (doubleMinVar + doubleMaxVar);
        double doubleRemaineder = multDouVars % 41.00;
        System.out.println(multDouVars % 40.00);
        boolean bool = (doubleRemaineder == 0.00) ? true : false;
        System.out.println(bool);
        if (!bool) {
            System.out.println("Got some remainder");
            System.out.println(doubleRemaineder);
        } else {
            System.out.println("Did NOT got any remainder");
            System.out.println(doubleRemaineder);
        }
    }
}
