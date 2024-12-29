/*
* Aditikrishna Mandula
* Period 6
* */
import java.util.*;
public class liulau {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a,b,c,d,e,f,g;
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        d = scan.nextInt();
        e = scan.nextInt();
        f = scan.nextInt();
        g = scan.nextInt();
        System.out.println("The mean is "+ mean(a,b,c,d,e,f,g) + ".");
        System.out.println("The median is "+ median(a,b,c,d,e,f,g) + ".");
        System.out.print("The mode is = ");
        mode(a, b, c, d, e, f ,g);
        System.out.println(".");
    }
    public static double mean(int x1, int x2, int x3 , int x4, int x5, int x6, int x7){
        double sum = x1 + x2 + x3 + x4 + x5 + x6 + x7;
        return 1.0 * (sum/7);
    }
    public static int maxx(int x1, int x2, int x3 , int x4, int x5, int x6, int x7) {
        int max = x1;
        if(x2 > max) max = x2;
        if(x3 > max) max = x3;
        if(x4 > max) max = x4;
        if(x5 > max) max = x5;
        if(x6 > max) max = x6;
        if(x7 > max) max = x7;
        return max;
    }
    public static int median(int x1, int x2, int x3 , int x4, int x5, int x6, int x7){
        int temp;
        for(int i = 0; i < 49; i++){
            if(x1 > x2){
                temp = x2;
                x2 = x1;
                x1 = temp;
            }
            else if(x2 > x3){
                temp = x2;
                x2 = x3;
                x3 = temp;
            }
            else if(x3 > x4){
                temp = x3;
                x3 = x4;
                x4 = temp;
            }
            else if(x4 > x5){
                temp = x4;
                x4 = x5;
                x5 = temp;
            }
            else if(x5 > x6){
                temp = x5;
                x5 = x6;
                x6 = temp;
            }
            else if(x6 > x7){
                temp = x6;
                x6 = x7;
                x7 = temp;
            }
        }
//        System.out.println(x1 + " " + x2 + " "+ x3 + " " + x4 + " " + x5 + " " + x6 + " " + x7);
        return x4;
    }
     public static void mode(int x1, int x2, int x3 , int x4, int x5, int x6, int x7){
         int c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0,c6 = 0, c7 = 0;
         if(x1 == x2){
             c1++;
             c2++;
         }
         if(x1 == x3){
             c1++;
             c3++;
         }
         if(x1 == x4){
             c1++;
             c4++;
         }
         if(x1 == x5){
             c1++;
             c5++;
         }
         if(x1 == x6){
             c1++;
             c6++;
         }
         if(x1 == x7){
             c1++;
             c7++;
         }
         if(x2 == x3){
             c2++;
             c3++;
         }
         if(x2 == x4){
             c2++;
             c4++;
         }
         if(x2 == x5){
             c2++;
             c5++;
         }
         if(x2 == x6){
             c2++;
             c6++;
         }
         if(x2 == x7){
             c2++;
             c7++;
         }
         if(x3 == x4){
             c3++;
             c4++;
         }
         if(x3 == x5){
             c3++;
             c5++;
         }
         if(x3 == x6){
             c3++;
             c6++;
         }
         if(x3 == x7){
             c3++;
             c7++;
         }
         if(x4 == x5){
             c4++;
             c5++;
         }
         if(x4 == x6){
             c4++;
             c6++;
         }
         if(x4 == x7){
             c4++;
             c7++;
         }
         if(x5 == x6){
             c5++;
             c6++;
         }
         if(x5 == x7){
             c5++;
             c7++;
         }
         if(x6 == x7){
             c6++;
             c7++;
         }
         int ind = maxx(c1, c2, c3, c4, c5, c6, c7);
         if(ind == c1) System.out.print(x1 + " ");
         if(ind == c2 && x2 != x1) System.out.print(x2 + " ");
         if(ind == c3 && x3 != x2 && x3 != x1) System.out.print(x3 + " ");
         if(ind == c4 && x4 != x3 && x4 != x2 && x4 != x1) System.out.print(x4 + " ");
         if(ind == c5 && x5 != x4 && x5 != x3 && x5 != x2 && x5 != x1) System.out.print(x5 + " ");
         if(ind == c6 && x6 != x5 && x6 != x4 && x6 != x3 && x6 != x2 && x6 != x1) System.out.print(x6 + " ");
         if(ind == c7 && x7 != x6 && x7 != x5 && x7 != x4 && x7 != x3 && x7 != x2 && x7 != x1) System.out.print(x7 + " ");
     }

}