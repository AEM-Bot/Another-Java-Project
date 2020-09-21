public class NumberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(11212));

    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int giveNumber = number;
        while (giveNumber != 0) {
            int lastDigit = giveNumber % 10;
            reverse = reverse * 10 + lastDigit;
            giveNumber = giveNumber / 10;
        }

        if (reverse == number) {
            return true;
        }
        return false;
    }
}