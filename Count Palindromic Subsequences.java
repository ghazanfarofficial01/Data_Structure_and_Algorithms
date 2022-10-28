class Solution
{    
    final long mod = 1000000007;
    long countPS(String str)
    {
        
        int n = str.length();
        long[][] dp = new long[n][n];
        
        for(int g = 0; g<n; g++){
            
            for(int i = 0, j=g; j<n; i++, j++){
                
                if(g == 0){
                    dp[i][j] = 1;
                }
                
                else if(g == 1){
                    dp[i][j] = (str.charAt(i) == str.charAt(j))? 3L: 2L;
                }
                
                else{
                    if(str.charAt(i) == str.charAt(j))
                       dp[i][j] =  (((dp[i][j-1]) % mod + (dp[i+1][j] +1) % mod) % mod) % mod;
                       
                    else  dp[i][j] = (((dp[i][j-1]) % mod + (dp[i+1][j]) % mod - ((dp[i+1][j-1]) % mod) + mod) % mod) % mod;   
                }
            }
        }
        
        return dp[0][n-1];
    }
}
