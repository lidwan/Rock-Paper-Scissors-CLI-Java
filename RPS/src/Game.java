public class Game {
    private int numOfMatches;

    private final Player player;
    private final Computer computer;
    private final Match match;

    public Game(){
        player = new Player();
        computer = new Computer();
        match = new Match();
    }

    public boolean playMatch(){

        return player.getScore() < 3 && computer.getScore() < 3;
    }

    public void start(GameInterface gameInterface){
        while (playMatch()) {
            match.play(player, computer, gameInterface);
            numOfMatches++;
        }
        gameInterface.gameOverStats(player, computer, numOfMatches);
    }
}
