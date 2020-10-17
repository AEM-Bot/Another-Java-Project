package autoboxingandunboxing;

/*
    Revisit this section again not cleat on implementation
 */
public class BankRunner {

    public static void main(String[] args) {

        Bank bank = new Bank("Chase");
        bank.addBranch("New Jersey");
        bank.addCustomer("New Jersey", "Sasanka", 12.50d);
        bank.addCustomer("New Jersey", "Chintam", 14.50d);

        bank.addBranch("New York");
        bank.addCustomer("New York", "Robot", 200.45d);
        bank.addCustomerTransaction("New Jersey", "Sasanka", 44.56d);
        bank.addCustomerTransaction("New Jersey", "Chintam", 44.50d);

        bank.listCustomers("New Jersey", true);
        bank.listCustomers("New York", true);

        bank.addBranch("CT");

        if (!bank.addCustomer("CT", "Tim", 5.44)) {
            System.out.println("Error");
        }
    }
}
