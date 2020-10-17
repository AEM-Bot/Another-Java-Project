package autoboxingandunboxing;

import java.util.ArrayList;

public class Customers {

    private ArrayList<Double> transactions;

    private String customerName;

//    public Customers(ArrayList<Double> transactions, String customerName) {
//        this.transactions = transactions;
//        this.customerName = customerName;
//    }

    public Customers(double initialAmount, String customerName) {
        this.customerName = customerName;
        this.transactions = new ArrayList<>();
        addTransactions(initialAmount);
    }

    public void addTransactions(double transactions) {
        this.transactions.add(transactions);
    }


    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public String getCustomerName() {
        return customerName;
    }
}
