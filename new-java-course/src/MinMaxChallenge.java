import java.util.Scanner;

public class MinMaxChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;
//        boolean first = true; //boolean is referred to as flag

        while (true) {
            System.out.println("Enter Number:");
            boolean isValidNumber = scanner.hasNextInt();
            if (isValidNumber) {

                int number = scanner.nextInt();
//                if (first) {
//                    first = false;
//                    minNumber = number;
//                    maxNumber = number;
//                }

                if (number > maxNumber) {
                    maxNumber = number;
                }   if (number < minNumber) {
                    minNumber = number;
                }
            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Max Number you entered is  " + maxNumber);
        System.out.println("Min Number you entered is " + minNumber);
        scanner.close();
    }
}
