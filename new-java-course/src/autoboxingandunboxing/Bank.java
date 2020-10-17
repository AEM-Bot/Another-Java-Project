package autoboxingandunboxing;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Branches> branchesArrayList;

    private String bankName;

    public Bank(String bankName) {
        this.branchesArrayList = new ArrayList<>();
        this.bankName = bankName;
    }

    public void addBranch(String branchName) {
        if (findBranch(branchName) != null) {
            System.out.println("Could not add branch: " + branchName);
        } else {
            this.branchesArrayList.add(new Branches(branchName));
        }
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branches branches = findBranch(branchName);
        if (branches != null) {
            //this.branchesArrayList.add(branches.addNewCustomer(customerName, initialAmount))
            return branches.addNewCustomer(customerName, initialAmount);
        } else {
            return false;
        }
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branches branches = findBranch(branchName);
        if (branches != null) {
            return branches.addCustomerTransactions(customerName, transaction);
        }
        return false;
    }

    private Branches findBranch(String branchName) {
        for (Branches branches : this.branchesArrayList) {
            if (branches.getBranchName().equals(branchName)) {
                return branches;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransactions) {
        Branches branches = findBranch(branchName);
        if (branches != null) {
            System.out.println("Customers for Branch " + branches.getBranchName());
            ArrayList<Customers> branchCustomers = branches.getCustomersArrayList();
            for (int i = 0; i < branchCustomers.size(); i++) {
                Customers branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getCustomerName() +
                        " " + (i + 1));
                if (showTransactions) {
                    System.out.println("Transactions ");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + (j + 1) + "] Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
