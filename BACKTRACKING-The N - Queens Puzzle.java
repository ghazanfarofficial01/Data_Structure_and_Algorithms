import java.util.* ;
import java.io.*; 
public class Solution 
{   
    static ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>(); 
    
    static int[][] board;
    public static ArrayList<ArrayList<Integer>> nQueens(int n)
    {
     result.clear();
     board = new int[n][n];   
     solve(0, n, board);
     return result;
    } 

    public static void solve(int col,int n,int[][] board){
          if(col == n){
              addSol(n,board);
              return;
          }
         for(int row = 0; row<n; row++){
          if(isSafe(row,col,board,n)){
              board[row][col] = 1;
              solve(col+1, n, board);
              board[row][col] = 0;
          }
         }
    }

    
    public static void addSol(int n, int[][] board){
         ArrayList<Integer> temp = new ArrayList<>();

         for(int i = 0; i<n; i++){
             for(int j = 0; j<n; j++){
                 temp.add(board[i][j]);
             }
         }
         result.add(temp);
    }
    public static boolean isSafe(int row, int col, int[][] board, int n){
        int x = row;
        int y = col;
        while(y>=0){
            if(board[row][y] == 1) return false;
            y--;
        }
        
          x = row;
          y = col;

          while(x<n && y>=0){
              if(board[x][y] == 1)return false;
              x++;
              y--;
          }

          x = row;
          y = col;

          while(y>=0 && x>=0){
              if(board[x][y] == 1)return false;
              x--;
              y--;
          }
       return true;
    }
} 
