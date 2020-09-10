public class DecimalChallenge {

    public static void main(String[] args) {
        double givenPound = 88.1849d;
        double result = (givenPound * 0.45359237d);

        //double and float should not be used for precision calculations
        //Instead use BigDecimal reference class

        System.out.println("Given Pounds is "
                + givenPound + " Result in Kilograms is " + result);

    }
}
