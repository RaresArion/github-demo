package Section10.AutoboxingAndUnboxing.Exercise46;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank (String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        if (findBranch(branchName) == null) {
            return false;
        }

        Branch branch = findBranch(branchName);
        if (branch.newCustomer(customerName, initialTransaction)) {
            return true;
        }

        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        if (findBranch(branchName) == null) {
            return false;
        }
        Branch branch = findBranch(branchName);
//        assert branch != null;
        if (branch.addCustomerTransaction(customerName, transaction)) {
            return true;
        }
        return false;
    }

    private Branch findBranch(String branchName) {
        for (Branch branch : this.branches) {
            if (branch.getName().equalsIgnoreCase(branchName)) {
//                System.out.println("Bank.findBranch() found " + branch.getName());
                return branch;
            }
        }
//        System.out.println("Bank.findBranch() did NOT find " + branchName);
        return null;
    }

    public boolean listCustomers(String branchName, boolean printTransaction) {

        if (findBranch(branchName) == null) {
            return false;
        }
        var customers = findBranch(branchName).getCustomers();
        System.out.println("Customer details for branch " + branchName);
        if (printTransaction) {
            for (int i = 0; i < customers.size(); i++) {
                System.out.printf("Customer: %s[%d]\n", customers.get(i).getName(), i+1);
                System.out.println("Transactions");
                int j = 0;
                    for (double transaction : customers.get(i).getTransactions()) {
                        System.out.println("[" + (j+1) + "]" + " Amount " + transaction);
                        j++;
                    }
            }
        } else {
            for (int i = 0; i < customers.size(); i++) {
                System.out.printf("Customer: %s [%d]\n", customers.get(i).getName(), i+1);
            }
        }
        return true;
    }
}
