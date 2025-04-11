package Section7;

public class StringBuilderEx {
    public static void main(String[] args) {

        // 1. Comparing String and StringBuilder
        String helloWorld = "Hello" + " World"; // imutable
        helloWorld.concat(" and Goodbye");
//        StringBuilder helloWorldBuilder = "Hello" + "World"; // can't do this
        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World"); // mutable
        helloWorldBuilder.append(" and Goodbye");
//        printInfo(helloWorld);
//        printInfo(helloWorldBuilder);

          /*
          * 2. Capacity and mutability
              A String builder starts at 16 slots of capacity (chars) and after that it starts asking for more
              Allocation is determined by JVM
          * */
        StringBuilder emptyStringBuilder = new StringBuilder();
        emptyStringBuilder.append("a".repeat(17));
        StringBuilder emptyStringBuilder32 = new StringBuilder(32); // I can put wtv capacity I want
        emptyStringBuilder32.append("a".repeat(17));

//        printInfo(emptyStringBuilder);
//        printInfo(emptyStringBuilder32);

        /*
            3. Methods for StringBuilder
                .deleteCharAt()
                .insert()
                .append()
                .replace()
                .reverse()
                .setLength(int x) // the string will be just x chars long
         */
        StringBuilder builderPlus = new StringBuilder("Hello" + " World");
        builderPlus.append(" and Goodbye");
        builderPlus.deleteCharAt(16).insert(16, 'g');
        printInfo(builderPlus);
        System.out.println(" - - - - - ");
        builderPlus.replace(16, 17, "G");
        printInfo(builderPlus);
        System.out.println(" - - - - - ");
        builderPlus.reverse().setLength(7);
        printInfo(builderPlus);


    }



    public static void printInfo (String string) {
        System.out.println("String = " + string);
        System.out.println("Length = " + string.length());
    }

    public static void printInfo (StringBuilder builder) {
        System.out.println("StringBuilder = " + builder);
        System.out.println("Length= " + builder.length());
        System.out.println("Capacity = " + builder.capacity() );
    }
}
