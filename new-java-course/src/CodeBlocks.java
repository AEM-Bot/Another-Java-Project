public class CodeBlocks {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;


        if (gameOver = true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        //int savedFinalScore = finalScore;//local variable (finalScore)

        //local variables can only be accessed in that particular code block
        //but global variables can be used anywhere based on the access modifiers
        //this concept in java is called scope of variables

        //Challenge
        //this is more like duplicating code - so one change is not enough
        //need to change all the places
        //so this is where methods come into the picture
        if (gameOver) {
            score = 10000;
            levelCompleted = 8;
            bonus = 200;
            int secondFinalScore = score + (levelCompleted * bonus);
            System.out.println("Your Second Final Score was " + secondFinalScore);
        }
    }
}
