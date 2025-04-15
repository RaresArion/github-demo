package Section12.FirstGenericVideo166;

import java.util.ArrayList;
import java.util.List;

public class Team<T> {

    private String teamName;
    private List<T> teamMembers = new ArrayList<>();
    private int totalWins = 0;
    private int totalLosses = 0;
    private int totalTies = 0;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public void addTeammember (T t) {
        if (!teamMembers.contains(t)) {
            teamMembers.add(t);
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

