package Section5.Challenge49;

public class Main {
    public static void main(String[] args) {
        DisplayHigh dHS = new DisplayHighScore("Adeluta", 123);
        dHS.displayHighScorePosition();
        new DisplayHighScore("Rares", 599).displayHighScorePosition();
    }
}
