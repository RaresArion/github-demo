package Section7;

public class BankAccount {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        // this is kind of default arguments for any instance of this class
        this(56789, 2.50, "Default name", "Default Address",
                "Default phone");
        System.out.println("Start of Empty constructor called");
        System.out.println("END of Empty constructor called");
    }
    public BankAccount(int accountNumber, double balance, String customerName, String email,
                       String phoneNumber) {
        // this();
        System.out.println("START of Custom constructor called");

        // this.accountNumber = accountNumber;
        // instead of directly assigning to the param
        //       I can call the setter, NOT indicated
        setAccountNumber(accountNumber);
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;

        System.out.println("END of Custom constructor called");
    }
    // constructor generated with intelji
    // example of passing some default attributes using this which will call the 5 parameters constructor
    public BankAccount(String customerName, String email, String phoneNumber) {
        this(99999, 100.55, customerName, email, phoneNumber);
//        this.customerName = customerName;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
    }

    // This is overloaded constructor but the order of parameters are changed
    // It is the same thing, but I can do it because I changed the order of parameters
//    public BankAccount(double balance, int accountNumber, String customerName, String email,
//                       String phoneNumber) {
//        this.accountNumber = accountNumber;
//        this.balance = balance;
//        this.customerName = customerName;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
//        System.out.println("Custom constructor called");
//    }

    // setters
    public void setAccountNumber (int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // getters
    public int getAccountNumber () {
        return accountNumber;
    }

    public double getBalance () {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // methods
    public void depositFunds (double sum) {
        this.balance = this.balance + sum;
    }

    public void withdrawFunds (int sum) {
        if (sum < this.balance) {
            this.balance = this.balance - sum;
        } else {
            System.out.println("Not enough funds\n");
        }
    }

    public void describeAccount() {
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Account Balance: " + getBalance());
        System.out.println("Account Customer's Name: " + this.customerName);
        System.out.println("Account Customer's Email: " + this.email);
        System.out.println("Account Customer's Phone Number: " + this.phoneNumber);
        System.out.println();
    }

}
