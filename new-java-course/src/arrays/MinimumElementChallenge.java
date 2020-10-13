package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElementChallenge {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        int[] myArray = readIntegers(5);
//        System.out.println("My Array is: " + Arrays.toString(myArray));
//        int minElement = findMin(myArray);
//        System.out.println("Minimum Element is: " + minElement);

        System.out.println("Enter Count:");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] myArray = readIntegers(count);
        System.out.println("My Array is: " + Arrays.toString(myArray));

        int minElement = findMin(myArray);
        System.out.println("Minimum Element is: " + minElement);

    }

    public static int[] readIntegers(int count) {
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            System.out.println(" Enter number ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
