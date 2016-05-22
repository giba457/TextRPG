public class Thief extends Enemy {
    int strength, endurance;
    
    public Thief() {
        //hp = 100;
        strength = 5;
        endurance = 7;
    }
    public int getStrength() {
        return(strength);
    }
    /*
    public int getHealth() {
        return(hp);
    }
    */
    public int getEndurance() {
        return(endurance);
    }
}