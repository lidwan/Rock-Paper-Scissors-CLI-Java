public class Player {
    private String choice;
    private int score;


    public Player() {
        score = 0;
    }
    public void setChoice(String choice) {
        this.choice = choice;
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
