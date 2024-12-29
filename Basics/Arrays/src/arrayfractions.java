/*
* Aditikrishna Mandula
* Period 6
* */
import java.util.*;
public class arrayfractions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] frac1 = new int[2];
        int[] frac2 = new int[2];
        System.out.println("Hello! What would you like to do with the two fractions you will enter? Enter a number: " +
                "1 for Add, 2 for Subtract, 3 for Multiply, 4 for Division, and 5 for Simplify!");
        int oper = scan.nextInt();
        if(oper != 5){
            System.out.println("Now, input numerator 1, denominator 1, numerator 2, and denominator " +
                    "2 in that order! (in one line)");
            frac1[0] = scan.nextInt();
            frac1[1] = scan.nextInt();
            frac2[0] = scan.nextInt();
            frac2[1] = scan.nextInt();
        }
        else{
            System.out.println("Now, input the numerator and denominator!(in one line, separated by a space)");
            frac1[0] = scan.nextInt();
            frac1[1] = scan.nextInt();
        }

        int[] yay = new int[2];
        if(oper == 1){
            yay = add(frac1, frac2);
        }
        if(oper == 2){
            yay = subtract(frac1, frac2);
        }
        if(oper == 3){
            yay = multiply(frac1, frac2);
        }
        if(oper == 4) {
            yay = divide(frac1, frac2);
        }
        if(oper == 5){
            yay = simplify(frac1);
        }
        if(yay[1] == 1) System.out.println(yay[0]);
        else System.out.println(yay[0] + " / " + yay[1]);
    }

    public static int[] simplify(int[] a){
        boolean neg0 = false, neg1 = false;
        int aaaa = a[0], bbbb = a[1];
        if(a[0] < 0){
            a[0] = -1 * a[0];
            neg0 = true;
        }
        if(a[1] < 0){
            a[1] = -1 * a[1];
            neg1 = true;
        }
        if(a[0] >= a[1]){
            for(int i = aaaa ; i > 0; i--){
                if(a[0] % i == 0 && a[1] % i == 0){
                    a[0] /= i;
                    a[1] /= i;
                }
            }
        }
        if(a[0] < a[1]){
            for(int i = bbbb ; i > 0; i--){
                if(a[0] % i == 0 && a[1] % i == 0){
                    a[0] /= i;
                    a[1] /= i;
                }
            }
        }
        if(neg0) a[0] = -1 * a[0];
        if(neg1) a[1] = -1 * a[1];
        return a;
    }
    public static int[] add(int[] a, int[] b) {
        int[] answer = new int[2];
        answer[0] = a[0] * b[1] + a[1] * b[0];
        answer[1] = a[1] * b[1];
        simplify(answer);
        return answer;
    }
    public static int[] subtract(int[] a, int[] b) {
        int[] answer = new int[2];
        answer[0] = a[0] * b[1] - a[1] * b[0];
        answer[1] = a[1] * b[1];
        answer = simplify(answer);
        return answer;
    }
    public static int[] multiply(int[] a, int[] b) {
        int[] answer = new int[2];
        answer[0] = a[0] * b[0];
        answer[1] = a[1] * b[1];
        answer = simplify(answer);
        return answer;
    }
    public static int[] divide(int[] a, int[] b) {
        int[] answer = new int[2];
        answer[0] = a[0] * b[1];
        answer[1] = a[1] * b[0];
        answer = simplify(answer);
        return answer;
    }
}