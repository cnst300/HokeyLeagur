import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Team {
    private Set<Person> teamMembers;
    private String name;
    private List<Game> gameHistory;


    public Set<Person> getTeamMembers() {
        return teamMembers;
    }

    public String getName() {
        return name;
    }

    public List<Game> getGameHistory() {
        return gameHistory;
    }


    public Team(String name) {
        this.name = name;
        this.gameHistory= new ArrayList<>();
        this.teamMembers= new HashSet<>();
    }

    public void addMember(Person p){
        teamMembers.add(p);
    }

    public void addGame(Game g){
        gameHistory.add(g);
    }

    public int getNumberOfVictories(){
        int count=0;
        for (Game g: gameHistory){
            if(g.getOutcome().equals(Outcome.TEAM1) && g.getTeam1().getName().equals(name)){
                count++;
            }else if(g.getOutcome().equals(Outcome.TEAM2) && g.getTeam2().getName().equals(name)){
                count++;
            }
        }
        return count;
    }

}
