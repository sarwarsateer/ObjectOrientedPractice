package BankChallenge;

import java.util.ArrayList;


public class Bank {

    public String getName() {
        return name;
    }

    private String name;
    private ArrayList<Branch> branches;
    private Customer customer;

    public Bank(String name) {
        this.name = name;
        branches = new ArrayList<>();
    }

    public boolean addBranch(String name) {
        Branch currentBranch = findBranch(name);
        if (currentBranch == null) {
            this.branches.add(new Branch(name));
            return true;
        }
        return false;
    }

    private Branch findBranch(String name) {
        for (int i = 0; i < this.branches.size(); i++) {
            Branch checkedBranch = this.branches.get(i);
            if (checkedBranch.getName().equals(name)) {
                return checkedBranch;
            }
        }
        return null;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branch currentBranch = findBranch(branchName);
        if (currentBranch != null) {
            return currentBranch.newCustomer(customerName, initialAmount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        Branch isBranchExisted = findBranch(branchName);
        if (isBranchExisted != null) {
            return isBranchExisted.addCustomerTransaction(customerName, amount);
        }
        return false;
    }

    public boolean listCustomers(String branchName, boolean showTransactions) {
        Branch currentBranch = findBranch(branchName);
        if (currentBranch != null) {
            System.out.println("Customer details for branch " + currentBranch.getName());
            ArrayList<Customer> branchCustomer = currentBranch.getCustomers();
            for (int i = 0; i < branchCustomer.size(); i++) {
                System.out.println("Customer: " + branchCustomer.get(i).getName() + " [" +
                        (i + 1) + "]");
                if (showTransactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> customerTransactions = branchCustomer.get(i).getTransactions();
                    for (int j = 0; j < customerTransactions.size(); j++) {
                        System.out.println("[" + (j + 1) + "] Amount " + customerTransactions.get(j));
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }
}

