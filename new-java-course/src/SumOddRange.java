public class SumOddRange {

    public static void main(String[] args) {
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(13, 13));
        System.out.println(sumOdd(100, 1000));
        System.out.println(sumOdd(10, 5));

    }

    public static boolean isOdd(int number) {
        if ((number > 0) && (number % 2 != 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumOdd(int start, int end) {
        if ((start >= 0) && (end >= 0) && (end >= start)) {
            int sum = 0;
            for (; start <= end; start++) {
                if (isOdd(start)) {
                    sum += start;
                }

            }
            return sum;
        }
        return -1;
    }
}