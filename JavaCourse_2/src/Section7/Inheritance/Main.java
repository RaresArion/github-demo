package Section7.Inheritance;

public class Main extends Object {
    public static void main(String[] args) {
//        doAnimalStuff(new Animal("Generic Animal", "big", 15.6), "fast");
//        doAnimalStuff(new Animal(), "slow");
//
//        Dog dog = new Dog();
//        doAnimalStuff(dog, "fast");

        Animal dog = new Dog("Wolf", 36);
        doAnimalStuff(dog, "fast");
        Dog dog2 = new Dog("Wolf", 36);
        doAnimalStuff(dog2, "fast");

//        Dog yorkie = new Dog("Yorkie", 15);
//        doAnimalStuff(yorkie, "fast");
//
//        Dog retriever = new Dog ("Labrador Retriever", 65,
//                "Floppy", "Swimmer");
//        doAnimalStuff(retriever, "slow");
//
//        Dog wolf = new Dog ("Wolf", 40);
//        doAnimalStuff(wolf, "slow");
//
//        Fish goldie = new Fish("Goldfish", 0.25, 2, 3);
//        doAnimalStuff(goldie, "fast");
//        Student std = new Student("John", 26);
////        System.out.println(std);
//        PrimarySchoolStudent std1 = new PrimarySchoolStudent("John", 26, "Madam Carla");
//        System.out.println(std1);

    }


    public static void doAnimalStuff (Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");
    }
}

class Student {

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class PrimarySchoolStudent extends Student{

    private String parentName;

    public PrimarySchoolStudent (String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return "PrimarySchoolStudent{" +
                "parentName='" + parentName + '\'' +
                "} " + super.toString();
    }
}
