package Section12.V165;

record BaseballPlayer(String name, String position) {}

public class Main {
    public static void main(String[] args) {
        BaseballTeam philies = new BaseballTeam("Philadelphia Phillis");
        BaseballTeam astros = new BaseballTeam("Houston Astros");
        scoreReslt(philies, 3, astros, 5);

        var harper = new BaseballPlayer("B Harper", "Right Fielder");
        var marsh = new BaseballPlayer("B marsh", "Right Fielder");
        philies.addTeammember(harper);
        philies.addTeammember(marsh);
        philies.listTeamMembers();
    }

    public static void scoreReslt (BaseballTeam team1, int t1_score,
                                   BaseballTeam team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }
}
