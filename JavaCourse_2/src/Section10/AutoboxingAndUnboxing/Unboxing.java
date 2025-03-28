package Section10.AutoboxingAndUnboxing;

public class Unboxing {
    public static void main(String[] args) {
        Integer boxedValue = 16;
        int unboxedValue = boxedValue.intValue();
        int autoUnboxValue = boxedValue;
        System.out.println(boxedValue.getClass().getSimpleName());
        System.out.println(unboxedValue);
        System.out.println(autoUnboxValue);
    }
}
