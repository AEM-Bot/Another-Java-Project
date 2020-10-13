package arrays;

import java.util.Arrays;

public class ReverseArrayChallenge {

    public static void main(String[] args) {
        int[] myArray = {10, 20, 30,40,50};
        System.out.println("Non-Reversed Array: "
                + Arrays.toString(myArray));
        reverse(myArray);

        System.out.println("Reversed Array = " + Arrays.toString(myArray));


    }

    public static void reverse(int[] array) {
//        int[] tempArray = new int[array.length];
//        for (int i = 0; i < array.length; i++) {
//            tempArray[i] = array[(array.length-1) - i];
//        }

        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }

}
