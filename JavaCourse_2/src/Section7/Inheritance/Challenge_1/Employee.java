package Section7.Inheritance.Challenge_1;

public class Employee extends Worker {

    private static long nrOfEmployees = 1000;
    private long employeeId;
    private String hireDate;

    public Employee (String name, String dateBirth, String endDate, String hireDate) {
        super(name, dateBirth, endDate);
        nrOfEmployees++;
        this.employeeId = nrOfEmployees;
        this.hireDate = hireDate;
    }

    @Override
    public String toString () {
        return super.toString() + "\nHe is employee " + this.employeeId + " hired on " + this.hireDate;
    }

    static void display() {
        System.out.println("Display Employee");
    }

    public void display2() {
        System.out.println("Display NON-static Employee");
    }

}
