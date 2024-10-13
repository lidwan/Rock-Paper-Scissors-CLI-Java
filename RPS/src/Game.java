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

    public void start(){
        while (playMatch()) {
            match.play(player, computer);
            numOfMatches++;
        }
    }
}
