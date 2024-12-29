/*
 * Aditikrishna Mandula
 * Period 6
 * */
import java.util.*;
public class roadrace {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<racer> racers = new ArrayList<racer>();
        int n;
        n = scan.nextInt(); scan.nextLine(); // inputting number of racers
        for(int i = 0; i < n; i++){ // just inputting all the racers
            racers.add(new racer(scan.nextInt(), scan.nextLine()));
        }
//      i get all the winners, the last 2 works bc after 1st male is gone, then 2nd male is winner
        racer winner = chickendinner(racers, "overall");
        System.out.println(winner.getTime());
        winner = chickendinner(racers, "female");
        System.out.println(winner.getTime());
        winner = chickendinner(racers, "male");
        System.out.println(winner.getTime());
        winner = chickendinner(racers, "male");
        System.out.println(winner.getTime());
    }
    public static racer chickendinner(ArrayList<racer> racers, String notmytype){ // winner winner chicken dinner
        int wintime = 2000000000;
        racer winner = null;
        if(notmytype.equals("overall")){ // finds overall winner by going through times and finding min
            for(racer race : racers){
                if(race.getTime() < wintime){
                    wintime = race.getTime();
                    winner = race; // updates the racer to keep track of racer
                }
            }
            racers.remove(winner); // removes at end so not to repeat
        }
        else if(notmytype.equals("female")){ // does same as overall but for only females
            for(racer race : racers){
                if(race.getTime() < wintime && race.getGender().equals(" F")){
                    wintime = race.getTime();
                    winner = race;
                }
            }
            racers.remove(winner); // removes at end so not to repeat
        }
        else if(notmytype.equals("male")){ // does same for overall but only for males
            for(racer race : racers){
                if(race.getTime() < wintime && race.getGender().equals(" M")){
                    wintime = race.getTime();
                    winner = race;
                }
            }
            racers.remove(winner); // removes at end so not to repeat
        }
        return winner;
    }
}
/*
6
48 F
52 M
43 F
49 F
50 M
57 F
* */