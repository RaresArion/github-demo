package Section10.AutoboxingAndUnboxing.Exercise46;

import java.util.ArrayList;


public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public ArrayList<Customer> getCustomers() {
        return this.customers;
    }

    public String getName() {
        return this.name;
    }

    public boolean newCustomer(String customerName, double initialTransaction) {
        Customer customer = new Customer(customerName, initialTransaction);
        if (findCustomer(customerName) == null) {
            this.customers.add(customer);
//            System.out.println("Branch.newCustomer() added " + customer.getName());
            return true;
        }
//        System.out.println("Branch.newCustomer() did NOT add, he is already in the list " + customer.getName());
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double transaction) {
        if (findCustomer(customerName) != null) {
            findCustomer(customerName).addTransaction(transaction);
            return true;
        }
        return false;
    }

    private Customer findCustomer (String customerName) {
        for (Customer customer : this.customers) {
            if (customer.getName().equalsIgnoreCase(customerName)) {
//                System.out.println("Branch.findCustomer() FOUND " + customer.getName());
                return customer;
            }
        }
//        System.out.println("Branch.findCustomer() did NOT find " + customerName);
        return null;
    }
}
