package autoboxingandunboxing;

/*
    This is start of autoboxing and unboxing
    won't be much code just concepts

 */

import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class AutoboxingConceptual {

    public static void main(String[] args) {

        String[] myArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Sasanka");

        //throws error as array list supports only of Type Objects
        //ArrayList<int> intArrrayList = new ArrayList<>();

        /*
            In order to accommodate primitive types not to use or
            create custom every time we need to have arraylist
            with primitive data type
            Wrapper Classes helps to solve this issue
            Pass primitive types classes or objects
         */
        ArrayList<IntClass> intClassArrayList = new ArrayList<>();
        intClassArrayList.add(new IntClass(1));

    /*
        Autoboxing an Unboxing helps in converting primitive data
        types to reference data types
        Below is same as above just using Integer wrapper class
        Same for Double, float and other Primitive data types
     */

        ArrayList<Integer> integerArrayList = new ArrayList<>();

        Integer integer = new Integer(1);

        for (int i = 0; i <= 10; i++) {
            //converting primitive to Wrapper object/class
            integerArrayList.add(Integer.valueOf(i));
        }
        for (int i = 0; i <= 10; i++) {
            //converting to primitive type from object class
            System.out.println(i + " --> " + integerArrayList.get(i).intValue());
        }

        /*
            Wrapper Classes are special classes that don't need
            new keyword to create instance
            Internally java is capable of converting primitive data type
            to reference/object wrappers
         */
        Integer myInt = 56;
        int newInt = myInt;
        String myString = "hello";

    }

}