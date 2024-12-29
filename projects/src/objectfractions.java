/*
 * Aditikrishna Mandula
 * Period 6
 * */
import java.util.*;
public class objectfractions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        fraction frac1 = new fraction();
        fraction frac2 = new fraction();
        System.out.println("Hello! What would you like to do with the two fractions you will enter? Enter a number: " +
                "1 for Add, 2 for Subtract, 3 for Multiply, 4 for Division, and 5 for Simplify!");
        int oper = scan.nextInt();
        if(oper != 5){
            System.out.println("Now, input numerator 1, denominator 1, numerator 2, and denominator " +
                    "2 in that order! press enter after each integer");
            int num = scan.nextInt(); scan.nextLine();
            frac1.setNum(num);
            num = scan.nextInt(); scan.nextLine();
            frac1.setDem(num);
            num = scan.nextInt(); scan.nextLine();
            frac2.setNum(num);
            num = scan.nextInt(); scan.nextLine();
            frac2.setDem(num);
        }
        else{
            System.out.println("Now, input the numerator and denominator! press enter after each integer");
            frac1.setNum(scan.nextInt());
            frac1.setDem(scan.nextInt());
        }

        fraction yay = new fraction(0, 0);
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
        System.out.println(yay.toString());
    }

    public static fraction simplify(fraction a){
        boolean neg0 = false, neg1 = false;
        int aaaa = a.getNum(), bbbb = a.getDem();
        if(a.getNum() < 0){
            a.setNum(-1 * a.getNum());
            neg0 = true;
        }
        if(a.getDem() < 0){
            a.setDem(-1 * a.getDem());
            neg1 = true;
        }
        if(a.getNum() >= a.getDem()){
            for(int i = aaaa ; i > 0; i--){
                if(a.getNum() % i == 0 && a.getDem() % i == 0){
                    a.setNum( a.getNum() / i);
                    a.setDem( a.getDem() / i);
                }
            }
        }
        if(a.getNum() < a.getDem()){
            for(int i = bbbb ; i > 0; i--){
                if(a.getNum() % i == 0 && a.getDem() % i == 0){
                    a.setNum( a.getNum() / i);
                    a.setDem( a.getDem() / i);
                }
            }
        }
        if(neg0) a.setNum(-1 * a.getNum());
        if(neg1) a.setDem(-1 * a.getDem());
        return a;
    }
    public static fraction add(fraction a, fraction b) {
        fraction answer = new fraction();
        answer.setNum(a.getNum() * b.getDem() + a.getDem() * b.getNum());
        answer.setDem(a.getDem() * b.getDem());
        answer = simplify(answer);
        return answer;
    }
    public static fraction subtract(fraction a, fraction b) {
        fraction answer = new fraction();
        answer.setNum(a.getNum() * b.getDem() - a.getDem() * b.getNum());
        answer.setDem(a.getDem() * b.getDem());
        answer = simplify(answer);
        return answer;
    }
    public static fraction multiply(fraction a, fraction b) {
        fraction answer = new fraction();
        answer.setNum(a.getNum() * b.getNum());
        answer.setDem(a.getDem() * b.getDem());
        answer = simplify(answer);
        return answer;
    }
    public static fraction divide(fraction a, fraction b) {
        fraction answer = new fraction();
        answer.setNum(a.getNum() * b.getDem());
        answer.setDem(a.getDem() * b.getNum());
        answer = simplify(answer);
        return answer;
    }
}