import javax.xml.crypto.dsig.XMLObject;
import java.util.Scanner;

public class Match {


    public Match() {
        Scanner scanner = new Scanner(System.in);
    }


    public String detWinner(Player player, Computer computer) { //1 user one, 0 user lost, 3 tie.

        //handling tie
        if (player.getChoice().equals(computer.getChoice())) {

            return "It's a Tie!";
        }


        //handling user winning
        if (player.getChoice().equals("rock") && computer.getChoice().equals("scissors") ||
            player.getChoice().equals("paper") && computer.getChoice().equals("rock") ||
            player.getChoice().equals("scissors") && computer.getChoice().equals("paper")) {

            player.encScore();

            return "You Won! Computer chose "+computer.getChoice()+".";
        }

        //handling user losing
        computer.encScore();

        return "You lost :( Computer chose "+computer.getChoice()+".";
    }


    public void play(Player player, Computer computer,GameInterface gameInterface) {
        gameInterface.getUserInput(player);

        computer.makeChoice();

        gameInterface.announceWinner(detWinner(player, computer));
    }
}
