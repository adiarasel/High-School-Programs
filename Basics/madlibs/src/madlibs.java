/*Aditikrishna Mandula
Period 6*/
import java.util.*;
public class madlibs {
    public static void main(String[] args){
        /*so uh yeah this is block commenting*/
        // this is standard commenting
        Scanner scan = new Scanner(System.in);
//        scan.nextLine(); // looks for string and also enter buttion
//        scan.nextInt(); // looks for number BUT NOT ENTER BUTTON
//        scan.nextDouble();
//        scan.nextLine(); // just do dat after ints and doubles
        String scylla="";
        String medea = "";
        String jason = "";
        String monster = "";
        System.out.println("Name:");
        scylla = scan.nextLine();
        System.out.println("Hideous Creature (it has to be hideous.):");
        monster = scan.nextLine();
        System.out.println("New Name:");
        medea = scan.nextLine();
        System.out.println("Different Name:");
        jason = scan.nextLine();
        String pasiphae = "";
        System.out.println("ANOTHER Name:");
        String minotaur = "";
        minotaur = scan.nextLine();
        System.out.println("Now, give me a job! Any job will do:");
        String enchantress = "";
        enchantress = scan.nextLine();
        System.out.println("Give me a skill, like woodcarving or soap-making!:");
        String pharmakeia = "";
        pharmakeia = scan.nextLine();
        System.out.println("I said, A SKILL. (just a synonym for what you wrote above):");
        String herblore = "";
        herblore = scan.nextLine();
        System.out.println("A noun, something that (hopefully) goes with what you said for the skills:");
        String potions = "";
        potions = scan.nextLine();
        System.out.println("Now, we turn to adjectives. Give me two:");
        String hidden = "";
        String banished = "";
        hidden = scan.nextLine();
        banished = scan.nextLine();
        System.out.println("A relation, please! (wife, husband, brother, etc.):");
        String daughter = "";
        daughter = scan.nextLine();
        System.out.println("Two more names!  Make sure they all differ:");
        String Helios = "";
        Helios = scan.nextLine();
        String Circe = "";
        Circe = scan.nextLine();
        System.out.println("MORE NAMES (only 1 lol): ");
        String Odysseus = "";
        Odysseus = scan.nextLine();
        System.out.println("Any place you can think of? it can be mythical too!");
        String aeaea = "";
        aeaea = scan.nextLine();
        System.out.println("NUMBERS(just one):");
        int one;
        one = scan.nextInt();
        scan.nextLine();
        System.out.println("Method of Transportation:");
        String ship = "";
        ship = scan.nextLine();
        System.out.println("Group of People? (Americans, Indians, Muslims, etc.):");
        String Laestrygonians = "";
        Laestrygonians = scan.nextLine();
        System.out.println("Sadly, another name:");
        String hermes = "";
        hermes = scan.nextLine();
        System.out.println("NUMBER:");
        int three;
        three = scan.nextInt();
        scan.nextLine();
        System.out.println("something to do with your fac, -ed form (sighed, smiled, frowned):");
        String smiled = "";
        smiled = scan.nextLine();
        System.out.println("Type of building:");
        String house = "";
        house = scan.nextLine();
        System.out.println("Object:");
        String food = "";
        food = scan.nextLine();
        System.out.println("Number, doesn't have to be an integer:");
        double ten;
        ten = scan.nextDouble();
        scan.nextLine();
        System.out.println("unit of time?");
        String years = "";
        years = scan.nextLine();
        System.out.println("HEY! We're almost done. Juuuust another verb in past tense:");
        String eavesdropped = "";
        eavesdropped = scan.nextLine();
        System.out.println("an object, a creature, or a type of person!");
        String goddess = "";
        goddess = scan.nextLine();
        System.out.println("Verb and preposition combo!: (use with, walk with, walk about, do for, etc.)");
        String take_me_to = "";
        take_me_to = scan.nextLine();
        System.out.println("A plural noun!");
        String beds = "";
        beds = scan.nextLine();
        System.out.println("You may know me as the woman who turned " + scylla + " into a " + monster + ". You may know me as the " +
                "one who cleansed " + medea +  " and " + jason + " of their sins. You may know me as the one ");
        System.out.println("who helped " + pasiphae + " give birth to the " + minotaur + ". Who am I, you ask? I am the "+ enchantress+ " " +
                "who mastered the art of "+ pharmakeia + ", or " + herblore + ", of " + potions + ". I am the "+ hidden + ", " + banished +
                " " + daughter + " of " + Helios + ". I am " + Circe + ", ");
        System.out.println("and this is my story of how " + Odysseus + " came and left " + aeaea + ". He arrived with " + one +
                " " + ship + " only, the rest being destroyed by the " + Laestrygonians + ", as " + hermes + " told me.");
        System.out.println(three + " of his men came to my house and knocked on the door. I " + smiled + " and let them in, but I " +
                "wasn’t sure of what to expect of grown men in a single lady’s " + house + ". They asked me, \"Goddess, we are " +
                "starving. Could you give us some " + food + " to enjoy? ");
        System.out.println("We have been travelling for " + ten + years +  " without proper "
                + food + ".\" I pondered over their use of goddess as I brought them their " + food + ". Did they know I was a goddess? " +
                "Or did they say it only to flatter me and compliment my beauty?");
        System.out.println("As I went back, I " + eavesdropped + " on their " +
                "conversation. Yes. I was right. They did not notice I was really a " + goddess +
                ". The men wanted to " + take_me_to + " their " + beds + ". Of course, I would not allow that.\n\n\n by Aditikrishna Mandula");
    }
}
