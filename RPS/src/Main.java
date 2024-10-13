public class Main {
    public static void main(String[] args) {

        GameInterface gameInterface = new GameInterface();

        gameInterface.welcomeMessage();
        do {
            Game game = new Game();

            game.start(gameInterface);
        }while (gameInterface.playAgain());


    }
}