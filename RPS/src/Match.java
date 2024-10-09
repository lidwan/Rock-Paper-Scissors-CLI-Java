import java.util.Scanner;

public class Match {
    private final Scanner scanner;


    public Match() {
        scanner = new Scanner(System.in);

    }
    public void getUserInput(Player player) {
        String input;
        do {
            System.out.println("Please Enter in your choice (rock, paper or scissors): ");
            input = scanner.next().trim().toLowerCase();
        } while (!input.equals("rock") && !input.equals("paper") && !input.equals("scissors"));

        player.setChoice(input);
    }

    public void detWinner(String choice, String computerChoice) { //1 user one, 0 user lost, 3 tie.

        //handling tie
        if (choice.equals(computerChoice)) {
            System.out.println("It's a Tie!");
            return;
        }


        //handling user winning
        if (choice.equals("rock") && computerChoice.equals("scissors") ||
            choice.equals("paper") && computerChoice.equals("rock") ||
            choice.equals("scissors") && computerChoice.equals("paper")) {

            System.out.println("You Won! Computer chose "+computerChoice+".");
            return;
        }

        //handling user losing
        System.out.println("You lost :( Computer chose "+computerChoice+".");
    }


    public void play(Player player, Computer computer) {
        getUserInput(player);
        computer.makeChoice();

        detWinner(player.getChoice(), computer.getChoice());
    }
}
