public class MethodOverloading {

    public static void main(String[] args) {
        int newScore = calculateScore("sasanka", 500);
        System.out.println("New Score is " + newScore);
        newScore = calculateScore(100);
        System.out.println("Overloaded Method: " + newScore);
        calculateScore();
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " Score " + score + " Points ");
        return score * 1000;
    }

    //overloading --> same method name with one paramater
    public static int calculateScore(int score) {
        System.out.println("Unnamed Player Scored " + score + " Points ");
        return score * 1000;
    }

    //method overloading without parameters passed --so it does nt matter even if the return
    //type changed but it must have different parameters
    public static void calculateScore() {
        System.out.println("No Parameters Passed");
    }
}
