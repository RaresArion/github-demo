package Section12.V167MultipleGenerics;

import java.util.ArrayList;
import java.util.List;

/*
*   S (affiliation) can be anything (EX: String, StringBuilder, Interface, Class, Record)
* */

record Affiliation (String name, String type, String countryCode) {
    @Override
    public String toString() {
        return this.name + " (" + this.type + " in " + this.countryCode + ")";
    }
}

public class Team<T extends Player, S> {

    private String teamName;
    private List<T> teamMembers = new ArrayList<>();
    private int totalWins = 0;
    private int totalLosses = 0;
    private int totalTies = 0;

    private S affiliation;


    public Team(String teamName) {
        this.teamName = teamName;
    }

    public Team(String teamName, S affiliation) {
//        this.teamName = teamName;
        this(teamName);
        this.affiliation = affiliation;
    }

    public void addTeammember (T t) {
        if (!teamMembers.contains(t)) {
            teamMembers.add(t);
        }
    }

    public void listTeamMembers () {
        System.out.print(this.teamName + " Roster:");
        System.out.println((affiliation == null) ? "" : " AFFILIATION: " + this.affiliation);
//        System.out.println(this.teamMembers);
        for (T t : this.teamMembers) {
            System.out.println(t.name());
        }
    }

    public int ranking () {
        return (this.totalLosses * 2) + this.totalTies + 1;
    }

    public String setScore (int ourScore, int theirScore) {
        String message = "lost to";
        if (ourScore > theirScore) {
            this.totalWins++;
            message = "beat";
        } else if (ourScore == theirScore) {
            this.totalTies++;
            message = "tied";
        } else {
            this.totalLosses += 1;
        }
        return message;
    }

    @Override
    public String toString() {
        return this.teamName + " (Ranked " + this.ranking() + ")";
    }
}

