package Section11.Interfaces;

public class Test {
    public static void main(String[] args) {

//        inFlight(new Jet());
//        OrbitEarth.log("What is happening Houston " + new Satellite());
        orbit(new Satellite());

    }

    private static void inFlight (FlightEnabled flier) {
        flier.takeOff();
        flier.transition(FlightStages.CRUISE);
        flier.fly();
        if (flier instanceof Trackable tracked) {
            tracked.track();
        }
        flier.land();
        System.out.println("-".repeat(30));
    }

    private static void orbit (OrbitEarth flier) {
        flier.takeOff();
        flier.fly();
        flier.land();
    }
}
