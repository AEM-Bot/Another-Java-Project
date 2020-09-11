public class DecimalComparator {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.1756, 3.175));

    }

    public static boolean areEqualByThreeDecimalPlaces
            (double firstDecimal, double secondDecimal) {

        firstDecimal = firstDecimal * 1000;
        secondDecimal = secondDecimal * 1000;
        int myFirstDecimal = (int) firstDecimal;
        int mySecondDecimal = (int) secondDecimal;
        if (myFirstDecimal == mySecondDecimal) {
            return true;
        }
        return false;
    }
}