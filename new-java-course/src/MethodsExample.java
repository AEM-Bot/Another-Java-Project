public class MethodsExample {

    //methods cannot be inside a method -- one of the most common errors
    public static void main(String[] args) {
        //this highScore maps with the return of calculateScore method
        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println(highScore);
        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println(highScore);
    }

    //method with parameters with no return type(void) -- so can be reused without changing code in lot of places
    //always use methods wherever possible
//    public static void calculateScore(
//            boolean gameOver, int score, int levelCompleted, int bonus) {
//        //logic for method for above if logic duplicate code in code blocks
//        if (gameOver) {
//            int finalScore = score + (levelCompleted * bonus);
//            System.out.println("Your final score was " + finalScore);
//        }
//        else {
//            System.out.println("Your Game is not over yet, continue to play");
//        }
//    }
    //method with parameters --> with int return type
    public static int calculateScore(
            boolean gameOver, int score, int levelCompleted, int bonus) {
        //logic for method for above if logic duplicate code in code blocks
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            return finalScore;
        } else {
            System.out.println("Your Game is not over yet, continue to play");
            return -1; //indicates an error
        }

    }

}
