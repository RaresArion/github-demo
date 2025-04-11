package Section11.Interfaces;

public class Jet implements FlightEnabled, Trackable{

    @Override
    public void takeOff() {
        System.out.println(this.getClass().getSimpleName() + " is taking off");
    }

    @Override
    public void land() {
        System.out.println(this.getClass().getSimpleName() + " lands");
    }

    @Override
    public void fly() {
        System.out.println(this.getClass().getSimpleName() + " flies");
    }

    @Override
    public void track() {
        System.out.println(this.getClass().getSimpleName() + " is tracking something");
    }


    // Defined in FlightEnabled
    // this is called in Test.java
    @Override
    public FlightStages transition(FlightStages stage) {
//        FlightEnabled.super.transition(stage);
//        return FlightStages.CRUISE;

        System.out.println(" -> Called transition() from Jet class");
        return FlightEnabled.super.transition(stage);
    }
}
