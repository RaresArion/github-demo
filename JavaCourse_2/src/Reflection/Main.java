package Reflection;

import java.lang.reflect.Constructor;
import java.util.Arrays;

record Groceries (String name, String type, int nr) {

    public Groceries () {
        this("Apple", "Fruit", 3);
    }

    public Groceries (String name) {
        this(name, "Fruit", 3);
    }

    public String toString() {
        return "Item = " + this.name + "\nType = " + this.type + "\nNr = " + this.nr;
    }
}

public class Main {
    public static void main(String[] args) {
        Groceries gr1 = new Groceries();
        System.out.println(gr1);

        Class<Groceries> cls = Groceries.class;
        System.out.println(cls);
        System.out.println(cls.getName());
        System.out.println(cls.getSimpleName());
        System.out.println("Modifiers: " + cls.getModifiers());
        Constructor[] constructors = cls.getConstructors();
        System.out.println(Arrays.toString(constructors));
    }
}
