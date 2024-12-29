/*
 Aditikrishna Mandula
 Period 6
*/
import java.util.*;
public class calculator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("Welcome to Aditikrishna Mandula's calculator!");
            System.out.println("Which operation would you like to perform? Please choose a number:");
            System.out.println("1. Addition \n2. Subtraction \n3. Multiplication \n4. Division");
            int operation = scan.nextInt();
            scan.nextLine();
            System.out.println("Please enter two whole numbers:");
            System.out.println("first number: ");
            int x = scan.nextInt();
            scan.nextLine();
            System.out.println("second number: ");
            int y = scan.nextInt();
            scan.nextLine();
            if(operation == 1){
                System.out.println("The sum is: "+ (x + y) + ".");
            }
            else if(operation == 2){
                System.out.println("The difference is: "+ (x - y) + ".");
            }
            else if(operation == 3){
                System.out.println("The product is: "+ (x * y) + ".");
            }
            else if(operation == 4){
                System.out.println("Would you like your answer as a quotient or a remainder? Choose a number.");
                System.out.println("1. Quotient \n2. Remainder");
                int option1 = scan.nextInt();
                scan.nextLine();
                if(option1 == 2){
                    int divi = x / y;
                    System.out.println("The answer is " + divi + " with a remainder of " + x % y + ".");
                }
                else if (option1 == 1){
                    double xx = x;
                    double yy = y;
                    double div = xx / yy;
                    System.out.println("The quotient is " + div + ".");
                }
                else {
                    System.out.println("Dude. No. Now, as a a punishment, you have to start over.");

                }
            }
            else{
                System.out.println("invalid selection");
                continue;
            }
            System.out.println("Thank you for using the calculator!\n" +
                    "Would you like to use the calculator again?");
            String option = scan.nextLine();
            if(option.equals("yes"));
            else break;
        }
    }
}
