public class BankAccountRunner {

    public static void main(String[] args) {
        /*
            BankAccount() is a constructor
            constructor is a special method that has same name as class name
            No Return Type for constructors
         */
        BankAccount bankAccount = new BankAccount();

        /*
            setting/initialization the object for the first time
            if there are 100 values to add code becomes more lines and constructors
            helps to solve this problem
         */
        bankAccount.setBalance(1000);
        bankAccount.withdrawFunds(500);

        bankAccount.depositFunds(1000);
        bankAccount.getBalance();

        BankAccount sasankaAccount = new BankAccount(
                123456, 100,
                "sasanka", "chintam@gmail.com",
                408477);

        System.out.println(sasankaAccount.getCustomerName());

    }


}
