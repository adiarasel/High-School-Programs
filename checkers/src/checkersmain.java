/*
* Aditikrishna Mandula
* Period 6
* */
import java.util.*;
import java.math.*;
public class checkersmain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        pieces[][] board = new pieces[8][8];
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8 ;j++){
                board[i][j] = new pieces(i, j, false, " ");
            }
        }
        for(int i = 0; i < 3; i++){
            if (i % 2 == 0){
                for(int j = 1 ; j < 8; j+=2){
                    board[i][j] = new pieces(i, j, false, "r");
                }
            }
            else{
                for(int j = 0 ; j < 8; j+=2){
                    board[i][j] = new pieces(i, j, false, "r");
                }
            }
        }
        for(int i = 5; i < 8; i++){
            if(i % 2 == 1){
                for(int j = 0 ; j < 8; j+=2){
                    board[i][j] = new pieces(i, j, false, "b");
                }
            }
            else{
                for(int j = 1 ; j < 8; j+=2){
                    board[i][j] = new pieces(i, j, false, "b");
                }
            }
        }


        System.out.println("Follow the rules of the English Draughts version of checkers!");

        while(true){
            printBoard(board);
            System.out.println("Pick a piece you want to move by saying the coordinates of the piece. (ycor first though, and top left is 0 0.)");
            int pY = scan.nextInt();
            int pX = scan.nextInt();
            scan.nextLine();
            while(pY < 0 || pY >= 8 || pX < 0 || pX >= 8){
                System.out.println("Um, choose a piece that's on the board please!");
                pY = scan.nextInt();
                pX = scan.nextInt();
                scan.nextLine();
            }
            board = move(board, true, pX, pY);
            if(WinR(board)){
                System.out.println("The player of the Red wins!");
            }
            if(WinB(board)){
                System.out.println("The player of the Black wins!");
            }
        }
    }
    public static void printBoard(pieces[][] board){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                System.out.print("| " + board[i][j].getApp() + " ");
            }
            System.out.println();
        }
    }

    public static pieces[][] move(pieces[][] board, boolean captured, int xcor, int ycor){
        Scanner scan = new Scanner(System.in);
        pieces piece = board[ycor][xcor];
        if(captured){
            printBoard(board);
            if(WinR(board) || WinB(board)) return board;
            System.out.println("Where do you want to move the piece you've selected? (again, ycor first)");
            int desty = scan.nextInt();
            int destx = scan.nextInt();
            while(!(check1square(board, desty, destx, piece) || check2squares(board, desty, destx, piece))){
                System.out.println("That's an  invalid move! Pick another place to move your piece!");
                desty = scan.nextInt();
                destx = scan.nextInt();
                scan.nextLine();
                if(destx > 7 || destx < 0 || desty < 0 || desty > 7){
                    return board;
                }
            }
            if(check1square(board, desty, destx, piece)){
                board[desty][destx].setApp(piece.getApp());
                piece.setApp(" ");
                board = isaking(board);
                move(board, false, xcor, ycor);
            }
            if(check2squares(board, desty, destx, piece)){
                board[desty][destx].setApp(piece.getApp());
                piece.setApp(" ");
                board[(piece.getY() + ycor) / 2][(piece.getX() + xcor) / 2].setApp(" ");
                board = isaking(board);
                move(board, false, board[desty][destx].getX(), board[desty][destx].getY());
            }
        }

        return board;
    }

    public static boolean WinR(pieces[][] board){
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if(board[i][j].getApp().equalsIgnoreCase("B")) return false;
            }
        }
        return true;
    }
    public static boolean WinB(pieces[][] board){
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if(board[i][j].getApp().equalsIgnoreCase("R")) return false;
            }
        }
        return true;
    }

    public static boolean check1square(pieces[][] board, int desty, int destx, pieces piece){
        //out of bounds?
        if(destx >= 8 || destx < 0 || desty >= 8 || desty < 0)
            return false;
        //teleporting?
        if(!((destx == piece.getX() - 1 || destx == piece.getX() + 1) && (desty == piece.getY() + 1 || desty == piece.getY() - 1))){
            return false;
        }
        //piece on destined square?
        if(!board[desty][destx].getApp().equals(" ")){
            return false;
        }
        //isaking
        if(piece.kingStatus() &&
                !(board[desty][destx].getApp().equalsIgnoreCase("r") || board[desty][destx].getApp().equalsIgnoreCase("b"))){
            return true; // can move anywhere as long as location is not a piece
        }
        //for r; moving downwards and not straight down (diagonally)
        if(piece.getApp().equals("r") && desty == piece.getY() + 1 && destx - piece.getX() != 0){
            return true;
        }
        //for b; moving upwards and not straight down (diagonally)
        if(piece.getApp().equals("b") && desty == piece.getY() - 1 && destx - piece.getX() != 0){
            return true;
        }
        return false;
    }

    public static boolean check2squares(pieces[][] board, int desty, int destx, pieces piece){
        //oob?
        if(destx >= 8 || destx < 0 || desty >= 8 || desty < 0)
            return false;
        // piece on location?
        if((board[desty][destx].getApp().equals("o") || board[desty][destx].getApp().equals("x"))){
            return false;
        }
        //if piece is a king, and it's 2 away and there's a piece in the middle (that's the opposite)
        if(piece.kingStatus() && piece.getApp().equalsIgnoreCase("b") && Math.abs(piece.getX() - destx) == 2 && Math.abs(piece.getY() - desty) == 2
                && board[(piece.getY() + desty)/2][(piece.getX() + destx)/2].getApp().equalsIgnoreCase("r")){
            return true;
        }
        if(piece.kingStatus() && piece.getApp().equalsIgnoreCase("r") && Math.abs(piece.getX() - destx) == 2 && Math.abs(piece.getY() - desty) == 2
                && board[(piece.getY() + desty)/2][(piece.getX() + destx)/2].getApp().equalsIgnoreCase("b")){
            return true;
        }
        //if it's a regular piece and it's above/below depending on the piece
        if(piece.getApp().equals("b") && desty == piece.getY() - 2 && (destx == piece.getX() - 2 || destx == piece.getX() + 2)
                && (board[(piece.getY() + desty)/2][(piece.getX() + destx)/2].getApp().equals("r") || board[(piece.getY() + desty)/2][(piece.getX() + destx)/2].getApp().equals("x"))){
            return true;
        }
        if(piece.getApp().equals("r") && desty == piece.getY() + 2 && (destx == piece.getX() - 2 || destx == piece.getX() + 2)
                && (board[(piece.getY() + desty)/2][(piece.getX() + destx)/2].getApp().equals("b") || board[(piece.getY() + desty)/2][(piece.getX() + destx)/2].getApp().equals("x"))) {
            return true;
        }

        return false;
    }
    public static pieces[][] isaking(pieces[][] board){
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if(board[i][j].getApp().equals("r") && board[i][j].getY() == 7){
                    board[i][j].makeKing(true);
                    board[i][j].setApp("R");
                    System.out.println("Congratulations, your piece is now a king!");
                }
                if(board[i][j].getApp().equals("b") && board[i][j].getY() == 0){
                    board[i][j].makeKing(true);
                    board[i][j].setApp("B");
                    System.out.println("Congratulations, your piece is now a king!");
                }
            }
        }
        return board;
    }
}
