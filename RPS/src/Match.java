import java.util.Objects;

public class Match {

    //1 user one, 0 user lost, 3 tie.
    public int userWon(String choice, String computerChoice) {

        //handelling tie
        if (choice.equals(computerChoice))
            return 3;

        //handelling user winning
        if (choice.equals("rock") && computerChoice.equals("scissors") ||
            choice.equals("paper") && computerChoice.equals("rock") ||
            choice.equals("scissors") && computerChoice.equals("paper")) {

            return 1;
        }

        //handelling user losing
        return 0;

    }


    public void play() {

    }
}
