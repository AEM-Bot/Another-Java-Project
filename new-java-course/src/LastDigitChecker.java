public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
        System.out.println(isValid(10));
        System.out.println(isValid(468));
        System.out.println(isValid(1051));
    }

    public static boolean hasSameLastDigit(int number1, int number2, int number3) {
        if ((number1 >= 10 && number1 <= 1000)
                && (number2 >= 10 && number2 <= 1000)
                && (number3 >= 10 && number3 <= 1000)) {
            int number1LastDigit = number1 % 10;
            int number2LastDigit = number2 % 10;
            int number3LastDigit = number3 % 10;
            if ((number1LastDigit == number2LastDigit)
                    || (number2LastDigit == number3LastDigit)
                    || (number3LastDigit == number1LastDigit)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isValid(int number) {
        if (number >= 10 && number <= 1000) {
            return true;
        }
        return false;
    }
}