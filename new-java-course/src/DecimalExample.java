public class DecimalExample {

    public static void main(String[] args) {
        float myFloat = 10.5f;

        //float 32 bits
        //double 64 bits
        double myDouble = 4.5677d;

        System.out.println(myFloat);

        System.out.println(myDouble);


        int myInt = 5;
        float myFloatValue = 5.25f; //double is assumed default for decimal numbers in java
        double myDoubleValue = 5.25d;


        //Floats are not recommended to use now a days
        //use f to define float decimals instead of casting
        float testFloat = (float) 5.25;
        System.out.println(testFloat);

        int newInt = 5 / 3;
        float newFloat = 5f / 3f;
        double newDouble = 5d / 3d;

        System.out.println("Integer Value " + newInt);
        System.out.println("Float Value " + newFloat);
        System.out.println("Double Value " + newDouble);//double is more precise than float


    }
}
