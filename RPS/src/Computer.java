import java.util.Random;

public class Computer {
    private String choice;
    private int score;

    public Computer() {
        score = 0;
    }


    public void makeChoice() {
        Random rand = new Random();

        int num = rand.nextInt(3);

        switch (num){
            case 0:
                choice = "rock";
                break;
            case 1:
                choice = "paper";
                break;
            case 2:
                choice = "scissors";
                break;
        }
    }

    public String getChoice() {
        return choice;
    }

    public void encScore() {
        score++;
    }

    public int getScore() {
        return score;
    }
}
