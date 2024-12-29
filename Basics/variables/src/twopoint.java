import java.util.*;

/*Aditikrishna Mandula
 Period 6
*/
public class twopoint {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double x1, x2, y1, y2;
        System.out.println("Hello! This program takes two points as an input and will output" +
                "\nthe distance between them, the midpoint of the two, and the equation of the" +
                "\nline that passes through the two points.");
        System.out.println("Start off by inputting the two points in the format " +
                "\nx1 y1\n" +
                "x2 y2:");
        x1 = scan.nextInt();
        y1 = scan.nextInt();
        scan.nextLine();
        x2 = scan.nextInt();
        y2 = scan.nextInt();
        scan.nextLine();
        System.out.println("The distance is = " + Math.sqrt((x2-x1) * (x2-x1) + (y2-y1) * (y2-y1)) + ".");
        System.out.println("The midpoint is (" + (x1+x2)/2 + ", " + (y1+y2)/2 + ").");
        double rise = y2 - y1;
        double run = x2 - x1;
        double slope = rise/run;
        double yintercept = y1 - slope *  x1;
        System.out.println("The equation of the line is y = " + rise + " / " + run + "x + (" + yintercept
        + ").");
    }
}
