import java.util.Scanner;

public class GameInterface {

    private final Scanner scanner;

    public GameInterface () {
        scanner = new Scanner(System.in);
    }


    public void welcomeMessage() {
        System.out.println("Welcome to Rock, Paper Scissors!");
        System.out.println("You will play unlimited matches against the computer which plays randomly");
        System.out.println("First to win 3 matches wins the game.");
        System.out.println("Let's begin!");
    }
    public void getUserInput(Player player) {
        String input;
        do {
            System.out.println("Please Enter in your choice (rock, paper or scissors): ");
            input = scanner.next().trim().toLowerCase();
        } while (!input.equals("rock") && !input.equals("paper") && !input.equals("scissors"));

        player.setChoice(input);
    }

    public void announceWinner (String message) {
        System.out.println(message);
    }

    public boolean playAgain() {
        String input;

        do {
            System.out.println("Do you want to play again? (yes / no)");
            input = scanner.next().trim().toLowerCase();
        } while (!input.equals("yes") && !input.equals("no"));

        return input.equals("yes");
    }

    public String detGameWinner(Player player, Computer computer) {
        if (player.getScore() > computer.getScore())
            return "You are an overall winner!";
        return "You lost to the computer, better luck next time.";
    }

    public void gameOverStats(Player player, Computer computer, int numOfMatches){
        System.out.println("You Played a total of "+numOfMatches+"!");
        System.out.println("You won "+player.getScore()+" matches");
        System.out.println("The computer won "+computer.getScore()+" matches");
        System.out.println(detGameWinner(player, computer));
    }




}
