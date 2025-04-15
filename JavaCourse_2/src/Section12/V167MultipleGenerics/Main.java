package Section12.V167MultipleGenerics;

interface Player {

    String name();
}

record BaseballPlayer(String name, String position) implements Player {}

record FootballPlayer(String name, String position) implements Player {}

record VoleyballPlayer(String name, String position) implements Player {}

/*
*   Add upper bound to limit the usage of the class "Team<T extends Player, Affiliation>"
*       also this is why I can use name() inside the Team class
*
*
* */

public class Main {
    public static void main(String[] args) {
//        System.out.println("-".repeat(30));
//        Team<BaseballPlayer, Affiliation> clug = new Team<>("C Napoca");
//        clug.addTeammember(new BaseballPlayer("P Etronel", "Mid Fielder"));
//        clug.listTeamMembers();
//
//        System.out.println("-".repeat(30));
//        Team<FootballPlayer, Affiliation> ct = new Team<>("Constanta");
//        ct.addTeammember(new FootballPlayer("M Arcelo", "GK"));
//        ct.listTeamMembers();

//        Affiliation philly = new Affiliation("city", "Philadelphia, PA", "US");
        var philly = new Affiliation("city", "Philadelphia, PA", "US");

        System.out.println("-".repeat(30));
        Team<BaseballPlayer, Affiliation> phillies = new Team<>("Philadelphia Philies", philly);
        phillies.addTeammember(new BaseballPlayer("N Roberts", "Setter"));
        phillies.listTeamMembers();

        System.out.println("-".repeat(30));
        Team<VoleyballPlayer, String> adelaide = new Team<>("Adelaide Storm", "City of Adelaide, South Australia, in AU");
        adelaide.addTeammember(new VoleyballPlayer("N Roberts", "Setter"));
        adelaide.listTeamMembers();

//        System.out.println("-".repeat(30));
//        var canberra = new Team<VoleyballPlayer, Affiliation>("Canberra Heat");
//        canberra.addTeammember(new VoleyballPlayer("B Black", "Opposite"));
//        canberra.listTeamMembers();

        System.out.println("-".repeat(30));
//        scoreReslt(adelaide, 0, canberra, 1);

    }

    public static void scoreReslt (Team team1, int t1_score,
                                   Team team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }
}
