package autoboxingandunboxing;

import java.util.ArrayList;

public class Branches {

    private ArrayList<Customers> customersArrayList;

    private String branchName;

    public Branches(String branchName) {
        this.customersArrayList = new ArrayList<>();
        this.branchName = branchName;
    }

    public boolean addNewCustomer(String customerName, double initialTransaction) {
        if (findCustomer(customerName) != null) {
            System.out.println("Customer already exists: " + customerName);
            return false;
        } else {
            this.customersArrayList.add(new Customers(initialTransaction, customerName));
            return true;
        }
    }

    public boolean addCustomerTransactions(String customerName, double transactions) {
        Customers existingCustomer = findCustomer(customerName);
        if (existingCustomer != null) {
            existingCustomer.addTransactions(transactions);
            return true;
        }
        return false;
    }

    private Customers findCustomer(String customerName) {
        for (Customers customers : this.customersArrayList) {
            if (customers.getCustomerName().equals(customerName)) {
                return customers;
            }
        }
        return null;
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customers> getCustomersArrayList() {
        return customersArrayList;
    }
}
