package Section5.Ex2;

public class NormalCls extends AbsCls{

    public NormalCls() {
        super(111);
    }

    private final double KM_MILE = 1.609;

    long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }

        double miles = kilometersPerHour / KM_MILE;
        return Math.round(miles);
    }
}
