public class BankAccount {

    /*
        constructor below is default created by java
        all classes will internally have default constructors
        will always never have return type for constructors
     */
    public BankAccount() {
        /*
            this... is optional in only some cases we use the initialization like this
            this must be in ery first line of call to another constructor
            this.. will call the constructor with parameters
         */
        this(12345, 1234, "Default Name", "Default Email", 123456);
        System.out.println("Empty Constructor Called");
    }

    /*
        Below is overloaded constructor same as method overloading
        same name with different parameters
        constructor can call another constructor
     */
    public BankAccount(int accountNumber, int balance,
                       String customerName, String customerEmail, int phoneNumber) {
        System.out.println("Constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.phoneNumber = phoneNumber;
    }

    //tip -- always use this for fields
    private int accountNumber;

    private int balance;

    private String customerName;

    private String customerEmail;

    private int phoneNumber;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        System.out.println("get balance: " + balance);
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
        System.out.println("Set Balance is: " + balance);
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(int depositAmount) {
        System.out.println("amount deposited: " + depositAmount);
        this.balance += depositAmount;
        System.out.println("Balance after deposit : " + this.balance);
    }

    public void withdrawFunds(int withdrawAmount) {
        if (this.balance - withdrawAmount < 0) {
            System.out.println("Insufficient Funds to Withdraw");
        } else {
            this.balance -= withdrawAmount;
            System.out.println("Balance Remaining after withdrawal is: " + this.balance);
        }
    }
}
