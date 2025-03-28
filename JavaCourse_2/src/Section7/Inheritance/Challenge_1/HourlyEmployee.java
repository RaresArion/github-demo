package Section7.Inheritance.Challenge_1;

public class HourlyEmployee extends Employee{

    private double hourlyPayRate;
    private final static int normalHours = 40;

    public HourlyEmployee(String name, String dateBirth, String endDate, String hireDate, double hourlyPayRate) {
        super(name, dateBirth, endDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public HourlyEmployee () {
        this("Chad", "1995", "2030", "1998", 350.000);
    }

    @Override
    public double collectPay() {
        return HourlyEmployee.normalHours * this.hourlyPayRate;
    }

    public void getDoublePay(int overHours) {
        System.out.println(overHours > 0 ? (HourlyEmployee.normalHours * this.hourlyPayRate) + (overHours * this.hourlyPayRate * 2) : this.collectPay());
    }

    @Override
    public String toString() {
        return "Here starts " + this.getClass().getName() +
                "\nThis is " + this.name;
    }
}
