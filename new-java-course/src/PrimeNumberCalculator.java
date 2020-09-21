public class PrimeNumberCalculator {

    public static void main(String[] args) {
        int count = 0;
        for (int x = 10; x <= 50; x++) {
            if (isPrime(x)) {
                System.out.println(x + " is a prime number");
                count = count + 1;
                if (count == 3) {
                    break;
                }
            }

        }
    }


    // for each is enhanced for loop --> in the future
    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        //this loops more numbers
//        for (int i = 2; i <= n / 2; i++) {
//            if (n % i == 0) {
//                return false;
//            }
//        }
        //this loops less numbers more optimization
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println("Looping " + i);
                return false;
            }
        }
        return true;
    }
}
