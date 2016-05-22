import java.util.Scanner;
import java.util.Random;

public class Mechanics {
    public Mechanics() {

    }

    int proHP = 100;
    int enemyHP = 100;
    int potionAmount = 1;
    Random generator = new Random();
    
    //Test code below
    /*public void Tutorial() {
        System.out.println("Welcome to the battle screen! Let's have a run-down on combat, shall we?");
        System.out.println("Combat works in a turn-based fashion. \n");
        System.out.println("You and your opponent both start with 100 health points, \n");
        System.out.println("And you both have access to heavy and light attacks. \n");
        System.out.println("Light attacks cause the least damage, but have less chances of missing. \n");
        System.out.println("Heavy attacks cause the most damage, but have a higher chance of missing. \n");
        System.out.println("On average, enemies will be stronger and smarter than you. However, worry not! \n");
        System.out.println("For you see, you have access to a health potion once per battle. \n");
        System.out.println("This potion restores 25 health points when used. \n");
        System.out.println("In this regard, the enemy gets zilch. Take that, vile fiend! \n");
        System.out.println("Okay, enough gabbing. LET THE BATTLE BEGIN! \n");
    }*/
    //Test code above
    
    public boolean Battle(Character prot, Enemy foe) {
        Scanner input = new Scanner(System.in);
        String battleChoice;
        
        System.out.println(" ");
        System.out.print("You have gotten into a battle." + "\n");
        System.out.println(" ");

        while(proHP > 0 && enemyHP > 0) {
            System.out.print("Your health is " + proHP + "/100" + "\n");
            System.out.print("The enemy's health is " + enemyHP +
            "/100" + "\n");
            System.out.println(" ");
            System.out.println("What would you like to do?");
            System.out.println("L for light attack.");
            System.out.println("H for heavy attack.");
            System.out.println("P for potions (once per battle).");
            battleChoice = input.nextLine();

            if (battleChoice.toLowerCase().equals("l")) {
                prolightCombat(prot, foe);
            } else if (battleChoice.toLowerCase().equals("h")) {
                proheavyCombat(prot, foe);
            } else if (battleChoice.toLowerCase().equals("p")) {
                potionSystem();
            } else {
                System.out.println(" ");
                System.out.println("You choose to do nothing.");
                System.out.println(" ");
            }
            if (proHP <= 0) {
                System.out.print("DEFEAT.");
                return(false);
            } else if (enemyHP <= 0) {
                System.out.print("VICTORY!");
                return(true);
            }

            System.out.print("The enemy's health is " + enemyHP +
                "/100" + "\n");

            int randomMiss = generator.nextInt(2);
            if (randomMiss == 0) {
                System.out.println("The enemy uses light attack.");
                enemylightCombat(prot, foe);
            }
            if (randomMiss == 1) {
                System.out.println("The enemy uses heavy attack.");
                enemyheavyCombat(prot, foe);
            }

        }
        if (proHP <= 0) {
            System.out.print("DEFEAT.");
            return(false);
        } else if (enemyHP <= 0) {
            System.out.print("VICTORY!");
            return(true);
        }
        return(true);
    }

    public void prolightCombat(Character prot, Enemy foe) {
        int protEnabler = generator.nextInt(2);
        int protdamageBooster = (prot.getStrength() % 2);
        int foedamageReduction = (foe.getEndurance() % 2);
        
        int randomDamage = (int)(5 * Math.random() + 6);
        int randomMiss = generator.nextInt(6);
        if (randomMiss != 0) {
            if (protEnabler == 0) {
                System.out.println(" ");
                System.out.println("The hit connects and deals " + (randomDamage
                + protdamageBooster) + " damage.");
                System.out.println(" ");
                enemyHP -= (randomDamage + protdamageBooster);
            } else if (protEnabler == 1) {
                System.out.println(" ");
                System.out.println("The hit connects and deals " + (randomDamage
                - foedamageReduction) + " damage.");
                System.out.println(" ");
                enemyHP -= (randomDamage - foedamageReduction);
            }
        }
        if (randomMiss == 0) {
            System.out.println(" ");
            System.out.println("The hit misses and deals no damage.");
            System.out.println(" ");
        }
    }

    public void proheavyCombat(Character prot, Enemy foe) {
        int protEnabler = generator.nextInt(2);
        int protdamageBooster = (prot.getStrength() % 2);
        int foedamageReduction = (foe.getEndurance() & 2);
        
        int randomDamage = (int)(5 * Math.random() + 11);
        int randomMiss = generator.nextInt(3);
        if (randomMiss != 0) {
            if (protEnabler == 0) {
                System.out.println(" ");
                System.out.println("The hit connects and deals " + (randomDamage
                + protdamageBooster) + " damage.");
                System.out.println(" ");
                enemyHP -= (randomDamage + protdamageBooster);
            } else if (protEnabler == 1) {
                System.out.println(" ");
                System.out.println("The hit connects and deals " + (randomDamage
                - foedamageReduction) + " damage.");
                System.out.println(" ");
                enemyHP -= (randomDamage - foedamageReduction);
            }
        }
        if (randomMiss == 0) {
            System.out.println(" ");
            System.out.println("The hit misses and deals no damage.");
            System.out.println(" ");
        }
    }

    public void enemylightCombat(Character prot, Enemy foe) {
        int foeEnabler = generator.nextInt(2);
        int foedamageBooster = (foe.getStrength() % 2);
        int protdamageReduction = (prot.getEndurance() % 2);
        
        int randomDamage = (int)(5 * Math.random() + 6);
        int randomMiss = generator.nextInt(6);
        if (randomMiss != 0) {
            if (foeEnabler == 0) {
                System.out.println(" ");
                System.out.println("The hit connects and deals " + (randomDamage 
                + foedamageBooster) + " damage.");
                System.out.println(" ");
                proHP -= (randomDamage + foedamageBooster);
            } else if (foeEnabler == 1) {
                System.out.println(" ");
                System.out.println("The hit connects and deals " + (randomDamage 
                - protdamageReduction) + " damage.");
                System.out.println(" ");
                proHP -= (randomDamage - protdamageReduction);
            }
        }
        if (randomMiss == 0) {
            System.out.println(" ");
            System.out.println("The hit misses and deals no damage.");
            System.out.println(" ");
        }
    }
    
    public void enemyheavyCombat(Character prot, Enemy foe) {
        int foeEnabler = generator.nextInt(2);
        int foedamageBooster = (foe.getStrength() % 2);
        int protdamageReduction = (prot.getEndurance() % 2);
        
        int randomDamage = (int)(5 * Math.random() + 11);
        int randomMiss = generator.nextInt(3);
        if (randomMiss != 0) {
            if (foeEnabler == 0) {
                System.out.println(" ");
                System.out.println("The hit connects and deals " + (randomDamage 
                + foedamageBooster) + " damage.");
                System.out.println(" ");
                proHP -= (randomDamage + foedamageBooster);
            } else if (foeEnabler == 1) {
                System.out.println(" ");
                System.out.println("The hit connects and deals " + (randomDamage 
                - protdamageReduction) + " damage.");
                System.out.println(" ");
                proHP -= (randomDamage - protdamageReduction);
            }
        }
        if (randomMiss == 0) {
            System.out.println(" ");
            System.out.println("The hit misses and deals no damage.");
            System.out.println(" ");
        }
    }
    
    public void potionSystem() {
        if (potionAmount > 0) {
            if (proHP + 25 <= 100) {
                proHP += 25;
                potionAmount--;
                System.out.println(" ");
                System.out.println("You use your only potion and feel replenished");
                System.out.println(" ");
            } else {
                proHP = 100;
                potionAmount--;
                System.out.println(" ");
                System.out.println("You use your only potion and feel replenished");
                System.out.println(" ");
            }
        } else {
            System.out.println("You had no potions. You skip a turn.");
        }
    }
}