package Section11.Interfaces;

/*
*   Interfaces:
*       - omit access modifier => implicitly public (for a normal class is private)
*       - any instance (variable) is 'public static final' implicitly
* */

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Animal bird1 = new Bird();
        FlightEnabled bird2 = new Bird();
        Trackable bird3 = new Bird();
        ((Bird)bird2).eat();
        bird.move();
        bird.takeOff();
        bird.land();
        bird.fly();
        bird.track();

        System.out.println("-".repeat(30));

        inFlight(bird);

        Jet jet1 = new Jet();
        inFlight(jet1);

        Truck truck1 = new Truck();
        truck1.track();

        double kmsTraveled = 100;
        System.out.println(FlightEnabled.MLIES_TO_KM * kmsTraveled);

        System.out.println("-".repeat(30));
//        ArrayList<FlightEnabled> fliers = new ArrayList<>();
        LinkedList<FlightEnabled> fliers = new LinkedList<>();
        // fliers.add(jet1); // works but I didn't want to leave it there because too much output
        // fliers.add(bird1); // Animal does not implement FlightEnabled interface
        fliers.add(bird);

        List<FlightEnabled> betterFliers = new LinkedList<>();
        betterFliers.add(bird);

        triggerFliers(fliers);
        flyFliers(fliers);
        landFliers(fliers);

        triggerFliers(betterFliers);
        flyFliers(betterFliers);
        landFliers(betterFliers);
    }

    private static void triggerFliers (List<FlightEnabled> fliers) {
        for (var flier : fliers) {
            flier.takeOff();
        }
    }

    private static void flyFliers (List<FlightEnabled> fliers) {
        for (var flier : fliers) {
            flier.fly();
        }
    }

    private static void landFliers (List<FlightEnabled> fliers) {
        for (var flier : fliers) {
            flier.land();
        }
    }

    private static void inFlight (FlightEnabled flier) {
        flier.takeOff();
        flier.fly();
        if (flier instanceof Trackable tracked) {
            tracked.track();
        }
        flier.land();
        System.out.println("-".repeat(30));
    }
}
