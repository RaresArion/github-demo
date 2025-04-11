package Section11.AbstractClasses;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //    Animal animal = new Animal ("animal", "big", 100);
        Dog dog = new Dog("Wolf", "big", 100);

        ArrayList<Animal> animal = new ArrayList<>();
        animal.add(dog);
        animal.add(new Dog("German Shepard", "big", 150));
        animal.add(new Fish("Goldfish", "small", 1));
        animal.add(new Fish("Barracuda", "big", 75));
        animal.add(new Dog("Pug", "small", 20));
        animal.add(new Horse("Clydesdale", "large", 1000));

        for (int i = 0; i < animal.size(); i++) {
            doAnimalStuff(animal.get(i));
            System.out.println("-----------------");
        }
//        dog.makeNoise();
//        doAnimalStuff(dog);


    }

    private static void doAnimalStuff (Animal animal) {
        System.out.println(animal.getExplicitType());
        animal.makeNoise();
        animal.move("slow");
        if (animal instanceof Mammal currentMammal) {
            ((Mammal) animal).shedHair();
        }
    }
}
