public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));

    }

    public static boolean hasSharedDigit(int start, int end) {
        if ((start >= 10 && start <= 99) && (end >= 10 && end <= 99)) {
            int firstStart = start / 10;
            int endStart = start % 10;
            int endNumberStart = end / 10;
            int endNumberEnd = end % 10;
            if (((firstStart == endNumberStart) || (firstStart == endNumberEnd)
                    || (endStart == endNumberStart) || (endStart == endNumberEnd))) {
                return true;
            }
        }
        return false;
    }
}