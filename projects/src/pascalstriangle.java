/*
* Aditikrishna Mandula
* Period 6
* */
import java.util.*;
public class pascalstriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("What row of Pascal's triangle do you want printed out?");
        n = scan.nextInt(); scan.nextLine();
        int[] row = new int[n+1];
        int counter = 0;
        for(int i = 0; i < n; i++){
            int[] newrow = new int[counter + 1];
            newrow[0] = 1; newrow[counter] = 1;
            for(int j = 1; j < counter; j++){
                newrow[j] = row[j-1] + row[j];
            }
            counter++;
            row = newrow;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(row[i] + " ");
        }
    }
}
