/*
 * Aditikrishna Mandula
 * Period 6
 * */
import java.util.*;
public class blackjack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] cards = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        int bankroll = 1000;
        boolean dealyes = false, standyes = false, playno = true;
        int sumplay = 0, sumdeal = 0;
        while (bankroll > 0 && playno){
            System.out.println("Your bankroll is: $" +  bankroll);
            int[] deck = {1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10, 11, 11, 11, 11, 12, 12, 12, 12, 13, 13, 13, 13};
            int[] playercards = new int[2];
            int[] dealercards = new int[1];
            System.out.println("How much would you like to bet on this hand? (only the integer, no $ please)");
            int bet = scan.nextInt(); scan.nextLine();
            if(bet > bankroll){
                System.out.println("I'm disappointed in you. Why are you even trying to bet more than you have? \nThat leads to debt. And bad gambling habits. I'm ending this code right now because \nyou don't know how to gamble right. Thanks a lot, idiot.");
                return;
            }
            playercards[0] = hit1card(deck);
            playercards[1] = hit1card(deck);
            System.out.println("Your cards:");
            displays(playercards, cards);
            if(sum(playercards) == 21){
                System.out.println("Blackjack! You've won!");
                bankroll += 1.5 * bet;
                return;
            }
            else {
                dealercards[0] = hit1card(deck);
                System.out.println("The dealer's cards:");
                displays(dealercards, cards);
                dealercards = arrayHelper.add(dealercards, hit1card(deck));
                System.out.println("Would you like to hit or stand? (hit means to draw, stand means to not draw)\n Enter 1 for hit, and two for stand.");
                int input = scan.nextInt(); scan.nextLine();
                if(input == 1){
                    dealyes = true;
                    playercards = arrayHelper.add(playercards, hit1card(deck));
                    sumplay = sum(playercards);
                    System.out.println("Your cards:");
                    displays(playercards, cards);
                    while(dealyes && sumplay <= 21){
                        System.out.println("Would you like to hit or stand? Enter 1 for hit, and two for stand.");
                        int inpu = scan.nextInt(); scan.nextLine();
                        if(inpu == 1){
                            playercards = arrayHelper.add(playercards, hit1card(deck));
                            sumplay += sum(playercards);
                        }
                        if(inpu == 2) dealyes = false;
                        System.out.println("Your cards:");
                        displays(playercards, cards);
                    }
                }
                else{
                    System.out.println("The dealer's cards:");
                    displays(dealercards, cards);
                    sumdeal += sum(dealercards);
                    while(sumdeal < 17){
                        dealercards = arrayHelper.add(dealercards, hit1card(deck));
                        sumdeal += sum(dealercards);
                    }
                }
                if(sumplay > 21){
                    System.out.println("BUST, you lose!");
                }
                else if(sumdeal > 21 && sumplay < 21 ){
                    System.out.println("The dealer busted, so you win!");
                    bankroll += bet;
                }
                else if((21 - sumdeal) < (21 - sumplay)){
                    System.out.println("You lose!");
                    bankroll -= bet;
                }
                else if((21 - sumdeal) > (21 - sumplay)){
                    System.out.println("You win!");
                    bankroll += bet;
                }
                System.out.println("Would you like to play another round? Enter 1 for yes and 2 for no:");
                int playmore = scan.nextInt(); scan.nextLine();
                if(playmore == 2) playno = false;
            }
        }
    }
    // my display function in arrayHelper only works for integer functions
    public static void displays (int[] a, String[] card){
        for(int aa: a){
            System.out.print(card[aa-1] + " ");
        }
        System.out.println();
    }
    public static int hit1card(int[] dec){
        int card = (int)(Math.random() * dec.length); // the random number generator that adds cards
        int ans = dec[card];
        dec = arrayHelper.remove(dec, card);
        return ans;
    }
    public static int sum(int[] a){
        int sum = 0, ace = 0;
        for(int i: a){
            if (i > 10) i = 10;
            if (i == 1){
                i+=10;
                ace++;
            }
            sum+=i;
        }
        while(sum > 21 && ace > 0){
            sum -= 10;
            ace--;
        }
        return sum;
    }
}