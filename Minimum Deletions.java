class Solution{
    
     static int longestPalinSubseq(String S)
    {
        int n = S.length();
        
        int[][] dp = new int[n][n];
        
        for(int g = 0; g<n; g++){
            
            for(int i = 0, j = g; j<n; j++, i++){
                if(g==0){
                    dp[i][j] = 1;
                }
                
                else if(g == 1){
                    dp[i][j] = (S.charAt(i) == S.charAt(j))?2:1;
                }
                
                else{
                    if(S.charAt(i) == S.charAt(j)){
                        dp[i][j] = 2+ dp[i+1][j-1];
                    }
                    
                    else{
                        dp[i][j] = Math.max(dp[i][j-1], dp[i+1][j]);
                    }
                }
            }
        }
        
        return dp[0][n-1];
    }
  
  //approach is to count longest palindromic subsequence and subtract it from length of the given string
    static int minimumNumberOfDeletions(String S) {
        //your code here
        int val = longestPalinSubseq(S);
        return S.length() - val;
    }
}
