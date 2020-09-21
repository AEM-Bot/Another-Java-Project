public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first >= 10 && second >= 10) {
            int min = 0;
            int maxLength = (first > second ? first : second);
            for (int i = 1; i <= maxLength; i++) {
                if ((first % i == 0) && (second % i == 0)) {
                    if (i > min) {
                        min = i;
                    }
                }

            }
            return min;
        }
        return -1;
    }
}