//dp approach
//TC - O(m*n)
//SC - O(m*n)
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n1 = text1.length();
        int n2 = text2.length();
        int[][] dp = new int[n1+1][n2+1];
        for(int i = 1; i<=n1; i++ ){
            for(int j = 1; j<= n2; j++){
                if(text1.charAt(i-1) == text2.charAt(j-1))
                    dp[i][j] = 1 + dp[i-1][j-1];
                else dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[n1][n2];
    }
}

/******************************************************************************/
//Function to find the length of longest common subsequence in two strings using memoisation

class Solution
{  
    
    static int lcs(int m, int n, String s1, String s2)
    {
    
    int[][] dp = new int[m + 1][n + 1];
    
       for(int i=0;i<m + 1;i++){
           
        for(int j=0;j<n + 1;j++){
            
          dp[i][j] = -1;
          
         }
            }
          
          return l_c_s(s1,s2,0,0,dp);
          
    }
    
    
    static int l_c_s(String s1, String s2, int x, int y, int[][] dp){
             //base case
        if(x>= s1.length()) return 0;
        if(y>= s2.length()) return 0;
        
        if(dp[x][y] != -1) return dp[x][y];
        
        if(s1.charAt(x) == s2.charAt(y)){
            return dp[x][y] = 1 + l_c_s(s1,s2,x+1,y+1,dp);
        }
        
        else{
            return dp[x][y] = Math.max(l_c_s(s1,s2,x,y+1,dp),l_c_s(s1,s2,x+1,y,dp));
        }
    }
    
}
