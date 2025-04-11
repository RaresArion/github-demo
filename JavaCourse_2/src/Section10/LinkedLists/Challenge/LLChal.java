package Section10.LinkedLists.Challenge;

// LinkedList Challenge

import java.util.*;

class Places {

    private String townName;
    private double distance;

    public Places (String townName, double distance) {
        this.townName = townName;
        this.distance = distance;
    }

    public String getTownName () {
        return this.townName;
    }

    public double getDistance() {
        return distance;
    }

    public String toString() {
        return this.getTownName() + " (" + this.getDistance() + ")\n";
//        return "From Sydney to " + this.getTownName() + " are " + this.getDistance() + " km";
    }
}

public class LLChal {
    public static void main(String[] args) {

        Places p0 = new Places("Sydney", 0);
        Places p1 = new Places("Adelaide", 1374);
        Places p2 = new Places("Alice Springs", 2771);
        Places p3 = new Places("Brisbane", 917);
        Places p4 = new Places("Darwin", 3972);
        Places p5 = new Places("Melbourne", 877);
        Places p6 = new Places("Perth", 3923);
        LinkedList<Places> itinerary = new LinkedList<>(List.of(p0, p1, p2, p3, p4, p5, p6));

        sortList(itinerary);
//
//        System.out.println("--------------------------------------------------");
//        for (int i = 0; i < itinerary.size(); i++) {
//            System.out.println(itinerary.get(i));
//        }
//        System.out.println("--------------------------------------------------");
//
//        ListIterator<Places> listIterator = itinerary.listIterator(1);
//        Places prevTown = itinerary.getFirst();
//        while (listIterator.hasNext()) {
//            Places town = listIterator.next();
//            System.out.println("From " + prevTown.getTownName() + " to " + town.getTownName() + " are " + (town.getDistance() - prevTown.getDistance()));
//            prevTown = town;
//        }





        readAction();

//        printList(itinerary);
//        System.out.println("1");
//        System.out.println("2");
//        Places p7 = new Places("BUCALE", 3923);
//        Places p8 = new Places("CLUG", 4000);
//
//        System.out.println("3");
//        addPlace(itinerary, 1, p7);
//        System.out.println("4");
//        printList(itinerary);
//        System.out.println("5");
//        addPlace(itinerary, 3, p8);
//        System.out.println("6");
//        printList(itinerary);
//        Places p8 = new Places("BUCALE2", 3933);
//        addPlace(itinerary, listIterator, p7);
//        printList(itinerary);
    }

    public static void readAction () {

        Places p0 = new Places("Sydney", 0);
        Places p1 = new Places("Adelaide", 1374);
        Places p2 = new Places("Alice Springs", 2771);
        Places p3 = new Places("Brisbane", 917);
        Places p4 = new Places("Darwin", 3972);
        Places p5 = new Places("Melbourne", 877);
        Places p6 = new Places("Perth", 3923);
        LinkedList<Places> itinerary = new LinkedList<>(List.of(p0, p1, p2, p3, p4, p5, p6));

        sortList(itinerary);

        Scanner scanner = new Scanner(System.in);
        ListIterator<Places> listIterator = itinerary.listIterator(1);
        printMenu();
        while (true) {
            String word = scanner.nextLine();
            if (word.toUpperCase().charAt(0) == 'F') {
                if (listIterator.hasNext()) {
                    System.out.println("We are at - " + listIterator.next().getTownName());
                } else {
                    System.out.println("We are at the end of the itinerary " + itinerary.getLast());
                }
            } else if (word.toUpperCase().charAt(0) == 'B') {
                if (listIterator.hasPrevious()) {
                    System.out.println(listIterator.previous());
                } else {
                    System.out.println("We are at the beginning of the itinerary " + itinerary.getFirst());
                }
            } else if (word.toUpperCase().charAt(0) == 'L') {
//                printList(itinerary);
                System.out.println(itinerary);
            } else if (word.toUpperCase().charAt(0) == 'M') {
                printMenu();
            } else if (word.toUpperCase().charAt(0) == 'Q') {
                break;
            }
        }

    }

    public static void printMenu() {
        System.out.println("""
                    Available actions (select word or letter):
                    (F)orward
                    (B)ackward
                    (L)ist Places
                    (M)enu
                    (Q)uit
                    """);
    }

    public static void printList (LinkedList<Places> itinerary) {
        ListIterator<Places> listIterator = itinerary.listIterator(1);
        Places prevTown = itinerary.getFirst();
        while (listIterator.hasNext()) {
            Places town = listIterator.next();
            System.out.println("From " + prevTown.getTownName() + " to " + town.getTownName() + " are " + (town.getDistance() - prevTown.getDistance()));
            prevTown = town;
        }
    }

    public static void addPlace (LinkedList<Places> itinerary, int index, Places place) {
        ListIterator<Places> listIterator = itinerary.listIterator(index);
        System.out.println("3.1");
        if (listIterator.hasNext()) {
            listIterator.add(place);
        }
        System.out.println("3.2");

    }

    public static void removePlace (LinkedList<Places> itinerary, Places place) {

    }

    public static void sortList (LinkedList<Places> itinerary) {
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 1; i < itinerary.size(); i++) {
                if (itinerary.get(i).getDistance() < itinerary.get(i - 1).getDistance()) {
                    var tmpP = itinerary.get(i);
                    itinerary.set(i, itinerary.get(i - 1));
                    itinerary.set(i - 1, tmpP);
                    flag = true;
                }
            }
        }
    }

}
