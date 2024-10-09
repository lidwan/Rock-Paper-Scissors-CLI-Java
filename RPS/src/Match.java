import javax.xml.crypto.dsig.XMLObject;
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

    public void detWinner(Player player, Computer computer) { //1 user one, 0 user lost, 3 tie.

        //handling tie
        if (player.getChoice().equals(computer.getChoice())) {
            System.out.println("It's a Tie!");
            return;
        }


        //handling user winning
        if (player.getChoice().equals("rock") && computer.getChoice().equals("scissors") ||
            player.getChoice().equals("paper") && computer.getChoice().equals("rock") ||
            player.getChoice().equals("scissors") && computer.getChoice().equals("paper")) {

            player.encScore();
            System.out.println("You Won! Computer chose "+computer.getChoice()+".");
            return;
        }

        //handling user losing
        computer.encScore();
        System.out.println("You lost :( Computer chose "+computer.getChoice()+".");
    }


    public void play(Player player, Computer computer) {
        getUserInput(player);
        computer.makeChoice();

        detWinner(player, computer);
    }
}
