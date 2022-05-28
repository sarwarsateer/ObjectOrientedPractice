package BankChallenge;

import java.util.ArrayList;

//Your job is to create a simple banking application.
//There should be a Bank class
//it should have an arraylist of branches
//Each branch should have an arraylist of customers
//The customer class should have an arraylists of doubles (transactions)
//Customer:
//name, and the arraylist of doubles.
//Branch:
//need to be able to add a new customer and initial transaction amount.
//also needs to add additional transaction for that customer/branch
//Bank:
//add a new branch
//add a customer to that branch with initial transaction
//add a transaction for an existing customer for that branch
//        show a list of customers for a particular branch and optionally a list
//        of their transactions.
//demonstration autoboxing and unboxing in your code
//hint: transactions
//add data validation
//        e.g. check if exists, or does not exist, etc.
//think about where you are adding the code to perform certain actions
public class Bank {

    private String name;
    private ArrayList<Branch> branches;
    private Customer customer;

    public Bank(String name) {
        this.name = name;
        branches = new ArrayList<>();
    }

    public boolean addBrach(String name) {
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
                        System.out.println("[" + (j + 1) + "] Amount " + customerTransactions.get(i));
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }
}

