public class Player {
    private String name;
    private int healthPercentage;
    private String weapon;

    public Player(String name, int healthPercentage, String weapon) {
        this.name = name;
        this.healthPercentage = healthPercentage > 100 ? 100 : healthPercentage < 0 ? 0 : healthPercentage;
        this.weapon = weapon;
    }

    public int healthRemaining() {
        return this.healthPercentage;
    }

    public void loseHealth(int damage) {
        this.healthPercentage -= damage;
        if (this.healthPercentage < 0) {
            this.healthPercentage = 0;
            System.out.println(name + " player has been knocked out of game");
        }
    }

    public void restoreHealth(int health) {
        this.healthPercentage += health;
        if (this.healthPercentage > 100) {
            this.healthPercentage = 100;
        }
    }
}
