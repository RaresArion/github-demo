package Section7.RandomStuff;


import java.util.ArrayList;
import java.util.List;
/*
*   This is an ex from CSIE_04
*   It shows that variables can NOT be overloaded
*   If, at compiling time, I define an obj as the parent class it will see only the variables from the parent class
*   Not the same for methods
*       => if I use getI() it will display the value for 'i' from B,
*           but using 'a.i' it will give me value from A for that variable
* */
class A {
    int i = 325;

    public void doSmth() {
        System.out.println("Doing something from A");
    }
}

class B extends A {
    int i = 827;

    public void doSmth() {
        System.out.println("Doing something from B");
    }
}

public class Main {
    public static void main(String[] args) {

        List<Integer> marks = new ArrayList<Integer>();
        marks.add(91);
        marks.add(73);
        marks.add(21);
        System.out.println("Bla");

//        marks.remove(21);

        for (Integer x : marks) {
            System.out.println(x + " ");
        }
    }
}
