package Section10.AutoboxingAndUnboxing.Challenge;

import java.util.ArrayList;
import java.util.Arrays;

public class Bank {

    private String name;
    ArrayList<Customer> customerArr;

    public Bank(String name) {
        this.name = name;
        this.customerArr = new ArrayList<>();
    }

    public void addNewCustomer (Customer customer) {

        if (!findCustomer(customer)) {
            this.customerArr.add(customer);
            return;
        }
        System.out.println(customer.name() + " is already in the list");
    }

    // teacher mode
    public void addNewCustomer2 (String customerName, double initialDeposit) {
        Customer c = new Customer(customerName, initialDeposit);
        if (getCustomer(customerName) == null) {
            this.customerArr.add(c);
            System.out.println("New Customer added: " + c.name());
            return;
        }
        System.out.println(customerName + " is already in the list");
    }

    public void addTransaction (Customer customer, double transaction) {
        if (!findCustomer(customer)) {
            return;
        }
        customer.transactionsArray().add(transaction);
        // System.out.println(customer.name() + "'s transactions are: " + customer.transactionsArray());
    }

    // teacher's way
    public void addTransaction2 (String name, double transactionAmount) {
        Customer customer = getCustomer(name);
        if (customer != null) {
            customer.transactionsArray().add(transactionAmount);
        }
    }

    public void printCustomersInfo () {
        for (Customer c : this.customerArr) {
            double[] custTransactions = toPrimDouble(c.transactionsArray());
            System.out.println(c.name() + "'s transactions are: " + Arrays.toString(custTransactions));
        }
    }

    private double[] toPrimDouble (ArrayList<Double> arr) {
        double[] primArr = new double[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            primArr[i] = arr.get(i);
        }
        return primArr;
    }

    private boolean findCustomer (Customer customer) {
        return this.customerArr.contains(customer);
    }

    // teacher's way; below should be private but I am testing the method
    public Customer getCustomer (String customerName) {
        for (Customer c : this.customerArr) {
            if (c.name().equalsIgnoreCase(customerName)) {
                System.out.println("Found customer with the name of " + c.name());
                return c;
            }
        }
        System.out.printf("Customer (%s) was NOT found\n", customerName);
        return null;
    }

    public void getArr () {

        System.out.println(this.customerArr);
    }


    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customerArr=" + customerArr +
                '}';
    }
}
