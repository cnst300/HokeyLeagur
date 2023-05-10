public class Game {
    private Score score;
    private Team team1;
    private Team team2;
    private String location;

    public Score getScore() {
        return score;
    }

    public Team getTeam1() {
        return team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public String getLocation() {
        return location;
    }

    public Outcome getOutcome() {
        return outcome;
    }

    private Outcome outcome;

    public Game(Score score, Team team1, Team team2, String location) {
        this.score = score;
        this.team1 = team1;
        this.team2 = team2;
        this.location = location;
        this.outcome = null;
    }

    public void processOutcome(){
        if(score.getTeam1Score()>score.getTeam2Score()){
            this.outcome=Outcome.TEAM1;
        } else if (score.getTeam2Score()> score.getTeam1Score()) {
            this.outcome=Outcome.TEAM2;
        }else{
            this.outcome=Outcome.TIE;
        }
    }
}
