import java.util.Date;
import java.util.Scanner;

public class ReadingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter a number");
//        int myInt = scanner.nextInt();
//        System.out.println("You entered " + myInt);


        //problems using scanner and solutions to over come (-ve values example here)
        System.out.println("Enter your year of birth ");

        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt(); //next int parses integer

            scanner.nextLine(); //handle next line character after integer is a must

            System.out.println("Enter your name ");
            String name = scanner.nextLine();
            int age = 2020 - yearOfBirth;

            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + " Your age is " + age);
            } else {
                System.out.println("You entered wrong birth year.. Please check and re-enter " +
                        "birth year ");
            }
        } else {
            System.out.println("Unable to parse year of birth");
        }

        scanner.close();
    }
}
