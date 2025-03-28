package Section7;

public class Customer {

    private String name;
    private double creditLimit;
    private String email;

    public Customer() {
        this("Default Name", 0.00, "default@email.com");
    }

    public Customer (String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public Customer (String name, String email) {
        this(name, 0.00, email);
    }

    public String getName() {
        return this.name;
    }

    public double getCreditLimit() {
        return this.creditLimit;
    }

    public String getEmail() {
        return this.email;
    }


//    public void setAccountNumber (String name) {
//        this.name = name;
//    }
}
