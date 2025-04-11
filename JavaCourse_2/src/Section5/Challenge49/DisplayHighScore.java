package Section5.Challenge49;

public class DisplayHighScore implements DisplayHigh{

    private int score;
    public String name;
    public DisplayHighScore (String name, int score) {
        this.score = score;
        this.name = name;
    }

    @Override
    public void displayHighScorePosition() {
        System.out.printf("""
                %s managed to get into position %d on the high score list\n\n""",
                this.name,
                DisplayHigh.super.calculateHighScorePosition(this));
    }



    public int getScore () {
        if (this.score < 0) {
            return 0;
        }
        return this.score;
    }
}
