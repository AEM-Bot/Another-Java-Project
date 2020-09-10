public class StringsExercise {

    public static void main(String[] args) {
        //String is not a primitive data type
        //String is a special class in java --Built in class
        //String is reference data type
        //Strings are immutable once created has reference to objects

        String myName = "Sasanka";

        System.out.println(myName);

        String myString = "10";
        int myInt = 20;

        //strings dont do any calculations only appends the int/string to another string
        myString = myString + myInt;
        System.out.println(myString);

        double doubleNumber = 10.567d;

        myString = myName + doubleNumber;

        System.out.println(myString);

        //for appending must use stringbuffer or stringbuilder -- as Strings are inefficient
        //to append or manipulate

        // + and = is operator 10 and 20 are operands
        int myVar = 10 + 20;

        //Expression is formed by combining variables.literals , method return values and operators


    }
}
