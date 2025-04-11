package Section10.Enummeration;

import java.util.Random;

public class Main {
    public static void main(String[] args) {


        DayOfTheWeek weekDay = DayOfTheWeek.MON;
//        System.out.println(weekDay);
//        System.out.println(weekDay.getDeclaringClass());
//        System.out.println(weekDay.getClass());
        System.out.printf("Name is %s, \n\tOrdinal value = %d%n", weekDay, weekDay.ordinal());

        DayOfTheWeek dayOfTheWeek = getRandomDay();
//        System.out.println(dayOfTheWeek);
//        System.out.println(weekDay.ordinal() + 1);
//        switchDayOfWeek(dayOfTheWeek);

//        Topping topping = Topping.MUSTARD;
        for (Topping topping : Topping.values()) {
            System.out.println("[" + (topping.ordinal() + 1) + "] " + topping.name() + " costs " + topping.getPrice());
        }
    }

    public static DayOfTheWeek getRandomDay () {
        int randomInt = new Random().nextInt(7);
        DayOfTheWeek[] allDays = DayOfTheWeek.values();
//        System.out.println(Arrays.toString(DayOfTheWeek.values()));
//        System.out.println(DayOfTheWeek.valueOf("FRI"));
        return allDays[randomInt];
    }


    public static void switchDayOfWeek (DayOfTheWeek dayOfTheWeek) {
        int weekDatInt = dayOfTheWeek.ordinal() + 1;
        switch (dayOfTheWeek) {
            case SUN -> System.out.println("Sunday is Day " + weekDatInt);
            case MON -> System.out.println("Monday is Day " + weekDatInt);
            case TUES -> System.out.println("Tuesday is Day " + weekDatInt);
            case WED -> System.out.println("Wednesday is Day " + weekDatInt);
            case THURS -> System.out.println("Thursday is Day " + weekDatInt);
            case FRI -> System.out.println("Friday is Day " + weekDatInt);
            case SAT -> System.out.println("Saturday is Day " + weekDatInt);
        }
    }
}
