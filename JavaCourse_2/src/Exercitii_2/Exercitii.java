package Exercitii_2;


public class Exercitii {

    public static void isWorking() {
        System.out.println("Hello, World!");
    }


    // ******************************************
    // S6 Ex25
    // UNFINISHED
    // ******************************************
    public static boolean canPack (int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
//            System.out.println("1===== if");
            return false;
        }
        int oneBig = 5; // kg
        int oneSmall = 1; // kg
        int totalKg = oneBig * bigCount + oneSmall * smallCount;

        if (goal < (oneBig * bigCount) && (goal % (oneBig * bigCount)) != goal) {
//            System.out.println("2===== if");
            return false;
        } else if (totalKg >= goal) {
//            System.out.println("3===== if");
            return true;
        }
//        System.out.println("4===== last line");
        return false;
//
//        if (totalKg > goal) {
//
//        }
//        System.out.println(oneBig * bigCount + oneSmall * smallCount == goal);
//        System.out.println();
//        System.out.println();
//        return true;
    }

    // ******************************************
    // S6 Ex26
    // ******************************************
    public static int getLargestPrime (int number) {
        if (number < 1) {
            return -1;
        }
        int largest = 0;
        for (int i = 2; i <= number; i++ ) {
            if (number % i == 0) {
                if(!compareNr(i)) {
                    largest = i;
                }
                //System.out.println();
            }
        }

        return largest;
    }

    public static boolean compareNr (int x) {
//        System.out.print("x = " + x + " -> ");
        for (int j = 2; j <= x/2; j++) {
//            System.out.print("j = " + j + " ");
            if (x % j == 0) {
//                System.out.print("=> " + x + " (Is NOT prime) ");
                return true;
            }
        }
//        System.out.print("=> " + x + " (Is prime) ");
        return false;
    }

    public static int getLargestPrime_2 (int number) {
        if (number < 1) {
            System.out.println("First if");
            return -1;
        }
        int largest = 0;
        for (int i = 2; i <= number; i++ ) {
            if (number % i == 0) {
//                System.out.print(i + " -> ");
                for (int j = 2; j <= i/2; j++) {
                    if (i % j == 0) {
//                        System.out.print(j + " ");
                        largest = i;
                    }
                }
//                System.out.println();
            }
        }
        System.out.println("Last line");
        return largest;
    }


    // ******************************************
    // S6 Ex27
    // ******************************************
    public static void printSquareStar (int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                if ((i == 1 || i == number)) {
                    System.out.print("*");
                } else if (j == 1 || j == number) {
                    System.out.print("*");
                } else if (i == j) {
                    System.out.print("*");
                } else if (j == number - i + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // ******************************************
    // returns a number in words:
    // 1234 -> One Two Three Four
    // ******************************************
    public static void numberToWords (int x) {
        Integer number = x;
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
        // display the reverse number
//        for (int s : arr2) {
//            System.out.print(s + " ");
//        }
        // display the words:
        for (int j = arr2.length - 1; j >= 0; j--) {
            System.out.print(arr1[arr2[j]] + " ");
        }
    }
    public static int reverse (int number) {
        int tmp = 0;
        boolean isNegative = false;
        if (number < 0) {
            number = (-1)*number;
            isNegative = true;
        }
        while (number > 0) {
            tmp = tmp*10;
            tmp = tmp + (number % 10);
            number /= 10;
        }
        if(isNegative) {
            return -tmp;
        }
        return tmp;
    }
    public static int getDigitCount (int number) {
        if (number < 0) {
            return -1;
        }
        int counter = 0;
        do {
            number = number / 10;
            counter++;
        } while (number > 0);
        return counter;
    }




}