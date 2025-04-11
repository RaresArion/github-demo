package Testing.T3;

public class Peasents extends MilitaryUnits{

    private String weapon;
    private String[] weapons = {"Bata", "Old sword", "furca"};

//    public Peasents(double hp) {
//        super(hp);
//        this.weapon = weapons[random.nextInt(weapons.length)];
//    }

    public Peasents(double hp) {
        super(hp);
        this.weapon = weapons[random.nextInt(weapons.length)];
    }

    public String toString() {
        return super.toString() + "\tWeapon: %s\n".formatted(this.weapon);
    }

    public String getWeapon() {
        return this.weapon;
    }
}
