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

    public void start(){
        while (true) {
            match.play(player, computer);
            numOfMatches++;
        }
    }
}
