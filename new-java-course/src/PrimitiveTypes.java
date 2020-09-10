public class PrimitiveTypes {
    public static void main(String[] args) {
        //Integer is the mostly used primitive data type in java
        //Integer Wrapper Class here
        int minIntegerValue = Integer.MIN_VALUE;
        System.out.println("Minimum Integer Value " + minIntegerValue);

        int maxIntegerValue = Integer.MAX_VALUE;
        System.out.println("Maximum Integer Value " + maxIntegerValue);

        System.out.println("underflow Integer Value " + (minIntegerValue - 1));
        System.out.println("overflow Integer Value " + (maxIntegerValue + 1));

        int maxIntegerTest = 2_147_483_647; //for readability
        System.out.println(maxIntegerTest);

        //rarely used byte data type
        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;

        System.out.println("Min Byte " + minByte);
        System.out.println("Max Byte " + maxByte);

        Short minShort = Short.MIN_VALUE;
        Short maxShort = Short.MAX_VALUE;

        System.out.println("Min Short Value " + minShort);
        System.out.println("Max Short Value " + maxShort);

        //.Byte - 8 bits -width 8
        //Short - 16bits - width 16
        //int - 32 bits - width 32
        //long - 64 bits - width 64

        //long should be used only if the number might be toooo big
        long myLong = 100L;
        System.out.println(myLong);

        Long maxLong = Long.MAX_VALUE;
        Long minLong = Long.MIN_VALUE;
        System.out.println("Max Long Value " + maxLong);
        System.out.println("Min Long Value " + minLong);



    }
}
