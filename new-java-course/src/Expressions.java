public class Expressions {
    public static void main(String[] args) {
        int mySecondNumber = 12;
        int myThirdNumber = 6;
        int myFirstNumber = (10 + 5) + (2 * 10);
        System.out.println(myFirstNumber);

        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println(myTotal);

        myFirstNumber = (mySecondNumber + myThirdNumber) + (mySecondNumber * myThirdNumber);
        System.out.println(myFirstNumber);

        int myLastOne = 1000 - myTotal;
        System.out.println(myLastOne);


    }
}
