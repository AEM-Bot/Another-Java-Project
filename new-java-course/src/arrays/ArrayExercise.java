package arrays;

import java.util.Scanner;

public class ArrayExercise {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntegers = getIntegers(5);
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("Entered Integer Values at index: " + i +
                    " is " + myIntegers[i]);
        }
        System.out.println("Sum of entered Integers is: " +
                getSumOfIntegers(myIntegers));
        System.out.println("Average of entered Integers is: " +
                getAverageOfIntegers(myIntegers));
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();

        }
        return values;
    }

    public static double getSumOfIntegers(int[] array) {
        double sum = 0.0d;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static double getAverageOfIntegers(int[] array) {
        return (getSumOfIntegers(array) / 2);
    }
}
