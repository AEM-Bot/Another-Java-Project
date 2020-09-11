public class MethodsChallenge {

    public static void main(String[] args) {

        int highScore = calculateHighScorePosition(1500);
        displayHighScorePosition("Sasanka", highScore);
        highScore = calculateHighScorePosition(900);
        displayHighScorePosition("Sasanka", highScore);
        highScore = calculateHighScorePosition(400);
        displayHighScorePosition("Sasanka", highScore);
        highScore = calculateHighScorePosition(50);
        displayHighScorePosition("Sasanka", highScore);
    }

    //challenge
    //method 1 -> parameters playername and playerposition
    //return type void
    public static void displayHighScorePosition(
            String playerName, int playerPosition) {
        System.out.println("Player Name " + playerName + " managed to get into position " +
                playerPosition + " on the high score table");
    }

    //two ways of returning -- usually avoid multiple return statements unless necessary
    public static int calculateHighScorePosition(int playerScore) {
//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500) {
//            return 2;
//        } else if (playerScore >= 100) {
//            return 3;
//        } else {
//            return 4;
//        }
        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;
    }

}
