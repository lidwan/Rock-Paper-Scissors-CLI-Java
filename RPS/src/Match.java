public class Match {

    //1 user one, 0 user lost, 3 tie, 4 something went wrong.
    public int userWon(String choice, String computerChoice) {
        int winner = 4;
        switch (choice) {
            case "rock":
                switch (computerChoice){
                    case "rock":
                        winner =  3; //tie
                        break;
                    case "paper":
                        winner =  0; //user lost
                        break;
                    case "scissors":
                        winner = 1; //user won
                        break;
                }
            break;
            case "paper":
                switch (computerChoice){
                    case "rock":
                        winner = 1; //user won
                        break;
                    case "paper":
                        winner = 3; //tie
                        break;
                    case "scissors":
                        winner = 0; //user lost
                        break;
                }
            break;
            case "scissors":
                switch (computerChoice){
                    case "rock":
                        winner = 0; //user lost
                        break;
                    case "paper":
                        winner = 1; //user won
                        break;
                    case "scissors":
                        winner = 3; //tie
                        break;
                }
            break;
        }
        return winner;
    }


    public void play() {

    }
}
