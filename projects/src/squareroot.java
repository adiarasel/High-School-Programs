/*
 * Aditikrishna Mandula
 * Period 6
 * */
import java.util.*;
public class squareroot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean yes = true;
        int n;
        while(yes){
            System.out.println("Please input a number to find the square root");
            n = scan.nextInt(); scan.nextLine();
            int outside = 1, inside = 1;
            for(int i = n / 2; i >=2; i--){
                if(n % (i * i) == 0){
                    outside *= i;
                    n /= (i * i);
                }
            }
            inside = n;
            if(outside == 1 && inside == 1){
                System.out.println(1);
            }
            else if(outside == 1){
                System.out.println("root " + inside);
            }
            else if (inside == 1){
                System.out.println(outside);
            }
            else{
                System.out.println(outside + " root " + inside);
            }
            System.out.println("Would you like to perform another calculation? Enter 1 for yes and 2 for no");
            int inp = scan.nextInt(); scan.nextLine();
            if (inp == 2) yes = false;
        }
    }
}
