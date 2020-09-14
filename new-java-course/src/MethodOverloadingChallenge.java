public class MethodOverloadingChallenge {
    public static void main(String[] args) {
        double calculateFeetandInchToCentimeter = calcFeetAndInchesToCentimeters(5, 4);
        System.out.println(calculateFeetandInchToCentimeter);
        calculateFeetandInchToCentimeter = calcFeetAndInchesToCentimeters(64);
        System.out.println(calculateFeetandInchToCentimeter);
        calculateFeetandInchToCentimeter = calcFeetAndInchesToCentimeters(6, 20);
        System.out.println(calculateFeetandInchToCentimeter);
    }


    //method overloading is good practice and common things must use overload wherever possible --Ex: sout
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        double calculatedCentimeters = -1d;
        if ((feet >= 0) && (inches >= 0 && inches <= 12)) {
            //1 foot = 12 inches
            // 1 inch = 2.54cm
            calculatedCentimeters = ((feet * 12 * 2.54d) + (inches * 2.54d));
            return calculatedCentimeters;
        } else {
            return calculatedCentimeters;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        double centimeters = -1d;
        //20 inches 1 feet and 8 inches
        if (inches >= 0) {
            double feet = (int) (inches / 12d);
            int remainingInches = (int) (inches % 12d);
            centimeters = calcFeetAndInchesToCentimeters(feet, remainingInches);
            return centimeters;
        } else {
            return centimeters;
        }
    }
}
