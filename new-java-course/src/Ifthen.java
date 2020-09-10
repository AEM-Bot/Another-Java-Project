public class Ifthen {

    public static void main(String[] args) {

        boolean isAlien = false;

        //{} always code block for logic
        if (!isAlien) {
            System.out.println("Not an Alien!");
        } else {
            System.out.println("An Alien");
        }

        int topScore = 100;

        if (topScore == 100) {
            System.out.println("Top Score Achieved");
        }

        int lowScore = 40;
        if (lowScore != 40) { //not operator
            System.out.println("Low Score Achieved");
        }

        int newTopScore = 80;
        int secondTopScore = 81;
        if ((newTopScore > secondTopScore) && (newTopScore < 100)) {
            System.out.println("TopScore is " + newTopScore);
        }

        //always make clear about the paranthesis for code clarity

        if ((newTopScore > secondTopScore) || (newTopScore < 100)) {
            System.out.println("Logical OR Operator " + newTopScore);
        }


        boolean isCar = false;
        if (isCar) {
            System.out.println("This is not supposed to happen");
        }
        isCar = true;
        //ternary operator
        boolean wasCar = isCar ? true : false;

        if (wasCar) {
            System.out.println("was car is true");
        }

        System.out.println(wasCar);

        int ageOfClient = 20;

        boolean isEighteenOver = ageOfClient == 20 ? true : false;

        String testString = ageOfClient == 20 ? "Sasanka" : ""; //ternary for different data types


        if (isEighteenOver) {
            System.out.println("yes Over Eighteen");
        }
    }
}
