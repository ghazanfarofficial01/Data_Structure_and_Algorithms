class Solution
{
    
    public int CountWays(String str)
    {    
        int mod = (int)Math.pow(10,9) + 7;
        if(str.charAt(0) == '0') return 0;
        // code here
        int length = str.length();
        int[] dp = new int[length];
        
        dp[0] = 1;
        
        for(int i = 1; i<length; i++){
            
            if(str.charAt(i-1) == '0' && str.charAt(i) == '0'){
                dp[i] = 0;
            }
            
            else if(str.charAt(i-1) == '0' && str.charAt(i) != '0'){
                dp[i] = dp[i-1]% mod;
            }
            
            else if(str.charAt(i-1) != '0' && str.charAt(i) == '0'){
                if(str.charAt(i-1) == '1' || str.charAt(i-1) == '2')
                    dp[i] = ((i>=2?dp[i-2]:1)) % mod;
                    
                else dp[i] = 0;    
            }
            
            else{
                if(Integer.valueOf(str.substring(i-1, i+1)) <= 26){
                    dp[i]  = (dp[i-1] + (i>=2?dp[i-2]:1)) % mod;
                }
                
                else dp[i] = dp[i-1]%mod;
            }
        }
        
        return dp[length-1];
    }
}
