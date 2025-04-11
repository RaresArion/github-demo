package ImportantStuff;

import Section8.Polymorphism.Adventure;
import Section8.Polymorphism.Comedy;
import Section8.Polymorphism.Movie;
import Section8.Polymorphism.ScienceFiction;

import java.util.Scanner;

public class Main {
    public static void maine(String[] args) {

    }
    // ******************************************
    // prints / finds if a number is prime or not
    // ******************************************
    public static boolean isPrime (int wholeNumber) {
        if (wholeNumber <= 2) {
            return wholeNumber == 2;
        }
        for (int i = 2; i <= wholeNumber / 2; i++) {
            System.out.println(wholeNumber + " % " + i + " == " + (double)(wholeNumber % i));
            if (wholeNumber % i == 0) {
                //System.out.println(wholeNumber + " is NOT prime");
                return false;
            }
        }
        return true;
    }

    // ******************************************
    // returns a number in words:
    // 1234 -> One Two Three Four
    // ******************************************
    public static void numberToWords (Integer number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        String[] arr1 = new String[] {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        int[] arr2 = new int[number.toString().length()];
        int i = 0;
        while (number > 0) {
            arr2[i] = (number % 10);
            i++;
            number = number / 10;
        }
        for (int s : arr2) {
            System.out.print(s + " ");
        }
        System.out.println();
        for (int j = arr2.length - 1; j >= 0; j--) {
            System.out.print(arr1[arr2[j]] + " ");
        }
    }

    // ******************************************
    // A very complicated way to get name and birth
    //    from user
    // Section 6 - Ep 72 - 74
    // ******************************************
    public static void printNameAndBirth () {

        int currentYear = 2025;
        String userDateOfBirth = "1999";

        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }
    }

    // Method one of getting input. This will fail because for this I have to start the program from console
    public static String getInputFromConsole (int currentYear) {

        String name = System.console().readLine("Hi! What's your name?");
        System.out.println("Hi " + name + ", thanks for taking this course!");

        String dateOfBirth = System.console().readLine("What year were you born?\n");
        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "So you are " + age + " years old";
    }
    // Second method of getting user input
    public static String getInputFromScanner (int currentYear) {
        Scanner scanner = new Scanner(System.in); // instantiating scanner object

        // Getting user's name
        System.out.println("Hi! What's your name?");
        String name = scanner.nextLine();
        System.out.println("Hi " + name + ", thanks for taking this course!");

        // Asking for year of birth
        System.out.println("What year were you born?");
        boolean validDOB = false; // this will be used to redo the do-while in case the data passed is NOT VIABLE
        int age = 0;
        do {
            System.out.println("Enter a year of birth >= " + (currentYear - 125) + " and <= " + (currentYear));
            try {
                // getting the birth year directly in the calling method and pass it to be checked
                age = checkDate(currentYear, scanner.nextLine()); // works because the error is here and jumps to 'catch' so validDOB remains false
                validDOB = age < 0 ? false : true; // if age = -1 it the method will run again
            } catch (NumberFormatException e) {
                System.out.println("Characters not allowed!!! Try again!");
            }
        } while (!validDOB);

        return "So you are " + age + " years old";
    }

    // checks if the date
    public static int checkDate (int currentYear, String dateOfBirth) {
        int dob = Integer.parseInt(dateOfBirth); // this is what throws the error
        int minimumYear = currentYear - 125;

        if ((dob < minimumYear) || (dob > currentYear)) {
            return -1;
        }
        return currentYear - dob;
    }


    // ******************************************
    // S6 Ep74
    // Get 5 integers from the user
    // ******************************************
    public static void getNumbers () {
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        int i = 1; // numbers of digits, I need a total of 5 numbers for this ex
        int sum = 0; // sum of all 5 numbers
        boolean isNr = true;

        do {
            System.out.print("Enter number #" + i + ": ");
            String nr = scanner.nextLine();
            try {
                x = Integer.parseInt(nr); // this throws the error
                sum = sum + x;
                i++;
                isNr = checkI(i); // instead of this I can just put i <= 5 in the while
            } catch (NumberFormatException e) {
                System.out.println("!!!Invalid number!!!");
            }
        } while (isNr); // here I can just place i <= 5
        System.out.println("We are out of the do-while");
        System.out.println("Sum of numbers is: " + sum);
    }

    public static boolean checkI (int i) {
        return i <= 5;
    }

    // ******************************************
    // Record:
    // Is a POJO class. This class has methods by default:
    // - getters defined as 'public String id() {return id}'
    // - toString
    // POJOs are classes used for creating entries in DBs for examples
    // ******************************************
    public record LPAStudent (String id, String name, String dateOfBirth, String classList) {

    }

    // ******************************************
    // Factory method: (Design Pattern)
    // Place this into a parent class -> check Section 8 - Polymorphism - Movie
    // ******************************************
    public static Movie getMovie (String type, String title) {
        System.out.println(type.toUpperCase().charAt(0));
        return switch (type.toUpperCase().charAt(0)) {
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);
            default -> new Movie(title);
        };
    }
// Use the above with this
    //        Scanner s = new Scanner (System.in);
//        while(true) {
//            System.out.println("Options");
//            System.out.printf(" - %s%n".repeat(3),
//                    "A - Adventure",
//                    "C - Comedy",
//                    "S - Science Fiction",
//                    "Q - Quit");
//
//            String movieType = s.nextLine();
//            if ("Qq".contains(movieType)) {
//                break;
//            }
//            System.out.println("Enter a Movie Title: ");
//            String title = s.nextLine();
//            Movie movie = Movie.getMovie(movieType, title);
//            movie.watchMovie();
//        }
}
