public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(7));
//        System.out.println(getLargestPrime(217));
//        System.out.println(getLargestPrime(0));
//        System.out.println(getLargestPrime(45));
//        System.out.println(getLargestPrime(-1));
//        System.out.println(getLargestPrime(7));

    }

    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        } else {
            int largestPrime = 0;
            int count = 0;
            for (int i = 2; i <= number; i++) {
                if (number % i == 0) {
                    for (int j = 2; j <= i; j++) {
                        if (i % j == 0) {
                            count++;
                        }
                    }
                    if (count == 1) {
                        if (largestPrime < i) {
                            largestPrime = i;
                        }
                    }
                    count = 0;
                }
            }
            return largestPrime;
        }
    }
}