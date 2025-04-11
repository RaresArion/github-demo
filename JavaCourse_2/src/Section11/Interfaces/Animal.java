package Section11.Interfaces;

//import java.util.*;

enum FlightStages implements Trackable {
    GROUNDED, LAUNCH, CRUISE, DATA_COLLECTION;

    @Override
    public void track() {
        if (this != GROUNDED) {
            System.out.println("Monitoring " + this);
        }
    }

    public FlightStages getNextStage() {
        FlightStages[] allStages = values();
//        System.out.println("1===" + allStages[(this.ordinal() + 1)]);
//        System.out.println("2.1===" + (this.ordinal()));
//        System.out.println("2.2===" + (this.ordinal() + 1));
//        System.out.println("3===" + allStages.length);
//        System.out.println("4===" + (this.ordinal() + 1) % allStages.length);
//        System.out.println(" == " + allStages[(ordinal() + 1) % allStages.length]);
        return allStages[(this.ordinal() + 1) % allStages.length];
    }
}

record DragonFly (String name, String type) implements FlightEnabled {
    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}

class Satellite implements OrbitEarth {

    FlightStages stage = FlightStages.GROUNDED;

    @Override
    public void takeOff() {
        transition("Taking Off");
    }

    @Override
    public void land() {
        System.out.println("Landing");
    }

    @Override
    public void fly() {
        achieveOrbit();
        System.out.println("Data Collection while Orbiting");
    }

    @Override
    public void achieveOrbit() {
        System.out.println("Orbit achieved!");
    }


    public void transition(String description) {
        System.out.println(description);
        this.stage = transition(this.stage);
        this.stage.track();
        return;
    }
}

interface OrbitEarth extends FlightEnabled {

    void achieveOrbit();

    static void log (String description) {
        var today = new java.util.Date();
        System.out.println(today + ": " + description);

    }

    private void logStage (FlightStages stage, String description) {
        description = stage + ": " + description;
        log(description);
    }

    @Override
    default FlightStages transition(FlightStages stage) {
        FlightStages nextStage = FlightEnabled.super.transition(stage);
        logStage(stage, " Begging Transition to " + nextStage);
        return nextStage;
    }
}

interface FlightEnabled {

    public static final double MLIES_TO_KM = 1.60934;
    double KM_TO_MILES = 0.621371;

    public abstract void takeOff(); //
    abstract void land();           //  the same under the cover
    void fly();                     //

    // method:
    default FlightStages transition (FlightStages stage) {
//        System.out.println("transition not implemented on " + this.getClass().getName());
//        return null;

        FlightStages nextStage = stage.getNextStage();
        System.out.println("Transitioning from " + stage + " to " + nextStage);
        return nextStage;
    }
}

interface Trackable {
    void track();
}

public abstract class Animal {

    abstract void move();

    public void sleeps() {
        System.out.println("Class Animal is sleeping");
    }

}
