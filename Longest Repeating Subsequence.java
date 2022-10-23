class Solution
{
    public int LongestRepeatingSubsequence(String str)
    {
        // code here
         int n = str.length();
  
        // Create and initialize DP table
        int[][] dp = new int[n+1][n+1];
        
          for(int i = n-1; i>= 0; i--){
              
              for(int j = n-1; j>= 0; j--){
                  
                  if (str.charAt(i) == str.charAt(j) && i!=j){
                      dp[i][j] = 1 + dp[i+1][j+1];
                  }
                  
                  else{
                      dp[i][j] = Math.max(dp[i+1][j], dp[i][j+1]);
                  }
              }
          }
          return dp[0][0];
          
        //another way of filling the table approach is same
        // for (int i=1; i<=n; i++)
        // {
        //     for (int j=1; j<=n; j++)
        //     {
        //         // If characters match and indexes are not same
        //         if (str.charAt(i-1) == str.charAt(j-1) && i!=j)
        //             dp[i][j] =  1 + dp[i-1][j-1];         
                       
        //         // If characters do not match
        //         else
        //             dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
        //     }
        // }
        // return dp[n][n];
    }
}
