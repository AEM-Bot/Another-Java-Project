package arrays;

import java.util.*;

public class ArrayChallenge {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArray = getIntegers(5);
        printArray(myArray);

        System.out.println("Sorted Integers array: ");
        int[] sorted = sortIntegers(myArray);
        printArray(sorted);
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values");
        int[] values = new int[number];
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] array) {
        //always less than length (else out of bound exception)
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element at index: " + i + " is " +
                    array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
//        int[] sortedArray = new int[array.length];
//        for (int i = 0; i < array.length; i++) {
//            sortedArray[i] = array[i];
//        }
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}

/*
    Array is data structure
    indexed 0 to n-1
    out of range --> indexoutofboundsexception
    []--> elements
    {}--> all elements inline initialization

 */