public class OperatorChallenge {

    public static void main(String[] args) {

        //step1
        double firstDouble = 20.00d;
        //step 2
        double secondDouble = 80.00d;
        //step 3
        double result = (firstDouble + secondDouble) * 100d;

        //add both numbers and multiply by 100
        System.out.println("Result Initial is " + result);
        //step4
        result = (result % 40.00d);

        System.out.println("Remainder is " + result);
        //step5
        boolean isRemainderZero = (result == 0) ? true : false;

        //step 6
        System.out.println("Is Remainder Zero " + isRemainderZero);

        //step7
        if (!isRemainderZero){
            System.out.println("Got Some Remainder");
        }
    }
}
