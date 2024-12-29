/*
 * Aditikrishna Mandula
 * Period 6
 * */
import java.util.*;
public class TicTacToe2D {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String a1 = "1",a2 = "2",a3 = "3",a4 = "4",a5 = "5",a6 = "6",a7 = "7",a8 = "8",a9 = "9";
        String [][] board = {{a1, a2, a3}, {a4, a5, a6}, {a7, a8, a9}};
        int counter = 1;
        int player =1, moves= 0;
        boolean win = true, draw = false;
        System.out.println(board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
        System.out.println("--+---+--");
        System.out.println(board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
        System.out.println("--+---+--");
        System.out.println(board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
        while(win) {
            System.out.println("Player " + player + ", choose a number/position!");
            int pos = scan.nextInt();
            // updating the positions of the board
            if (pos == 1) {
                if (player == 1) {
                    board[0][0] = "X";
                    player = 3 - player;
                }
                else {
                    board[0][0] = "O";
                    player = 3 - player;
                }
            }
            if (pos == 2) {
                if (player == 1) {
                    board[0][1] = "X";
                    player = 3 - player;
                }
                else {
                    board[0][1] = "O";
                    player = 3 - player;
                }
            }
            if (pos == 3) {
                if (player == 1) {
                    board[0][2] = "X";
                    player = 3 - player;
                }
                else {
                    board[0][2] = "O";
                    player = 3 - player;
                }
            }
            if (pos == 4) {
                if (player == 1) {
                    board[1][0] = "X";
                    player = 3 - player;
                }
                else {
                    board[1][0] = "O";
                    player = 3 - player;
                }
            }
            if (pos == 5) {
                if (player == 1) {
                    board[1][1] = "X";
                    player = 3 - player;
                }
                else {
                    board[1][1] = "O";
                    player = 3 - player;
                }
            }
            if (pos == 6) {
                if (player == 1) {
                    board[1][2] = "X";
                    player = 3 - player;
                }
                else {
                    board[1][2] = "O";
                    player = 3 - player;
                }
            }
            if (pos == 7) {
                if (player == 1) {
                    board[2][0] = "X";
                    player = 3 - player;
                }
                else {
                    board[2][0] = "O";
                    player = 3 - player;
                }
            }
            if (pos == 8) {
                if (player == 1) {
                    board[2][1] = "X";
                    player = 3 - player;
                }
                else {
                    board[2][1] = "O";
                    player = 3 - player;
                }
            }
            if (pos == 9) {
                if (player == 1) {
                    board[2][2] = "X";
                    player = 3 - player;
                }
                else {
                    board[2][2] = "O";
                    player = 3 - player;
                }
            }
            //literally all the ways to get a 3 in a row ;-;
            if (board[0][0].equals(board[0][1]) && board[0][0].equals(board[0][2]) && board[0][0].equals("X")) {
                System.out.println("Player 1 wins! Thanks for playing!");
                win = false;
            }
            else if (board[0][0].equals(board[0][1]) && board[0][0].equals(board[0][2]) && board[0][0].equals("O")) {
                System.out.println("Player 2 wins! Thanks for playing!");
                win = false;
            }
            else if (board[1][0].equals(board[1][1]) && board[1][0].equals(board[1][2]) && board[1][0].equals("X")) {
                System.out.println("Player 1 wins! Thanks for playing!");
                win = false;
            }
            else if (board[1][0].equals(board[1][1]) && board[1][0].equals(board[1][2]) && board[1][0].equals("O")) {
                System.out.println("Player 2 wins! Thanks for playing!");
                win = false;
            }
            else if (board[2][0].equals(board[2][1]) && board[2][0].equals(board[2][2]) && board[2][0].equals("X")) {
                System.out.println("Player 1 wins! Thanks for playing!");
                win = false;
            }
            else if (board[2][0].equals(board[2][1]) && board[2][0].equals(board[2][2]) && board[2][0].equals("O")) {
                System.out.println("Player 2 wins! Thanks for playing!");
                win = false;
            }
            else if (board[0][0].equals(board[1][0]) && board[0][0].equals(board[2][0]) && board[0][0].equals("X")) {
                System.out.println("Player 1 wins! Thanks for playing!");
                win = false;
            }
            else if (board[0][0].equals(board[1][0]) && board[0][0].equals(board[2][0]) && board[0][0].equals("O")) {
                System.out.println("Player 2 wins! Thanks for playing!");
                win = false;
            }
            else if (board[0][1].equals(board[1][1]) && board[0][1].equals(board[2][1]) && board[0][1].equals("X")) {
                System.out.println("Player 1 wins! Thanks for playing!");
                win = false;
            }
            else if (board[0][1].equals(board[1][1]) && board[0][1].equals(board[2][1]) && board[0][1].equals("O")) {
                System.out.println("Player 2 wins! Thanks for playing!");
                win = false;
            }
            else if (board[0][2].equals(board[1][2]) && board[0][2].equals(board[2][2]) && board[0][2].equals("X")) {
                System.out.println("Player 1 wins! Thanks for playing!");
                win = false;
            }
            else if (board[0][2].equals(board[1][2]) && board[0][2].equals(board[2][2]) && board[0][2].equals("O")) {
                System.out.println("Player 2 wins! Thanks for playing!");
                win = false;
            }
            else if (board[0][0].equals(board[1][1]) && board[0][0].equals(board[2][2]) && board[0][0].equals("X")) {
                System.out.println("Player 1 wins! Thanks for playing!");
                win = false;
            }
            else if (board[0][0].equals(board[1][1]) && board[0][0].equals(board[2][2]) && board[0][0].equals("O")) {
                System.out.println("Player 2 wins! Thanks for playing!");
                win = false;
            }
            else if (board[0][2].equals(board[1][1]) && board[0][2].equals(board[2][0]) && board[0][2].equals("X")) {
                System.out.println("Player 1 wins! Thanks for playing!");
                win = false;
            }
            else if (board[0][2].equals(board[1][1]) && board[0][2].equals(board[2][0]) && board[0][2].equals("O")) {
                System.out.println("Player 2 wins! Thanks for playing!");
                win = false;
            }
             // above has all the possible ways to get a 3 in a row
            System.out.println(board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
            System.out.println("--+---+--");
            System.out.println(board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
            System.out.println("--+---+--");
            System.out.println(board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
            moves++;
            if(moves > 9){ // it's been more than 9 moves and no one has won, so it's a draw; end the loop
                win = false;
                draw = true;
            }
        }
        if(moves >= 9 && draw){ // a draw condition
            System.out.println("It's a draw - good game and thanks for playing!");
            System.out.println(board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
            System.out.println("--+---+--");
            System.out.println(board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
            System.out.println("--+---+--");
            System.out.println(board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
        }
    }
}
