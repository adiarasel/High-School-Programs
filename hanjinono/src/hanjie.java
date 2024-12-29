/*
* Naren Krishna Jegan Period 1
* Aditikrishna Mandula Period 6
* */
import java.util.*;

public class hanjie {
    static String[][] board = {
            {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
            {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
            {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
            {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
            {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
            {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
            {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
            {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
            {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
            {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}
    };

    public static void main(String[] args) {
        int[][] rowData = new int[10][3];
        int[][] colData = new int[10][3];
        int[][] currowData = new int[10][3];
        int[][] curcolData = new int[10][3];
        int[] xlist = new int[100];
        int[] ylist = new int[100];

        getData(rowData, colData);
        for (int i = 0; i < 5; i++) {
            prelimFill(rowData, colData, board);
            checkEdges(rowData, colData, board);
        }
        blankSpaces(xlist, ylist, board);
        while(true){
            for(int i = 0; i < xlist.length; i++){
                int bool = (int)(Math.random() * 2);
                if(bool == 0){
                    board[xlist[i]][ylist[i]] = "X";
                }
            }
            dataGen(board, currowData, curcolData);
            if(checkData(rowData, colData, currowData, curcolData)) break;
        }
        printBoard(board);
    }

    public static void getData(int[][] rowData, int[][] colData) {
        Scanner scanner = new Scanner(System.in);

        for (int row = 1; row <= 10; row++) {
            System.out.println("Enter row #" + row + " term #1");
            int num1 = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter row #" + row + " term #2");
            int num2 = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter row #" + row + " term #3");
            int num3 = scanner.nextInt();
            scanner.nextLine();

            rowData[row - 1][0] = num1;
            rowData[row - 1][1] = num2;
            rowData[row - 1][2] = num3;
        }

        for (int col = 1; col <= 10; col++) {
            System.out.println("Enter col #" + col + " term #1");
            int num1 = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter col #" + col + " term #2");
            int num2 = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter col #" + col + " term #3");
            int num3 = scanner.nextInt();
            scanner.nextLine();

            colData[col - 1][0] = num1;
            colData[col - 1][1] = num2;
            colData[col - 1][2] = num3;
        }
    }

    public static boolean checkData(int[][] rowData, int[][] colData, int[][] rowData2, int[][] colData2) {
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 3; j++){
                if(rowData[i][j] != rowData2[i][j]) return false;
            }
        }
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 3; j++){
                if(colData[i][j] != colData2[i][j]) return false;
            }
        }
        return true;
    }
    public static void printBoard(String[][] board) {
        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void prelimFill(int[][] rowData, int[][] colData, String[][] board) {
        for (int index = 0; index < 10; index++) {
            if (worksForPrelimSingleDigits(rowData, index)) {
                int lastDigit = rowData[index][2];
                if (lastDigit == 6) {
                    board[index][4] = "X";
                    board[index][5] = "X";
                } else if (lastDigit == 7) {
                    board[index][3] = "X";
                    board[index][4] = "X";
                    board[index][5] = "X";
                    board[index][6] = "X";
                } else if (lastDigit == 8) {
                    board[index][2] = "X";
                    board[index][3] = "X";
                    board[index][4] = "X";
                    board[index][5] = "X";
                    board[index][6] = "X";
                    board[index][7] = "X";
                } else if (lastDigit == 9) {
                    board[index][1] = "X";
                    board[index][2] = "X";
                    board[index][3] = "X";
                    board[index][4] = "X";
                    board[index][5] = "X";
                    board[index][6] = "X";
                    board[index][7] = "X";
                    board[index][8] = "X";
                } else if (lastDigit == 10) {
                    board[index][0] = "X";
                    board[index][1] = "X";
                    board[index][2] = "X";
                    board[index][3] = "X";
                    board[index][4] = "X";
                    board[index][5] = "X";
                    board[index][6] = "X";
                    board[index][7] = "X";
                    board[index][8] = "X";
                    board[index][9] = "X";
                }
            }
            if (worksForPrelimSingleDigits(colData, index)) {
                int lastDigit = colData[index][2];

                if (lastDigit == 6) {
                    board[4][index] = "X";
                    board[5][index] = "X";
                } else if (lastDigit == 7) {
                    board[3][index] = "X";
                    board[4][index] = "X";
                    board[5][index] = "X";
                    board[6][index] = "X";
                } else if (lastDigit == 8) {
                    board[2][index] = "X";
                    board[3][index] = "X";
                    board[4][index] = "X";
                    board[5][index] = "X";
                    board[6][index] = "X";
                    board[7][index] = "X";
                } else if (lastDigit == 9) {
                    board[1][index] = "X";
                    board[2][index] = "X";
                    board[3][index] = "X";
                    board[4][index] = "X";
                    board[5][index] = "X";
                    board[6][index] = "X";
                    board[7][index] = "X";
                    board[8][index] = "X";
                } else if (lastDigit == 10) {
                    board[0][index] = "X";
                    board[1][index] = "X";
                    board[2][index] = "X";
                    board[3][index] = "X";
                    board[4][index] = "X";
                    board[5][index] = "X";
                    board[6][index] = "X";
                    board[7][index] = "X";
                    board[8][index] = "X";
                    board[9][index] = "X";
                }
            }
            if (worksForPrelimDougleDigits(colData, index)) {
                for (int i = 0; i <= colData[index][1]; i++) {
                    board[i][index] = "X";
                    if (i == colData[index][1]) {
                        board[i][index] = ".";
                    }
                }
                for (int i = colData[index][1] + 1; i < 10; i++) {
                    board[i][index] = "X";
                }
            }
            if (worksForPrelimDougleDigits(rowData, index)) {
                for (int i = 0; i <= rowData[index][1]; i++) {
                    board[index][i] = "X";
                    if (i == rowData[index][1]) {
                        board[index][i] = ".";
                    }
                }
                for (int i = rowData[index][1] + 1; i < 10; i++) {
                    board[index][i] = "X";
                }
            }
            if (rowData[index][0] == 0 && rowData[index][1] == 0 && rowData[index][2] == 0){
                for(int col = 0; col < 10; col++){
                    board[index][col] = ".";
                }
            }
            if (colData[index][0] == 0 && colData[index][1] == 0 && colData[index][2] == 0){
                for(int row = 0; row < 10; row++){
                    board[row][index] = ".";
                }
            }

        }
    }

    //CHECKER METHODS FOR FILLING INITIAL SPACES
    public static boolean worksForPrelimSingleDigits (int[][] rowOrCol, int index){
        return (rowOrCol[index][0] == 0 && rowOrCol[index][1] == 0 && rowOrCol[index][2] >= 6);
    }
    public static boolean worksForPrelimDougleDigits(int[][] rowOrCol, int index){
        return (rowOrCol[index][0] == 0 && rowOrCol[index][1] != 0 && rowOrCol[index][2] != 0 &&
                rowOrCol[index][1] + rowOrCol[index][2] >= 9);
    }

    //METHOD THAT FILLS EDGES
    public static void checkEdges(int[][] rowData, int[][] colData, String[][] board){
        for(int index = 0; index < 10; index++){

            //Easiest case: bottom row
            if((board[9][index].equals("X")) && (colData[index][2] != 0)){
                //We can fill this out
                for(int i = 9; i  > 9 - colData[index][2]; i--){
                    board[i][index] = "X";
                }
            }

            //Next case: right column
            if(board[index][9].equals("X") && rowData[index][2] != 0){
                //we can fill this
                for(int i = 9; i  > 9 - rowData[index][2]; i--){
                    board[index][i] = "X";
                }
            }
            // this is top row
            if((board[0][index].equals("X")) && (colData[index][0] != 0)){
                //We can fill this out
                for(int i = 0; i < colData[index][0]; i++){
                    board[i][index] = "X";
                }
            }
            // left column
            if((board[index][0].equals("X")) && (rowData[index][0] != 0)){
                //We can fill this out
                for(int i = 0; i < rowData[index][0]; i++){
                    board[index][i] = "X";
                }
            }
        }
    }
    // it's easier to check if the data matches than if the grid has the correct data
    public static void dataGen(String[][] board,int[][] rowData, int[][] colData){
        int rowcounter = 2, number = 0;
        for(int i = 0; i < 10; i++){
            for(int j = 1; j < 10; j++){
                if(board[i][j].equals("X")){
                    number++;
                }
                if((board[i][j].equals("-") && board[i][j-1].equals("X")) || j == 9){
                    rowData[i][rowcounter] = number;
                    number = 0;
                    rowcounter--;
                }
                if(rowcounter == 0) rowcounter = 2;
            }
            rowcounter = 2;
            number = 0;
        }
        rowcounter = 2;
        number = 0;
        for(int i = 1; i < 10; i++){
            for(int j = 0; j < 10; j++){
                if(board[j][i].equals("X")){
                    number++;
                }
                if((board[j][i].equals("-") && board[j][i-1].equals("X")) || i == 9){
                    colData[j][rowcounter] = number;
                    number = 0;
                    rowcounter--;
                }
                if(rowcounter == 0) rowcounter = 2;
            }
            rowcounter = 2;
            number = 0;
        }
    }
    //bc of our algorithms, we have a starting point for the bogosort, but we don't want it to go to waste
    //so i make a list of the blank spaces left to be randomly filled
    //really slow but still faster than an entire bogosort
    public static void blankSpaces(int[] xlist, int[] ylist, String[][]board){
        int counter = 0;
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                if(board[i][j].equals("-")){
                    xlist[counter] = i;
                    ylist[counter] = j;
                    counter++;
                }
            }
        }
    }

}
