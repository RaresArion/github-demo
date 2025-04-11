package Section7.Inheritance.Challenge_1;

public class Worker {

    protected String name;
    private String birthDate;
    private String endDate;




    public Worker (String name, String birthDate, String endDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }


    public int getAge() {
        return 2025 - Integer.parseInt(this.birthDate);
    }

    public double collectPay() {
        return 1.0;
    }

    public void terminate (String endDate) {
        System.out.print("End date is " + endDate);
    }

    public String toString() {
        return this.name + " is " + this.getAge() +
                " and he will leave on " + this.endDate + "\n -> " +  super.toString();
    }
}
