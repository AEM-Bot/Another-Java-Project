import java.util.Scanner;

public class UserInputChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        int sum = 0;
        while (counter <= 10) {
            System.out.println("Enter number #" + counter + ":");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int inputInteger = scanner.nextInt();
                sum += inputInteger;
            } else {
                System.out.println("Invalid Number ");
            }
            scanner.nextLine();
            counter++;

        }
        scanner.close();
        System.out.println("sum of the numbers entered is : " + sum);
    }
}
