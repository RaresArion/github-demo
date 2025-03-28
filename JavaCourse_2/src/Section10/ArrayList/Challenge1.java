package Section10.ArrayList;

import java.util.*;

public class Challenge1 {
    static ArrayList<String> groceriesList;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        groceriesList = new ArrayList<>(List.of("Mozzarella", "Branza de Burduf"));



        while (true) {

            int x = readInput ();
            System.out.println("Text after 'x'");
            if (x == 0) {
                sortAndPrint();
                break;
            } else if (x == 1) {
                addMultipleItems();
                sortAndPrint();
            } else if (x == 2) {
                remove();
                sortAndPrint();
            } else if (x == 3) {
                sortAndPrint();
            } else if (x == 4) {
                checkItem(); // checks if item exists in the table
            } else if (x == 5) {
                addMultipleItems();
            }

            System.out.println("Text after all if's");
        }
    }

    private static int readInput () {
        String text = """
                   \t-> 4 - check if an item is in the list
                   \t-> 5 - add multiple items""";
        System.out.println("Give me a nr: ");
        System.out.printf("\t-> %s%n".repeat(3), "0 - to shut down",
                "1 - to add item(s) to list (comma delimited list)",
                "2 - to remove any items (comma delimited list)");
        System.out.println(text);
        groceriesList.sort(Comparator.naturalOrder());
        int x = 0;
        int nrOfTries = 0;
        while (true) {
            try {
                x = scanner.nextInt();
                nrOfTries = 0;
                System.out.println("Text before 'try-break'");
                break;
            } catch (InputMismatchException e) {
                nrOfTries++;
                if (nrOfTries >= 3) {
                    System.out.println("You are no longer allowed to abuse this!!!");
                    break;
                }
                System.out.print("Enter a valid number");
                System.out.println(" - nrOfTries = " + nrOfTries);
                scanner.nextLine();
                System.out.println("Text at the end of 'try-catch'");
            }
        }
        System.out.println("Text before 'return x'");
        return x;
    }

    private static void addMultipleItems () {
        System.out.println("What items do you want to add: ");
        scanner.nextLine();
        String obj = scanner.nextLine();
        String[] obj1 = obj.split(",");
        System.out.println(Arrays.toString(obj1) + "\n\tsize " + obj1.length);
        for (int i = 0; i < obj1.length; i++) {
            String objToAdd = obj1[i].trim();
            objToAdd = objToAdd.toUpperCase().charAt(0) + objToAdd.substring(1).toLowerCase();
            if (!groceriesList.contains(objToAdd)) {
                System.out.println("Adding " + objToAdd);
                groceriesList.add(objToAdd);
            } else {
                System.out.printf("'%s' already in the list", objToAdd);
            }
        }
    }

    @Deprecated
    private static void addToList() {
        System.out.println("What item do you want to add: ");
        String obj = scanner.next();
        obj = obj.toUpperCase().charAt(0) + obj.substring(1).toLowerCase();
        if (!groceriesList.contains(obj)) {
            System.out.println(" -> Adding item: " + obj);
            groceriesList.add(obj);
        } else {
            System.out.println(obj + " already in the list");
        }
    }

    private static void remove() {
        System.out.println("What item would you like to remove");

        scanner.nextLine(); // clean scanner buffer
        String strList = scanner.nextLine();

        String[] item = strList.split(",");

        groceriesList.removeAll(List.of(item));
    }

    private static void checkItem () {
        scanner.nextLine();
        String obj = scanner.next();
        obj = obj.toUpperCase().charAt(0) + obj.substring(1).toLowerCase();
        System.out.print("Item" + (groceriesList.contains(obj) ? " is " : " is NOT ") + "in the list: ");
        sortAndPrint();
    }

    private static void sortAndPrint() {
        groceriesList.sort(Comparator.naturalOrder());
        System.out.println("List is ready: " + groceriesList);
    }
}
