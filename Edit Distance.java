class Solution {
    public int editDistance(String s, String t) {
        // Code here
        int n1 = s.length();
        int n2 = t.length();
        
        int[][] dp = new int[n1+1][n2+2];
        
        for(int i = 0; i<=n1;i++){
            
            for(int j = 0;j<=n2;j++){
                if(i == 0) dp[i][j] = j;
                
                else if(j==0) dp[i][j]= i;
                
                else if(s.charAt(i-1) == t.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                    
                }
                
                else dp[i][j] =1+ Math.min(dp[i][j-1],//insert
                                 Math.min(dp[i-1][j], //remove
                                          dp[i-1][j-1]));//replace
            }
        }
        return dp[n1][n2];
    }
}

// TC= O(m*n)
// SC = O(m*n)
