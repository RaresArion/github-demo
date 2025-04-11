package Section5.Ex4;

public class NormCls extends AbsCls {

    public NormCls (boolean barking, int hourOfDay) {
        super(barking, hourOfDay);
    }

    public boolean shouldWakeUp() {
        if (!super.getBarking()) {
            System.out.println("No barking, piece - " + super.getBarking() + " " + super.getHourOfDay());
            return false;
        }

        if (super.getHourOfDay() < 8 || super.getHourOfDay() > 22) {
            System.out.println("We are awake - " + super.getBarking() + " " + super.getHourOfDay());
            return true;
        }
        System.out.println("No waking up - "  + super.getBarking() + " " + super.getHourOfDay());
        return false;
    }

}
