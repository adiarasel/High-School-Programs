/*
* Aditikrishna Mandula
* Period 6
* */
import java.util.*;
public class divwodiv {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input two integers a and b to get a/b:");
        int a = scan.nextInt();
        scan.nextLine();
        int b = scan.nextInt();
        scan.nextLine();
        int quo=0, rem = a, dummy, count = 0;
        boolean notzero = true;
        while(notzero){
//            System.out.println("rem = " + rem + " and quo = " + quo);
            while(rem >= b){ // subtracting quo times
                rem-=b;
                quo++;
            }
//            System.out.println("rem = " + rem + " and quo = " + quo);
            if(count == 0) System.out.print(quo);
            else if (count == 1) System.out.print("." + quo);
            else  System.out.print(quo);
            dummy = rem;
            if(rem == 0) notzero = false;
            for(int i = 0; i < 9; i++){ // times 10
                rem += dummy;
            }
//            System.out.println("rem = " + rem + " and quo = " + quo);
            quo = 0;
            count++;
            if(count >= 2) count = 2;
        }
    }
}
