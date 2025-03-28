package Section8.Encapsulation;

public class Player {

    private String name, weapon;
    private int health;

    public Player(String name) {
        this(name, "Sword", 100);
    }

    public Player (String name, String weapon, int health) {
        this.name = name;
        this.weapon = weapon;
        if (health <= 0) {
            this.health = 1;
        } else {
            this.health = Math.min(100, health);
        }


    }

    public void loseHealth (int damage) {
        if (damage > 0) {
            System.out.println("You took " + damage + " damage");
            this.health = this.health - damage;
            if (this.health <= 0) {
                System.out.println("You are dead!");
            } else if (this.health == 1) {
                System.out.println("You are lying on the ground unable to move");
            }
        } else {
            System.out.println("You didn't take any damage");
        }
    }

    public void restoreHealth (int extraHealth) {
        if (extraHealth > 0) {
            this.health = this.health + extraHealth;
            if (this.health > 100) {
                this.health = 100;
            }
            System.out.println("You've got " + extraHealth + " health");
        } else {
            System.out.println("You didn't get healed");
        }

    }

    public int healthRemaining () {
        return this.health;
    }

    public String getName() {
        return this.name;
    }
}
