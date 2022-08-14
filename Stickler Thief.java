// Memoisation Approach
class Solution
{
    //Function to find the maximum money the thief can get.
    
    public int solve(int[] arr, int n, int[] dp){
        if(n < 0){
            return 0;
        }
        
        if(n==0){
            return arr[0];
        }
        if(dp[n] != 0) return dp[n];
        
        int incl = solve(arr,n-2,dp) + arr[n];
        int excl = solve(arr,n-1,dp) + 0;
        
        dp[n] =  Math.max(incl, excl);
        return dp[n];
    }
    
    
    public int FindMaxSum(int arr[], int n)
    {
        // Your code here
        int[] dp = new int[n];
        int ans = solve(arr,n-1,dp);
        return ans;
        
    }
}

// Tabulation from pepcoding video
class Solution
{
    //Function to find the maximum money the thief can get.
    public int FindMaxSum(int arr[], int n)
    {
        // Your code here
        if(n == 1)
            return arr[0];
            
         int incl = arr[0];
         int excl = 0;
         
         for(int i = 1; i<n; i++){
             int new_incl = arr[i] + excl;
             int new_excl = Math.max(incl,excl);
             
             incl = new_incl;
             excl = new_excl;
         }
         
         return Math.max(incl,excl);
        
    }
}
