public class Casting {

    public static void main(String[] args) {

        Byte minByte = Byte.MIN_VALUE;
        byte myNewByte = (byte) (minByte / 2); //casting int to byte

        System.out.println(myNewByte);

        Short minShort = Short.MIN_VALUE;

        short myShort = (short)(minShort/2); //casting int to short

        System.out.println(myShort);

        //always use integer data type unless absolutely necessary to use short or byte

    }
}
