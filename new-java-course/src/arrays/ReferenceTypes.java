package arrays;

import java.util.Arrays;

public class ReferenceTypes {

    public static void main(String[] args) {

        //value types - variable directly in memory
        int myInt = 10;
        int anotherInt = 20;
        System.out.println(myInt);
        System.out.println(anotherInt);

        anotherInt++;
        System.out.println(anotherInt);

        //Reference > new keyword creates a new memory in java
        int[] myIntArray = new int[5];
        //object holds an address to the object
        System.out.println(myIntArray);

        System.out.println(Arrays.toString(myIntArray));

        //[I@1540e19d --> Reference example

        int[] anotherArray = myIntArray;
        System.out.println(anotherArray);
        //[I@1540e19d --> Same reference as above

        System.out.println(Arrays.toString(anotherArray));

        anotherArray[0] = 1;
        //if one reference change other containing the same reference changes
        System.out.println(Arrays.toString(anotherArray));
        System.out.println(Arrays.toString(myIntArray));

        modifyArray(myIntArray);
        System.out.println(Arrays.toString(myIntArray));
        System.out.println(Arrays.toString(anotherArray));
    }
    private static void modifyArray(int[] array){

        array[0] =2;
    }
}
