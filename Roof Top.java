class Solution
{
    //Function to find maximum number of consecutive steps 
    //to gain an increase in altitude with each step.
    static int maxStep(int arr[], int n)
    {
        // Your code here
        int start = 0;
        int end = 0;
        int ans = 0;
        for(int i = 1; i<n; i++){
            if(arr[i] > arr[i-1]){
                end++;
                ans = Math.max(ans ,(end - start));
            }
            
            else end = start = i;
        }
        return ans;
    }
    
}
