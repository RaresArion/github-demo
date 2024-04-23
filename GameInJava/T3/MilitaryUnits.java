package Testing.T3;

import java.util.*;

public class MilitaryUnits implements Units{
    private int age;
    private String name;
    private double hp;
    private double speed;


    private String[] names = {"Teut", "Raresel", "Rarut", "Dodola", "Rares", "Teo"};

    Random random = new Random();


    // CONSTRUCTOR
    public MilitaryUnits(double hp) {
        this.age = random.nextInt(18, 30);
        this.name = names[random.nextInt(names.length)];
        this.hp = hp;
    }



    // METHODS
    public String duties() {
        return "This unit is here to Protect and Attack";
    }
    public String getWeapon() {
        return "No weapon for this unit. Accessing 'MilitaryUnits' class";
    }


    // FACTORY METHOD
    public static Units getType(String type) {
        switch (type) {
            case "m1" : return new Archer(60);
            case "m2" : return new FootMen(70);
            case "m3" : return new MilitaryUnits(80);
            case "m4" : return new MilitaryUnits(90);
            case "m5" : return new MilitaryUnits(100);
            default : return new Peasents(45);
        }
    }



    public String toString(){
        return String.format("%s:\n\tName: %s\n\tAge: %d\n\tHP: %.2f\n",
                this.getClass().getSimpleName(),
                this.name,
                this.age,
                this.hp);
    }
}
