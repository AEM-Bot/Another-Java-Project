import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        System.out.println(Math.round(11.00d/3.00d));
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long average;
        int counter = 0;
        while (true) {
            boolean isIntValid = scanner.hasNextInt();
            if (isIntValid) {
                int number = scanner.nextInt();
                sum += number;
                counter++;
            } else {
                break;
            }
            scanner.nextLine();
        }
        if (counter == 0) {
            System.out.println("SUM = " + 0 + " AVG = " + 0);
        } else {
            average = Math.round(((double)(sum) / counter));
            System.out.println("SUM = " + sum + " AVG = " + average);
        }
        scanner.close();
    }
}