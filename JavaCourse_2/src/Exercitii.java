import java.time.Month;

public class Exercitii {

    public static void checkNumber_2 (int number) {
        if (number > 0) {
            System.out.println("The number " + number + " is positive");
        } else if (number < 0) {
            System.out.println("The number " + number + " is negative");
        } else {
            System.out.println("The number " + number + " is null");
        }
    }
    // Section 5 Ex 1
    public void checkNumber (int number) {
        if (number > 0) {
            System.out.println("The number " + number + " is positive");
        } else if (number < 0) {
            System.out.println("The number " + number + " is negative");
        } else {
            System.out.println("The number " + number + " is null");
        }
    }
    // Section 5 Ex 2
    public static long toMilesPerHour (double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        double oneMilePerHour = 1.609;
        long milesPerHour = Math.round(kilometersPerHour / oneMilePerHour);

        return milesPerHour;
    }

    public void printConversion (double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);

            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }

    // Section 5 Ex 3
    public static void printMegaBytesAndKiloBytes (int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int oneMb = 1024;
            int megaBytes = kiloBytes / oneMb;
            int remainingKB = kiloBytes % oneMb;

            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKB + " KB");
        }
    }

    // Section 5 Ex 4
    public static boolean shouldWakeUp (boolean barking, int hourOfDay) {
        if ((hourOfDay < 0) || (hourOfDay > 23)) {
            return false;
        }
        if (barking && ((hourOfDay < 8) || (hourOfDay > 22))) {
            return true;
        } else {
            return false;
        }
    }

    // Section 5 Ex 5
    public static boolean isLeapYear (int year) {
        if (!(year >= 1) || !(year <= 9999)) {
            return false;
        }
        if ((year % 4 == 0) && !(year % 100 == 0)) {
            return true;
        }
        if ((year % 100 == 0) && (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
    // Section 5 Ex 6
    public static boolean areEqualByThreeDecimalPlaces (double x, double y) {
        return (int) (x*1000) == (int) (y*1000);
    }
    public static boolean areLastThreeDecimalEqual (Double x, Double y) {
        String a = x.toString();
        String b = y.toString();
        String a1 = "";
        String b1 = "";
        int k = a.length() - 1;
        int l = b.length() - 1;
        while (k > a.length() - 1 - 3) {
            a1 = a1 + a.charAt(k);
            b1 = b1 + b.charAt(l);
            k--;
            l--;
        }
        System.out.println("Str a1: " + a1);
        System.out.println("Str b1: " + b1);

        return a1.equals(b1);
    }

    // Section 5 Ex 7
    public static boolean hasEqualSum (int a, int b, int c) {
        return a + b == c;
    }

    // Section 5 Ex 8
    public static boolean hasTeen (int a, int b, int c) {
        return (a >= 9 && a <= 19) || (b >= 9 && b <= 19) || (c >= 9 && c <= 19);
    }
    public static boolean isTeen (int a) {
        return a >= 13 && a <= 19;
    }

    // ****************************************
    // Section 5 - 45 if-then-else challenge
    // ****************************************
    public static void s5_45 (int levelsGave, int scoreGave, int bonus) {
        boolean gameOver = true;

        System.out.println("Your final score was " + s5_45_Support(levelsGave, bonus, gameOver, scoreGave));
    }
    private static int s5_45_Support (int levelCompleted, int bonus, boolean gameOver, int score) {
        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
        }
        return finalScore;
    }

    public static void displayHighScorePosition (String playerName, int scorePosition) {
        System.out.println(playerName + " managed to get into position " + scorePosition + " on the high score list");
    }
    public static int calculateHighScorePosition (int playerScore) {
//        int scoreId;
//        if (playerScore >= 1000) {
//            scoreId = 1;
//        } else if (playerScore >= 500 && playerScore < 1000) {
//            scoreId = 2;
//        } else if (playerScore >= 100 && playerScore < 500) {
//            scoreId = 3;
//        } else {
//            scoreId = 4;
//        }
//        return scoreId;
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
        }
        System.out.println("return 4");
        return 4;
    }

    // ****************************************
    // Section 5 - 53 Overloaded challenge
    // ****************************************
    public static double convertToCentimeters (int inch) {
        double cmCt = 2.54;
        System.out.println(inch + " inch = " + inch * cmCt + " cm");
        return inch * cmCt;
    }
    public static double convertToCentimeters (int feet, int inch) {
        int inchCt = 12;
        int totalInch = (feet * inchCt) + inch;
        System.out.println("Total inches for " + feet + " feet and " +
                inch + " inches = " + totalInch + " inch");
        return convertToCentimeters(totalInch);
    }
    // ****************************************
    // Section 5 - 54 Overloaded challenge
    // ****************************************
    public static String getDurationString (int seconds) {
        if (seconds < 0) {
            return "Invalid value (" + seconds + ")";
        }
        int minutes = seconds / 60;
        int remainedSec = seconds % 60;

        return getDurationString(minutes, remainedSec);
    }
    public static String getDurationString (int minutes, int seconds) {
        if (minutes < 0) {
            return "Number of minutes is invalid (" + minutes + ")";
        } else if (seconds < 0 || seconds > 59) {
            return "Number of seconds is invalid (" + seconds + ")";
        }

        int hours = (minutes / 60);
        int remainedMin = minutes % 60;

        return hours + "h " + remainedMin + "m " + seconds + "s";
    }

    // ****************************************
    // Section 5 - Codding Ex 9
    // ****************************************
    public static double area (double radius) {
        if (radius < 0) {
            System.out.print("Circle Invalid value: ");
            return -1.0;
        }
        double area = Math.PI * radius * radius;
        return area;
    }
    public static double area (double x, double y) {
        if (x < 0 || y < 0) {
            System.out.print("Rectangle Invalid value: ");
            return -1.0;
        }
        return x * y;
    }

    // ****************************************
    // Section 5 - Codding Ex 10
    // ****************************************
    public static void printYearsAndDays (long minutes) {
        if (minutes < 0) {
            System.out.print("Invalid value: " + minutes);
            return;
        }
        if (minutes == 0) {
            System.out.println(minutes + " min = " + minutes + " y and " + minutes + " d");
            return;
        }
        long hours = (minutes / 60);
        int days = (int) hours / 24;
        int years = days / 365;
        int remainedDays = days % 365;

        System.out.println(minutes + " min = " + years + " y and " + remainedDays + " d");
    }

    // ****************************************
    // Section 5 - Codding Ex 11
    // ****************************************
    public static void printEqual (int a, int b, int c) {
        if(a < 0 || b < 0 || c < 0) {
            System.out.println("Invalid Value");
            return;
        }
        if (a == b && a == c) {
            System.out.println("All numbers are equal");
        } else if (a != b && a != c && b != c) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }

    // ****************************************
    // Section 5 - Codding Ex 12
    // ****************************************
    public static boolean isCatPlaying (boolean summer, int temperature) {
        if (summer && (temperature >= 25 && temperature <= 45)) {
            return true;
        }
        if (!summer && (temperature >= 25 && temperature <= 35)) {
            return true;
        }
        return false;
    }

    // ****************************************
    // Section 6 - Codding Ex 13
    // ****************************************
    public static void printNumberInWord (int number) {
        if (number == 0) {
            System.out.println("ZERO");
        } else if (number == 1) {
            System.out.println("ZERO");
        } else if (number == 2) {
            System.out.println("TWO");
        } else if (number == 3) {
            System.out.println("THREE");
        } else if (number == 4) {
            System.out.println("Four");
        } else if (number == 5) {
            System.out.println("FIVE");
        } else if (number == 6) {
            System.out.println("SIX");
        } else if (number == 7) {
            System.out.println("SEVEN");
        } else if (number == 8) {
            System.out.println("EIGHT");
        } else if (number == 9) {
            System.out.println("NINE");
        } else {
            System.out.println("OTHER");
        }
    }

    // ****************************************
    // Section 6 - Codding Ex 14
    // ****************************************
    public static boolean isLeapYear_2 (int year) {
        if ((year < 1) || (year > 9999)) {
            return false;
        }
        System.out.println(year);
        if ((year % 4 == 0) && (year % 100 != 0)) {
            return true;
        }
        if ((year % 400 == 0)) {
            return true;
        }
        return false;
    }

    public static int getDaysInMonth (int month, int year) {
        if (month < 1 || month > 12) {
            return -1;
        }
        if (year < 1 || year > 9999) {
            return -1;
        }
        Month monthObj;
        boolean isLeapYear = isLeapYear_2(year);

        monthObj = Month.of(month);
        System.out.println(monthObj.name() + " has " + monthObj.length(isLeapYear));
        return monthObj.length(isLeapYear);
    }

    // ****************************************
    // Section 6 - Codding Ex 15
    // ****************************************
    public static boolean isOdd (int number) {
        if (number < 0) {
            return false;
        }
        return number % 2 != 0;
    }
    public static int sumOdd (int start, int end) {
        if (end < start || end < 0 || start < 0) {
            return -1;
        }
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)){
                sum = sum + i;
            }
        }
        return sum;
    }

    // ****************************************
    // Section 6 - Ep 61 - Exercise for loop
    // ****************************************
    public static double calculateInterest (double amount, double interest) {
        return (amount * (interest / 100));
    }
    public static void moreInterests (double amount, double minInterest, double maxInterest) {
        for (double i = minInterest; i <= maxInterest; i += 0.25) {
            System.out.println("10,000 at " + i + "% interest = " + calculateInterest(amount, i));
            if (i == 8.50) {
                System.out.println("Interest rate is at: " + i);
                break;
            }
        }
    }

    // ****************************************
    // Section 6 - Ep 62 - Exercise for loop
    // ****************************************
//    public static boolean isPrime (int wholeNumber) {
//        if (wholeNumber <= 2) {
//            return wholeNumber == 2;
//        }
//        for (int i = 2; i <= wholeNumber / 2; i++) {
//            System.out.println(wholeNumber + " % " + i + " == " + (double)(wholeNumber % i));
//            if (wholeNumber % i == 0) {
//                //System.out.println(wholeNumber + " is NOT prime");
//                return false;
//            }
//        }
//        return true;
//
//    }
    private static boolean isPrime(int number) {
        if (number <= 2) {
            return number == 2;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    private static void checkMoreNumbers(int start, int end, int counterLimit) {
        int primeCounter = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                primeCounter++;
                System.out.println(i + " is prime and counter is " + primeCounter);
            }
            if (primeCounter == counterLimit) {
                break;
            }
        }
        System.out.println("\nPrime Counter is " + primeCounter);
    }

    public static void callCheckMoreNumbers (Integer start, Integer end, Integer counterLimit) {
        if (start == null) {
            checkMoreNumbers(0, end, counterLimit);
        } else if (end == null) {
            checkMoreNumbers(start, 1000, counterLimit);
        } else if (counterLimit == null) {
            checkMoreNumbers(start, end, 3);
        } else {
            checkMoreNumbers(start, end, counterLimit);
        }
    }

    // ****************************************
    // Section 6 - Ep 62 - Exercise for loop
    // ****************************************
    public static void sum3And5 () {
        int sum = 0;
        int countNumbers = 0;
        for (int i = 1; countNumbers < 5 && i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Condition met by " + i);
                sum = sum + i;
                countNumbers++;
            }
        }
        System.out.println("Sum is: " + sum);
    }
    // ****************************************
    // Section 6 - Codding Ex 16
    // ****************************************
    public static boolean isPalindrome (int number) {
        if (number < 0) {
            number = (-1) * number;
        }

        int reverse = 0;
        int tmpNr = number;
        while (number > 0) {
            reverse *= 10;
            reverse = reverse + number % 10;
            number /= 10;
        }

        return tmpNr == reverse;
    }

    // ****************************************
    // Section 6 - Codding Ex 17
    // ****************************************
    public static int sumFirstAndLastDigit (int number) {
        if (number >= -9 && number <= 9) {
            return number * 2;
        }
        boolean isNegative = false;
        int first = number / 10;
        if (number < 0) {
            number = (-1) * number;
            isNegative = true;
        }
        int last = number % 10;
        while (number >= 10) {
            first = number / 10;
            number /= 10;
        }
        if (isNegative) {
            first = (-1) * first;
        }

        return first + last;
    }

    // ****************************************
    // Section 6 - Codding Ex 18
    // ****************************************
    public static int getEvenDigitSum (int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {
            if ((number % 10) % 2 == 0) {
                sum = sum + number % 10;
            }
            number /= 10;
        }
        return sum;
    }

    // ****************************************
    // Section 6 - Codding Ex 19
    // ****************************************
    public static boolean hasSharedDigit (int x, int y) {
        if ((x < 10 || x > 99) || (y < 10 || y > 99)) {
            return false;
        }

        int a, b, c, d;
        a = x % 10;
        b = x / 10;
        c = y % 10;
        d = y / 10;

        if (a == c || a == d) {
            return true;
        } else if (b == c || b == d) {
            return true;
        }

        return false;
    }

    public static void ArrEx () {

    }


}























