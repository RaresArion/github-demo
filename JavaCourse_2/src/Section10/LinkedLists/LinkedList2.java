package Section10.LinkedLists;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedList2 {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>(List.of("Bucale1", "Bucale2", "Bucale3", "Bucale4", "Bucale5"));
        System.out.println(placesToVisit);
//        getElements(placesToVisit);
//        printItinerary(placesToVisit);
        printItinerary3(placesToVisit);

    }

    public static void printItinerary3 (LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());
        String prevTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1); // some kind of substring. index is where the iterator will start
        while (iterator.hasNext()) {
            var town = iterator.next();
            System.out.println(" --> From: " + prevTown + " -> " + town);
            prevTown = town;
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    public static void printItinerary2 (LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());
        String prevTown = list.peek();
        for (String town : list) {
            System.out.println(" --> From: " + prevTown + " > to > " + town);
            prevTown = town;
        }

        System.out.println("Trip ends at " + list.getLast());
    }

    public static void printItinerary (LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());

        for (int i = 1; i < list.size(); i++) {
            System.out.println(" --> From: " + list.get(i - 1) + " to " + list.get(i));
        }

        System.out.println("Trip ends at " + list.getLast());
    }


    public static void getElements (LinkedList<String> placesToVisit) {
        System.out.println("Print third -> " + placesToVisit.get(3));
        System.out.println("Print first -> " + placesToVisit.getFirst());
        System.out.println("Print last -> " + placesToVisit.getLast());

        System.out.println("Bucale2 is at position -> " + placesToVisit.indexOf("Bucale2"));
        System.out.println("Bucale3 is at position -> " + placesToVisit.lastIndexOf("Bucale3"));

        // Queue retrieval method:
        System.out.println("Element from element() -> " + placesToVisit.element()); // throws err if arr is empty
        // Stack retrieval methods:
        System.out.println("Element from peek() -> " + placesToVisit.peek()); // returns null if arr = empty
        System.out.println("Element from peekFirst() -> " + placesToVisit.peekFirst()); // returns null if arr = empty
        System.out.println("Element from peekLast() -> " + placesToVisit.peekLast()); // returns null if arr = empty
    }
}
