package Section8.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Raresul", "Mallet", 99);
        Player player2 = new Player("Raresul", "Mallet", 100);
        Player player3 = new Player("Raresul", "Mallet", 101);
        Player player4 = new Player("Raresul", "Mallet", 0);
        Player player5 = new Player("Raresul", "Mallet", -1);
        Player player6 = new Player("Raresul", "Mallet", 1);

        System.out.println(player1.healthRemaining());
        System.out.println(player2.healthRemaining());
        System.out.println(player3.healthRemaining());
        System.out.println(player4.healthRemaining());
        System.out.println(player5.healthRemaining());
        System.out.println(player6.healthRemaining());

    }
}
