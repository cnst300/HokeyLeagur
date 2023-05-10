public class Main {
    public static void main(String[] args) {
        HockeyLeague nhl= new HockeyLeague();
        Team coloradoAvalanche= new Team("ColoradoAvalanche");
        Team washingtonCapitals= new Team("WashingtonCapitals");
        Team tampaBayLighting= new Team("TampaBayLighting");
        Team nashvillePredators= new Team("NashvillePredators");
        Game game1= new Game(new Score(6, 8), coloradoAvalanche, nashvillePredators, "USA");
        Game game2= new Game(new Score(4, 3), washingtonCapitals, tampaBayLighting, "USA");
        Game game3= new Game(new Score(7,6), nashvillePredators, washingtonCapitals,"Romania");
        coloradoAvalanche.addGame(game1);
        nashvillePredators.addGame(game3);
        nashvillePredators.addGame(game1);
        washingtonCapitals.addGame(game2);
        washingtonCapitals.addGame(game3);
        tampaBayLighting.addGame(game2);
        game1.processOutcome();
        game2.processOutcome();
        game3.processOutcome();
        nhl.addTeam(coloradoAvalanche);
        nhl.addTeam(tampaBayLighting);
        nhl.addTeam(washingtonCapitals);
        nhl.addTeam(nashvillePredators);
        System.out.println(nhl.getTeamWithMostVictories().getName());
        System.out.println(nhl.getWinsForEachTeam());

    }
}
