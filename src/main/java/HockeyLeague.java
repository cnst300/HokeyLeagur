import java.util.*;

public class HockeyLeague {
    private List<Team> teams;

    public HockeyLeague() {
        this.teams= new ArrayList<>();
    }

    public void addTeam(Team t){
        teams.add(t);
    }

    public Team getTeamWithMostVictories(){
        int highest=0;
        Team winner= null;
        for(Team t: teams){
            if(t.getNumberOfVictories()>highest){
                highest= t.getNumberOfVictories();
                winner=t;
            }
        }
        return winner;
    }

    public Map<Team, Integer> getWinsForEachTeam(){
        Map<Team, Integer> teams= new HashMap<>();
        for (Team t: this.teams){
            teams.put(t, t.getNumberOfVictories());
        }
        return teams;
    }
}
