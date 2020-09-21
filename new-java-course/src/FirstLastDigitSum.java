public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(10256));
    }

    public static int sumFirstAndLastDigit(int number) {
        int sum = 0;
        if (number >= 0) {
            int lastDigit = number % 10;
            while (number > 0) {
                int firstDigit = number - (number / 10);
                sum = firstDigit + lastDigit;
                number = number / 10;
            }
            return sum;
        } else {
            return -1;
        }
    }
}