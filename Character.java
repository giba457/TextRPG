public class Character {
    private int maxHP, strength, endurance, health;
    private String name, weapontype, chartype;
    public Character(String nm) {
        name = nm;
        health = 100;
        strength = 10;
        endurance = 10;
    }
    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    }
    public int getStrength() {
        return strength;
    }
    public int getEndurance() {
        return endurance;
    }
    public void addOffenseBoost(int oPoints) {
        strength += oPoints;
    }
    public void addDefenseBoost(int dPoints) {
        endurance += dPoints;
    }
    public void Die() {
        System.out.println("You have failed in your mission and have died.");
        System.out.println("GAME OVER");
        System.exit(0);
    }
}