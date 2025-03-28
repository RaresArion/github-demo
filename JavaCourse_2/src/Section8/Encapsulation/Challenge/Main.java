package Section8.Encapsulation.Challenge;

public class Main {
    public static void main(String[] args) {


        Printer p1 = new Printer(99, false);
        Printer p2 = new Printer(100, true);

        for (int i = 0; i < 15; i++) {
            if (p1.printPages(5) <= 0) {
                System.out.println("Printing stopped");
                break;
            }
            System.out.println("P1 printed " + p1.printPages(5) + " pages");
            System.out.println("- - - - - - -");
        }

        System.out.println("\n1===" + p1.addToner(100));
        //System.out.println();
        System.out.println("\n2===" + p1.addToner(55));


    }
}
