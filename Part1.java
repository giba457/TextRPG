import java.util.Scanner;
public class Part1 {
    public Part1() {
        
    }
    public void PartOne(Character prot, String ENTER, Scanner input) {
        String dump;
        boolean victory;
        System.out.println("\n\n\nPart 1: The Rogue Encounter\n\n");
        System.out.println("You stand silently, heart still racing, as you stare down the man");
        System.out.println("advancing steadily toward you.  You wouldn’t normally be so worked");
        System.out.println("up by that, but this man in particular happens to be holding a");
        System.out.println("knife out in front of him.\n");
        System.out.println("That tends to change things.\n");
        
        System.out.print(ENTER);
        dump = input.nextLine();
        
        System.out.println("This was NOT how you planned for today to go.  Sure, it was supposed");
        System.out.println("to be a day that changed your life, but its end wasn’t the change you");
        System.out.println("had imagined would take place.  By all accounts, there was a chance");
        System.out.println("you could die here.\n");
        System.out.println("Swallowing your fear, you unsheathe your blade, and prepare your");
        System.out.println("body for battle.\n");
        
        System.out.print(ENTER);
        dump = input.nextLine();
        
        System.out.println("*50 Minutes Earlier*\n");
        System.out.println("Man, FINALLY done with that accursed application.  You feel frustrated");
        System.out.println("that it took so long for you to muscle through. Its length, combined");
        System.out.println("with your initial hesitance, made this whole affair way too time-consuming.\n");
        
        System.out.print(ENTER);
        dump = input.nextLine();
        
        System.out.println("Well, no point sticking around here any longer. Time to head out and hand this in...");
        System.out.println("You look out the window.");
        System.out.println("It’s dark out.");
        System.out.println("\n…\n");
        System.out.println("Crap.\n");
        
        System.out.print(ENTER);
        dump = input.nextLine();
        
        System.out.println("You’ve learned after a few months of living in Sera that the streets");
        System.out.println("can be a dangerous place to be at night.  Every town has an underground");
        System.out.println("to it, and Sera’s no exception. You’ve never actually had an encounter");
        System.out.println("like that, but you hear the stories.  The stories of murders and");
        System.out.println("muggings gone bad.\n");
        System.out.println("Heck, those stories are half the reason you chose the CMS to start off");
        System.out.println("your career.  If there is one thing that gets your blood running, it’s");
        System.out.println("the death of the innocent.  You want to be a part of the force that");
        System.out.println("stops that from happening.");
        
        System.out.print(ENTER);
        dump = input.nextLine();
        
        System.out.println("You let out a growl of annoyance, but decide to head out now anyway.");
        System.out.println("You want this done, and soon.  You won’t be able to sleep tonight");
        System.out.println("until you’ve handed in the application for review.\n");
        System.out.println("Let’s do this.\n");
        System.out.println("Grabbing  your sword for extra security, you open the door and");
        System.out.println("head out into the night.\n");
        
        System.out.print(ENTER);
        dump = input.nextLine();
        
        System.out.println("*45 Minutes Later*\n");
        System.out.println("You’ve forgotten how much of a walk this is.  Your legs have");
        System.out.println("been aching for about, hmm, 44 ? minutes.  Yeah that sounds");
        System.out.println("about right.  You quickly send up a prayer, silently wishing");
        System.out.println("that buses would be invented, and soon.\n");
        System.out.println("14 blocks to go, at least.\n");

        System.out.print(ENTER);
        dump = input.nextLine();
        
        System.out.println("Suddenly you feel someone latching onto your right arm.  You");
        System.out.println("turn your head quick enough to see a large man dressed in");
        System.out.println("black before he violently yanks your arm and throws you over");
        System.out.println("his shoulder into the alley.  You fly through the air, the");
        System.out.println("ground rapidly approaching.  Somehow, you manage to turn your");
        System.out.println("hard landing into a roll and end up on your feet.\n");
        System.out.println("You whirl around to face your assailant, mind already buzzing");
        System.out.println("with panic.  The panic does not subside when you see the man");
        System.out.println("has a large knife in his hands, and is menacingly walking");
        System.out.println("toward you.");

        System.out.print(ENTER);
        dump = input.nextLine();
        
        System.out.println("You draw your sword, but that doesn’t seem to phase him.");
        System.out.println("He just keeps walking toward you, getting closer and closer.\n");
        System.out.println("He obviously knows how to use that weapon.\n");
        System.out.println("Sweat is already leaking down your forehead.  Not from");
        System.out.println("exhaustion, but from fear.  Truth be told, you’re terrified.");
        System.out.println("Some warrior you are.\n");
        System.out.println("But this is not the time for reflection. This is the time");
        System.out.println("for action.\n");
        
        System.out.print(ENTER);
        dump = input.nextLine();
        
        System.out.println("Hefting your blade in front of your body, you charge at the thief.\n");
        System.out.println("Your battle for survival has begun.\n\n");
        
        System.out.print(ENTER);
        dump = input.nextLine();
        
        System.out.println("Welcome to the battle screen! Let's have a run-down on combat, shall we? \n");
        System.out.println("Combat works in a turn-based fashion. \n");
        System.out.println("You and your opponent both start with 100 health points, \n");
        System.out.println("And you both have access to heavy and light attacks. \n");
        System.out.println("Light attacks cause the least damage, but have lower chances of missing. \n");
        System.out.println("Heavy attacks cause the most damage, but have higher chances of missing. \n");
        System.out.println("On average, enemies will be stronger and smarter than you. However, worry not! \n");
        System.out.println("For you see, you have access to a health potion once per battle. \n");
        System.out.println("This potion restores 25 health points when used. \n");
        System.out.println("In this regard, the enemy gets zilch. Take that, vile fiend! \n");
        System.out.println("Okay, enough gabbing. LET THE BATTLE BEGIN! \n");
        
        Enemy rogue = new Thief();
        Mechanics fight = new Mechanics();
        victory = fight.Battle(prot, rogue);
        
        if (victory == false) {
            System.out.print(ENTER);
            dump = input.nextLine();
            
            System.out.println("What.\n");
            System.out.println("No, no no no no this can’t be happening.\n");
            System.out.println("You stand there, body frozen, and slowly look down.  What you");
            System.out.println("see drives you to the deep end of despair.\n");
            
            System.out.print(ENTER);
            dump = input.nextLine();
            
            System.out.println("You see the hilt of the blade sticking out from your chest.\n");
            
            System.out.print(ENTER);
            dump = input.nextLine();
            
            System.out.println("You start to lose feeling of your extremities, and your hands");
            System.out.println("become unable to hold the weight of your sword any longer.");
            System.out.println("It clangs to the ground, but you can barely hear it.\n");
            System.out.println("You try to stagger forward, but immediately lose balance and");
            System.out.println("fall hard on your side.  Pain shoots through your entire");
            System.out.println("body, but it’s less intense now.  More detached.\n");

            System.out.print(ENTER);
            dump = input.nextLine();
            
            System.out.println("So, this is the end of your life?\n");
            System.out.println("This morbid thought pings through your mind, and resonates");
            System.out.println("within your entire subconscious.  Yes, there is no");
            System.out.println("foreseeable way out of this situation now.  There was a");
            System.out.println("battle, and you lost it.\n");

            System.out.println(ENTER);
            dump = input.nextLine();
            
            System.out.println("Extremely dazed, you try to arch your head up.  The effort");
            System.out.println("nearly causes you to pass out, 	but you manage to catch a");
            System.out.println("glimpse at the enemy that bested you.\n");            
            System.out.println("What you see next, is worth it all.\n");
            System.out.println("There is a big sound of clanking metal a few meters to your");
            System.out.println("left.  This startles the thief, whose eyes widens and ");
            System.out.println("scrambles to reach for his weapon by his belt.\n");
            System.out.println("It isn’t there.  It’s embedded in your chest.\n");

            System.out.print(ENTER);
            dump = input.nextLine();
            
            System.out.println("The thief quickly makes to run away, but then this large,");
            System.out.println("imposing figure crosses into your range of vision.  He");
            System.out.println("is carrying a large sword and is fully armored.\n");
            System.out.println("A soldier?\n");
            System.out.println("With no weapon to defend himself, the thief is defenseless");
            System.out.println("when the soldier attacks him.  A quick downward thrust cuts");
            System.out.println("deep into the man’s neck.  He stands there lifelessly for a");
            System.out.println("second, and then falls forward as his eyes become glossed over.\n");
            System.out.println("You let a small smirk of satisfaction reach your face.  Well,");
            System.out.println("at least you know you have been avenged.\n");

            System.out.print(ENTER);
            dump = input.nextLine();
            
            System.out.println("Someone else comes into your field of vision, kneeling down");
            System.out.println("beside you.  You can’t hold your neck up any longer so you");
            System.out.println("let your head collapse onto the ground.  You can vaguely");
            System.out.println("hear someone’s voice calling out to you, but it’s too far");
            System.out.println("away for you to understand.  Or at least it sounds like");
            System.out.println("it’s far away.\n");
            System.out.println("Everything you hear, everything your eyes see, everything");
            System.out.println("your body feels: it’s all becoming less… well just less.\n");
            System.out.println("As you begin your final moments, your mind thinks the last");
            System.out.println("coherent thought it manages before 	shutting down forever.\n");
            System.out.println("So, this is what it is like to die.\n");
            
            prot.Die();
        } else if (victory == true) {
            System.out.print(ENTER);
            dump = input.nextLine();
            
            System.out.println("Sweat and blood mix as they both pour down your face.  Your");
            System.out.println("entire body is covered in bruises and cuts.  Your legs");
            System.out.println("barely have the strength to stand.\n");
            System.out.println("And yet, you’re alive.\n");
            System.out.println("You actually survived.\n");
            
            System.out.print(ENTER);
            dump = input.nextLine();
            
            System.out.println("Exhausted, you sink to your knees.  Your breathing is");
            System.out.println("coming out in ragged gasps.  The adrenaline that was");
            System.out.println("keeping you moving is starting to fade.\n");
            System.out.println("You can faintly hear the sound of approaching footsteps.");
            System.out.println("But wait, clanking metal?\n");
            System.out.println("Soldiers?\n");
            System.out.println("Your body is unable to keep yourself up even in this");
            System.out.println("kneeling position, and you fall flat on your face.");
            System.out.println("You can vaguely feel someone kneeling down next to you.");
            System.out.println("Part of you wonders who it could be, but your pondering");
            System.out.println("is interrupted as you slip into unconsciousness.\n");

            System.out.print(ENTER);
            dump = input.nextLine();
            
        }                                                                        
    }
}