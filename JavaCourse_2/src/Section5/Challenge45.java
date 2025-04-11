package Section5;

public class Challenge45 {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.printf("Your final score was: %d\n", finalScore);
        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        finalScore = score;
        if(gameOver) {
            finalScore += levelCompleted * bonus;
            System.out.printf("Your final score is: %d", finalScore);
        }
    }
}
