package arrays;

/*
    Start of Data Structures
    Data Structure to store sequence of values of same data type
 */
public class ArraysStart {

    public static void main(String[] args) {
        //one way of initialization
        int[] myArray = new int[10];
        //another way of initialization
        int[] newArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //best practice to use length property
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i * 10;
//            System.out.println("element at index :" + i + " is " +
//                    myArray[i]);
        }
        printArray(myArray);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("element at index :" + i + " is " +
                    array[i]);
        }
    }
}
