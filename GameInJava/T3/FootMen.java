package Testing.T3;

public class FootMen extends MilitaryUnits{

    private String weapon;
    private String[] weapons = {"Axe", "Great Sword", "Spear"}; // similar to (rock paper scissor)

    public FootMen(double hp) {
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
