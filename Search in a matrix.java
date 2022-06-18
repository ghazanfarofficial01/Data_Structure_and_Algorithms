//both solution takes O(n+m) time

class Sol
{    //2.06 ms to execute
    public static int matSearch(int mat[][], int N, int M, int X)
    {
           for(int i = 0; i<N; i++){
                  int s =0;
                  int e = M-1;
             if(mat[i][s] <= X && mat[i][e] >=X){
                 while(s<=e){
                 if(mat[i][s] == X || mat[i][e] ==X) return 1;

                         s++;
                         e--;
                 }
             }
         }
         return 0;
    }
}

/***************************************************************/
Class Sol{
  //2.27 ms to execute
public static int matSearch(int mat[][], int N, int M, int X)
{
        int i = 0;
        int j = M-1;
        while(i<N&&j>=0){
          if(mat[i][j] == X) return 1;
           
          else if(mat[i][j] < X ) i++;
            
            else if(mat[i][j] > X) j--;
        }
        
         return 0;
}
}
