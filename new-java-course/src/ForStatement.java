public class ForStatement {
    public static void main(String[] args) {

        //this is where code becomes complex --For statement helps
        //for loop --> also another version of for loop available --> Enhanced For loop
//        System.out.println("10,000 at 2% interest = "
////                + calculateInterest(10000, 2));
////        System.out.println("10,000 at 3% interest = "
////                + calculateInterest(10000, 3));
////        System.out.println("10,000 at 4% interest = "
////                + calculateInterest(10000, 4));
////        System.out.println("10,000 at 5% interest = "
////                + calculateInterest(10000, 5));


        System.out.println("===== For Loop Begins ====");
        for (int i = 2; i <= 8; i++) {
            System.out.println("10,000 at " + i + "% interest = "
                    + String.format("%.2f", calculateInterest(10000, i)));
            //f - float, d- int, s-string
        }
        System.out.println("===== Reverse Order For Loop ===== ");
        for (int i = 8; i >= 2; i--) {
            System.out.println("10,000 at " + i + "% interest = "
                    + String.format("%.2f", calculateInterest(10000, i)));
            //f - float, d- int, s-string
        }
    }

    //in real world project do not use double instead use BigDecimal for precise calculations
    public static double calculateInterest(double amount, double interestRate) {
        //return Math.round(amount * (interestRate / 100)); //we can use math.round or String format
        return (amount * (interestRate / 100));
    }
}
