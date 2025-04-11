package Section7.Inheritance.Challenge_1;

public class SalariedEmployee extends Employee{

    private double anualSalary;
    private boolean isRetired;


    public SalariedEmployee(String name, String dateBirth, String endDate,
                            String hireDate, double anualSalary) {
        super(name, dateBirth, endDate, hireDate);
        this.anualSalary = anualSalary;
        this.isRetired = getAge() < 65 ? false : true;

    }

    public void retire () {
        System.out.println(this.isRetired ? this.name + " is retired at the age of " + this.getAge() : this.name + " is still a hard worker at the age of " + this.getAge());
    }

    @Override
    public double collectPay() {
        if (this.isRetired) {
            System.out.println(this.name + " is NOT a " + this.getClass().getName() + " anymore as he is retired and has an annual salary of: " + (this.anualSalary * 0.9));
        } else {
            System.out.println(this.name + " is a " + this.getClass().getName() + " and has an annual salary of: " + this.anualSalary);
        }
        return (int) this.anualSalary / 26;
    }

    static void display() {
        System.out.println("Display Salaried Employee");
    }

    public void display2() {
        System.out.println("Display NON-static Salaried Employee");
    }

}
