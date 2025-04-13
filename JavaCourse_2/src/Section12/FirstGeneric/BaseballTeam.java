package Section12.FirstGeneric;

import java.util.*;

public class BaseballTeam {

    private String teamName;
    private List<BaseballPlayer> teamMembers = new ArrayList<>();
    private int totalWins = 0;
    private int totalLosses = 0;
    private int totalTies = 0;

    public BaseballTeam (String teamName) {
        this.teamName = teamName;
    }

    public void addTeammember (BaseballPlayer player) {
        if (!teamMembers.contains(player)) {
            teamMembers.add(player);
        }
    }

    public void listTeamMembers () {
        System.out.println(this.teamName + " Roster:");
        System.out.println(this.teamMembers);
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

