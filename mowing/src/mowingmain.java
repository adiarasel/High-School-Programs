/*
 * Aditikrishna Mandula
 * Period 6
 */
import java.util.*;
public class mowingmain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lawnnum = scan.nextInt(); scan.nextLine();
        String[][] grid = new String[42][42];
        String[] rist = new String[42];
        String[][] dummy = new String[42][42];
        boolean[][] visited = new boolean[42][42];
        int l, w, ri, ci;
        for(int i = 0; i < lawnnum; i++){
            //input everything
            l = scan.nextInt();
            w = scan.nextInt();
            ri = scan.nextInt();
            ci = scan.nextInt();
            scan.nextLine();
             // input the grid with NO SPACES IN BETWEEN THE STRINGS PLEASE OTHERWISE IT FAILS
            for(int j = 0; j < l; j++){
                    rist[j] = scan.nextLine();
                    rist[j] += "    ";
            }
            for(int j = 0; j < l; j++){
                for(int k = 0; k < w; k++){
                    String x = rist[j].substring(k, k+1);
                    grid[j][k] = x;
                }
            }
            //reset visited
            for(int j = 0; j < l; j++){
                for(int k = 0; k < w; k++){
                    visited[j][k] = false;
                }
            }
            floodFill(grid, visited, ri, ci, l, w);
            for(int j = 0; j < l; j++){
                for(int k = 0; k < w; k++){
                    System.out.print(grid[j][k] + " ");
                }
                System.out.println();
            }
        }
    }

    //Floodfill algorithm:
    public static void floodFill(String[][] grid, boolean[][] visited, int r, int c, int l, int w) {
//        System.out.println("Entered the floodfill!");
        //quit if off the grid:
        if(!notoffgrid(grid, r, c, l, w)) return;

//        System.out.println("Not off the grid :D");
        //quit if visited already:

        if(visited[r][c]) return;
        visited[r][c] = true;
//        System.out.println("Not visited :DD");

        //quit if hit tree:
        if(grid[r][c].equals("T") || grid[r][c-1].equals("T") || grid[r][c+1].equals("T") || grid[r-1][c].equals("T") || grid[r-1][c+1].equals("T")
                || grid[r-1][c-1].equals("T") || grid[r+1][c].equals("T") || grid[r+1][c+1].equals("T") || grid[r+1][c-1].equals("T")) return;
//        System.out.println("Not hitting a tree :DDD");

        //we want to visit places with periods in them:
        if(grid[r][c].equals(".") || grid[r][c].equals("C") ){
            grid[r][c-1] = "C";
            grid[r][c] = "C";
            grid[r][c+1] = "C";
            grid[r+1][c-1] = "C";
            grid[r+1][c] = "C";
            grid[r+1][c+1] = "C";
            grid[r-1][c-1] = "C";
            grid[r-1][c] = "C";
            grid[r-1][c+1] = "C";
        }

        //recursively fill in all 4 directions
        floodFill(grid,visited,r+1,c, l, w);
        floodFill(grid,visited,r-1,c, l, w);
        floodFill(grid,visited,r,c+1, l, w);
        floodFill(grid,visited,r,c-1, l, w);
    }
    //Checks if all parts of lawnmower are inside the bounds
    public static boolean notoffgrid(String[][] grid, int r, int c, int l, int w){
//        System.out.println("Entered the offgrid!");
        if(r >= 1 && c >= 1 && r < l-1 && c < w-1) return true;
        return false;
    }
}
/*
1
12 11 5 6
...........
...T.....T.
...........
...........
.T.........
...T.......
.T.........
.........T.
..T.......T
......T....
...........
......T....
* */