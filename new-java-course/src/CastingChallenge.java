public class CastingChallenge {

    public static void main(String[] args) {
        byte myByte = 60;

        short myShort = 40;

        int myInt = 100;

        long myLong = 50000 + 10 * (myByte + myShort + myInt);

        System.out.println(myLong);

    }
}
