package Section9.VarArgs;
/*
*   There can be only one Vararg
*   Vararg has to be last arg in a method
* */
public class Vargs {
    public static void main(String[] args) {

        String[] splitStrings = "Rares are mere".split(" ");
        printText(splitStrings);
        System.out.println();
        System.out.println("-".repeat(20));
        printText("Hello", "World", "Again");

        System.out.println("\n" + "-".repeat(20));
        printText();
        String[] sArray = {"first", "second", "third", "fourth", "fifth"};
        System.out.println(String.join(" <-> ", sArray));

    }

    private static void printText(String... textList) {

//        for (int i = textList.length - 1; i >= 0; i--) {
//            if (i == textList.length - 1) {
//                System.out.print(textList[i].toUpperCase().charAt(0) + textList[i].substring(1) + " ");
//            } else {
//                System.out.print(textList[i] + " ");
//            }
//        }
//        System.out.println();
        for (String t : textList) {
            System.out.print(t+" ");
        }
    }
}
