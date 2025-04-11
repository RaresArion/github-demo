package Section7.Inheritance.Challenge_1;

public class Main {
    public static void main(String[] args) {

//        Worker w1 = new Worker("John", "1945", "1996");
//        System.out.println(w1);
//
        Employee e1 = new Employee("Mathew", "1935", "1996", "1952");
//        System.out.println(e1);
        e1.display();
        e1.display2();
        Employee e2  = new SalariedEmployee("Marcel",
                "1965", "1989", "1933", 7000.214);
        e2.display();
        e2.display2();
        SalariedEmployee sE1 = new SalariedEmployee("Marcel",
                    "1965", "1989", "1933", 7000.214);
        sE1.display();
        sE1.display2();

    }

}

