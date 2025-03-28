package Section5.Challenge49;

public interface DisplayHigh {

    int TOP_VALUE = 1000;
    int MIDUP_VALUE = 500;
    int MIDLOW_VALUE = 100;

    void displayHighScorePosition();

    default int calculateHighScorePosition(DisplayHighScore dHS) {
        System.out.println("Something from INTERFACE for " + dHS.name + "\n" + "=".repeat(30));
        if (dHS.getScore() >= TOP_VALUE) {
            return 1;
        } else if (dHS.getScore() >= MIDUP_VALUE) {
            return 2;
        } else if (dHS.getScore() >= MIDLOW_VALUE) {
            return 3;
        }
        return 4;
    }

}
