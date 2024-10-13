public class Main {
    public static void main(String[] args) {

        GameInterface gameInterface = new GameInterface();

        do {
            Game game = new Game();
            game.start();
        }while (gameInterface.playAgain());
    }
}