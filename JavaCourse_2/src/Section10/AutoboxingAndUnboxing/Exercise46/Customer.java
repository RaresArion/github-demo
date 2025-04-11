package Section10.AutoboxingAndUnboxing.Exercise46;

import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialTransaction) {
        this.name = name;
        this.transactions = new ArrayList<>(5000);
        this.transactions.add(initialTransaction);
    }

    public void addTransaction (double transaction) {
        this.transactions.add(transaction);
//        System.out.println("Customer.addTransaction() -> " + this.name);
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Double> getTransactions() {
        return this.transactions;
    }
}
