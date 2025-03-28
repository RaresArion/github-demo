package Section10.AutoboxingAndUnboxing.Challenge;

import java.util.ArrayList;

record Customer (String name, ArrayList<Double> transactionsArray) {

    public Customer (String name) {
        this(name, new ArrayList<>());
    }

    // teacher's way
    public Customer (String name, double initialDeposit) {
        this(name, new ArrayList<>());
        this.transactionsArray.add(initialDeposit);
    }

}

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("Chase");
        bank.addNewCustomer2("Jane A", 500.0);
        System.out.println(bank);
        bank.printCustomersInfo();
    }
}
