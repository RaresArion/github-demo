package Section5.Ex4;

public abstract class AbsCls {

    private boolean barking;
    private int hourOfDay;

    public AbsCls (boolean barking, int hourOfDay) {
        this.barking = barking;
        setHourOfDay (hourOfDay);
    }

    abstract boolean shouldWakeUp();

    protected boolean getBarking() {
        return this.barking;
    }

    protected int getHourOfDay () {
        return this.hourOfDay;
    }

    private void setHourOfDay (int hourOfDay) {
        if (hourOfDay < 0) {
            this.hourOfDay = 0;
        } else if (hourOfDay > 23) {
            this.hourOfDay = 23;
        } else {
            this.hourOfDay = hourOfDay;
        }
    }
}
