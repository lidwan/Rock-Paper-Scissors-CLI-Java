import java.util.Scanner;

public class GameInterface {

    private final Scanner scanner;

    public GameInterface () {
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

    public void announceWinner (String message) {
        System.out.println(message);
    }




}
