public class VipCustomerRunner {

    public static void main(String[] args) {
        VipCustomer vipCustomer1 = new VipCustomer();

        System.out.println("Default Credit Limit : " + vipCustomer1.getCreditLimit() + " Default Customer Name " +
                vipCustomer1.getCustomerName() +
                " Default Email Address " + vipCustomer1.getEmailAddress());

        VipCustomer vipCustomer2 = new VipCustomer("Sasanka", "test@test.com");

        System.out.println("2 param constructor: Email Passed: " + vipCustomer2.getEmailAddress() +
                " Name Passed: " + vipCustomer2.getCustomerName() + " Default Credit Limit: " +
                vipCustomer2.getCreditLimit());

        VipCustomer vipCustomer3 = new VipCustomer("Sasanka", 101010, "givenemail@email.com");
        System.out.println("3 Param Constructor " + vipCustomer3.getCustomerName() + " " + vipCustomer3.getCreditLimit() + " " +
                vipCustomer3.getEmailAddress());
    }
}
