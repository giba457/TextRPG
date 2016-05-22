import java.util.Scanner;
import java.util.Random;

public class Prologue {
    final static String ENTER = "\n<Press ENTER To Continue>\n\n";
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        String dump;
        int points = 2;
        boolean endGame = false;

        Character protagonist = new Character("name");
        Enemy enemy = new Enemy();
        Mechanics battle = new Mechanics();
        Random generator = new Random();

        System.out.println("You stare at the blank sheet of paper laid before you.  Regret starts to");
        System.out.println("seep its way into your thoughts.\n");

        System.out.println("This is a bad idea. This is a bad idea. This is a bad idea.\n");

        System.out.print(ENTER);
        dump = input.nextLine();

        System.out.println("Of course, most of the people you know would jump at this chance.  The chance");
        System.out.println("to fight alongside bonafide warriors of the realm.  Like your father, although");
        System.out.println("that’s a moot point since he’s stationed along the southern border, miles from");
        System.out.println("where his family now resides.  Part of you misses him, but it’s not like there");
        System.out.println("is anything you can do about it.  There aren’t many other jobs that would get him");
        System.out.println("the salary and respect that protecting the country gets him.\n");

        System.out.println("You’re proud of your father and respect him, but that doesn’t stop you from wishing");
        System.out.println("he was here to fill the sometimes silent house you’ve lived in for the past 17 years");
        System.out.println("of your life.");

        System.out.print(ENTER);
        dump = input.nextLine();

        System.out.println("The sheet of paper sitting in front of you is the application form for the Civilian's");
        System.out.println("Militia of Sera, the town you currently reside in.  It’s a sort of policing force");
        System.out.println("headed by real soldiers, with the ranks partially filled by townspeople that can");
        System.out.println("fight but don’t have any actual military training.\n");

        System.out.println("That’s where you come in.\n");

        System.out.print(ENTER);
        dump = input.nextLine();

        System.out.println("It’s not like just anyone with a sword can join.  It’s military-led, so you actually");
        System.out.println("have to have some credentials.  Things like proficiency in whatever weapon you prefer");
        System.out.println("and knowledge of the law of the land.  Being able to handle yourself in a fight is");
        System.out.println("probably the most important bit though.  Fighting off the odd raider band is a major");
        System.out.println("aspect of the job.  Sometimes it seems like the country is crawling with them.\n");
        System.out.println("You, fortunately, fill all of those requirements.  You’ve been training with a sword");
        System.out.println("since you were a kid, a boy that was dead-set on being a warrior just like your father.");
        System.out.println("As a result, you are in fairly good shape and are more than proficient with a sword.\n");

        System.out.println("Now that you are given the opportunity to put that skill to the test, it’s surprisingly nerve wracking.\n");

        System.out.print(ENTER);
        dump = input.nextLine();

        System.out.println("You eventually give a resigned sigh and start filling the form out.");

        System.out.print("Please enter your name:  "); 
        name = input.nextLine();        
        Character prot = new Character(name);        
        System.out.println("\nOkay, name part done.  Time to move on.\n");

        System.out.print(ENTER);
        dump = input.nextLine();

        System.out.println("…");
        System.out.println("…");
        System.out.println("…");
        System.out.println("Time to move on!");
        System.out.println("…");
        System.out.println("This is much harder than you thought it’d be.\n");

        System.out.print(ENTER);
        dump = input.nextLine();

        System.out.println("Why can’t you do this?  You’ve been waiting for this your whole life!  Finally a chance");
        System.out.println("to take the first steps of becoming a true warrior, like you’ve always dreamed.  But now");
        System.out.println("you’re freezing up!  What’s the deal?\n");
        System.out.println("Is it because this moment might just change the course of your life?\n");
        System.out.println("You know you’ll never stop at the Militia.  When you get enough experience there you’ll");
        System.out.println("join the army, or something to that effect.\n");
        System.out.println("Why must you always have second guess yourself, " + prot.getName() + "?");

        System.out.print(ENTER);
        dump = input.nextLine();

        System.out.println("It’s not like that habit hasn’t been useful in the past, keeping you out of situations that");
        System.out.println("could potentially yield terrible consequences.  You know that you’re not a master tactician");
        System.out.println("or anything, but you’re not exactly stupid either.  While a game of chess can frustrate you");
        System.out.println("to no end, you are a pretty quick thinker on your feet in the middle of a tight situation.");
        System.out.println("Improvising is what you do best.But when it comes to making important steps in your life");
        System.out.println("like this, it becomes more of hindrance than an asset, or at least it feels like it.\n");
        System.out.println("Nothing else to think about though, you tell yourself, you’ve made a decision and you’re");
        System.out.println("going to see it through.\n");
        System.out.println("You take a deep breath and fill out the rest of the form.");
        System.out.println("\n\nEND OF PROLOGUE\n\n");

        Part1 cont = new Part1();
        cont.PartOne(prot, ENTER, input);
    }
}