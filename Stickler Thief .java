class Solution
{
    //Function to find the maximum money the thief can get.
    public int FindMaxSum(int arr[], int n)
    {
        // Your code here
        int incl_curr = arr[0];
        int excl_curr = 0;
        
        int incl_prev = incl_curr;
        int excl_prev = excl_curr;
        
        
        for(int i = 1; i<n; i++){
            //if we are eccluding cuurent we can select sum including prev or excluding prev, which is greater.
            excl_curr = Math.max(incl_prev, excl_prev);
            
            incl_curr = excl_prev + arr[i];
            
            //updating prev variables
            incl_prev = incl_curr;
            excl_prev = excl_curr;
        }
        
        return Math.max(incl_curr, excl_curr);
    }
}
