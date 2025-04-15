package Section12.FirstGenericVideo166;

interface Player {

}

record BaseballPlayer(String name, String position) implements Player {}

record FootballPlayer(String name, String position) implements Player {}

public class Main {
    public static void main(String[] args) {
//        BaseballTeam philies1 = new BaseballTeam("Philadelphia Phillis");
//        BaseballTeam astros1 = new BaseballTeam("Houston Astros");
//        scoreReslt(philies1, 3, astros1, 5);

//        SportsTeam philies2 = new SportsTeam("Philadelphia Phillis");
//        SportsTeam astros2 = new SportsTeam("Houston Astros");
//        scoreReslt(philies2, 3, astros2, 5);

        Team<BaseballPlayer> philies = new Team<>("Philadelphia Phillis");
        Team<BaseballPlayer> astros = new Team<>("Houston Astros");
        scoreReslt(philies, 3, astros, 5);

        var harper = new BaseballPlayer("B Harper", "Right Fielder");
        var marsh = new BaseballPlayer("B marsh", "Right Fielder");
//        philies.addTeammember(harper);
//        philies.addTeammember(marsh);
//        philies.listTeamMembers();

//        Football team
        SportsTeam afc = new SportsTeam("Adelaide Crows");
        var tex = new FootballPlayer("Tex Walker", "Centre half forward");
        afc.addTeammember(tex);
        afc.listTeamMembers();

        Team<FootballPlayer> afc1 = new Team<>("Adelaide Crows");
        afc1.addTeammember(tex);
        // afc1.addTeammember(harper);



        // Using generic classes with Wrapper classes
        System.out.println("-".repeat(30));
        Team<String> adelaide = new Team<>("Adelaide Storm");
        adelaide.addTeammember("N Robers");
        adelaide.listTeamMembers();

        var canberra = new Team<String>("Canberra Heat");
        canberra.addTeammember("B Black");
        canberra.listTeamMembers();
        scoreReslt(canberra, 0, adelaide, 1);

        Team<Integer> melbourneVB = new Team<Integer>("Melbourne Vipers");
        System.out.println("-".repeat(30));

    }
    public static void scoreReslt (Team team1, int t1_score,
                                   Team team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    public static void scoreReslt (SportsTeam team1, int t1_score,
                                   SportsTeam team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    public static void scoreReslt (BaseballTeam team1, int t1_score,
                                   BaseballTeam team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }
}
