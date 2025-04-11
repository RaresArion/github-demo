package Section10.LinkedLists;

import java.util.LinkedList;

public class LinkedList1 {

    public static void main(String[] args) {

//        LinkedList<String> placesToVisit = new LinkedList<>();
        var placesToVisit = new LinkedList<String>();

        System.out.println(placesToVisit);

        placesToVisit.add("Sydney");
        System.out.println(placesToVisit);

        placesToVisit.add(0, "Canberra");
        System.out.println(placesToVisit);

        placesToVisit.add("Bucale");
        System.out.println(placesToVisit);

        placesToVisit.push("Bucale2");
        System.out.println(placesToVisit);

        placesToVisit.offer("Bucale3");
        System.out.println(placesToVisit);

        placesToVisit.offerFirst("Bucale4");
        placesToVisit.offerLast("Bucale5");
        System.out.println(placesToVisit);

        String s1 = placesToVisit.remove();
        System.out.println(placesToVisit);

        String p1 = placesToVisit.poll();
        System.out.println(placesToVisit);

        String p4 = placesToVisit.pop();
        System.out.println(placesToVisit);

        System.out.println(placesToVisit.peek());
        System.out.println(placesToVisit.peekFirst());
        System.out.println(placesToVisit.peekLast());
        System.out.println(placesToVisit);

    }

    private static void addMoreElements(LinkedList<String> list) {

        list.addFirst("Darwin");
        list.addLast("Hobart");
        // Queue methods
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");
        // Stack Methods
        list.push("Alice Springs");

    }

    private static void removeElements(LinkedList<String> list) {

        list.remove(4);
        list.remove("Brisbane");

        System.out.println(list);
        String s1 = list.remove(); // removes first element
        System.out.println(s1 + " was removed");

        String s2 = list.removeFirst(); // removes first element
        System.out.println(s2 + " was removed");

        String s3 = list.removeLast(); // removes last element
        System.out.println(s3 + " was removed");
        // Queue/Deque poll methods
        String p1 = list.poll();  // removes first element
        System.out.println(p1 + " was removed");
        String p2 = list.pollFirst();  // removes first element
        System.out.println(p2 + " was removed");
        String p3 = list.pollLast();  // removes last element
        System.out.println(p3 + " was removed");

        list.push("Sydney");
        list.push("Brisbane");
        list.push("Canberra");
        System.out.println(list);

        String p4 = list.pop();  // removes first element
        System.out.println(p4 + " was removed");

    }
}
