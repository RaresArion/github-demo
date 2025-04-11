package Section10.LinkedLists;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
/*
*  Iterator:
*       - only goes forwards:
*       - methods: next(), hasNext(), remove();
*
*  ListIterator goes both ways:
*       - goes both ways
* */
public class LinkedList3 {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>(List.of("Bucale1", "Bucale2", "Bucale3", "Bucale4", "Bucale5"));

//        printItinerary3(placesToVisit);
//        testIterator(placesToVisit);
        testListIterator(placesToVisit);
    }

    public static void printItinerary3 (LinkedList<String> list) {
        System.out.println("Trip starts at " + list.peek());
        ListIterator<String> listIterator = list.listIterator(1);
        String prevTown = list.getFirst();
        while(listIterator.hasNext()) {
            var town = listIterator.next();
            System.out.println(" --> From: " + prevTown + " to " + town);
            prevTown = town;
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    private static void testIterator (LinkedList<String> list) {
        var iterator = list.iterator();
        while (iterator.hasNext()) {
//            System.out.println(iterator.next()); //  iterator.next(); <- this "increments" the iterator
            if (iterator.next().equals("Bucale3"))
                iterator.remove();
        }
//        list.removeIf(s -> s.equals("Bucale3")); // iterates through the list and if it finds "Bucale3" it will remove it


        System.out.println(list);
    }

    private static void testListIterator (LinkedList<String> list) {
        var iterator = list.listIterator(); // this iterator only works once;
        while (iterator.hasNext()) {
//            System.out.println(iterator.next()); //  iterator.next(); <- this "increments" the iterator and retrieves the element
            if (iterator.next().equals("Bucale3")) {
                iterator.add("Bucale3.2");
            }
        }
//        list.removeIf(s -> s.equals("Bucale3")); // iterates through the list and if it finds "Bucale3" it will remove it

        // can't use the same iterator obj as the one above. This one is at the end of the list -> CREATE ANOTHER ListIterator obj
        ListIterator<String> iterator2 = list.listIterator();
        System.out.println("Going forward");
        while (iterator2.hasNext()) {
            System.out.print(iterator2.next() + " ");
        }
        System.out.println("\n\nGoing back");
        while (iterator2.hasPrevious()) {
            System.out.print(iterator2.previous() + " ");
        }

        System.out.println("\n\nStarting directly before the last element");
        ListIterator<String> iterator3 = list.listIterator(list.size());
        while(iterator3.hasPrevious()) {
            System.out.print(iterator3.previous() + " ");
        }


        System.out.println("\n\n"+list);
    }
}
