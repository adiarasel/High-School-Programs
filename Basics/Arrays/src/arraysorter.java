/*
* Aditikrishna Mandula
* Period 6
* */
import java.util.*;
public class arraysorter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers do you want to sort?");
        int n = scan.nextInt();
        scan.nextLine();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
            scan.nextLine();
        }
        // sort
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(arr[i] < arr[j]){
                    int temp;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
    }
}
