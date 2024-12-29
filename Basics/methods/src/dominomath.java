/*
* Aditikrishna Mandula
* Period 6
* */
import java.util.*;
public class dominomath {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;
        System.out.println("Hello! Input whether you want to add, multiply, or raise a number to a power.");
        System.out.println("Input 1 for adding, 2 for multiplying, and 3 for raising to a power.");
        int op = scan.nextInt();
        System.out.println("Next, input two numbers a and b. Depending on what operation you have picked"
        + ", you will see a + b, a * b, or a ^ b.");
        a = scan.nextInt();
        b = scan.nextInt();
        if(op == 1){
            System.out.println(add(a, b));
        }
        if(op == 2){
            System.out.println(multiply(a, b));
        }
        if(op == 3){
            System.out.println(power(a, b));
        }
    }

    public static int add(int x, int y) {
        return x + y;
    }
    public static int multiply(int x, int y) {
        int sum = 0;
        for(int i = 0; i < y; i++){
            sum = add(sum, x);
        }
        return sum;
    }
    public static int power(int x, int y) {
        int pow = 1;
        for(int i = 0; i < y; i++){
            pow = multiply(pow, x);
        }
        return pow;
    }
}
