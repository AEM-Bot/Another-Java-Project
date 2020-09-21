public class WhileStatement {
    public static void main(String[] args) {
        int count = 1;
        while (count <= 5) {
            System.out.println("Count Value using while loop " + count);
            count++;
        }

//        for (count = 1; count != 6; count++) {
//            System.out.println("Count Value using for loop " + count);
//        }

        count = 1;
        do {
            System.out.println("Count value was using do while " + count);
            count++;
        } while (count != 6);
    }
}
