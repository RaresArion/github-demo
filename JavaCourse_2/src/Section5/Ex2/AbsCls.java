package Section5.Ex2;

public abstract class AbsCls {

    private double km;

    public AbsCls (int km) {
        this.km = km;
    }

    abstract long toMilesPerHour(double kilometersPerHour);

    void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
            return;
        }
        System.out.println("Print Conversion of " + this.toMilesPerHour(kilometersPerHour));
        System.out.printf("%.2f km/h = %d mi/h\n", kilometersPerHour, this.toMilesPerHour(kilometersPerHour));
    }
}
