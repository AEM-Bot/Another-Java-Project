public class VipCustomer {

    private String customerName;

    private int creditLimit;

    private String emailAddress;

    /*
        Empty Constructor --> Default Constructor
     */
    public VipCustomer() {
        this("Default Name", 10000, "Default Email");
        System.out.println("Inside Empty Constructor");
    }
    /*
        Constructor with 2 parameters passed to 3 param constructor
         and default value is set
     */

    public VipCustomer(String customerName, String emailAddress) {
        this(customerName, 5000, emailAddress);
        this.customerName = customerName;
        this.emailAddress = emailAddress;
    }
    /*
        Constructor with 3 parameters
     */

    public VipCustomer(String customerName, int creditLimit, String emailAddress) {
        System.out.println("Inside 3 parameters constructor");
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

}
