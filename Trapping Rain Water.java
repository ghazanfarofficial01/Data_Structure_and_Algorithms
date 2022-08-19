class Solution{
    
   
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        // Your code here
        int[] left_max = new int[n];
        int[] right_max = new int[n];
        
        left_max[0] = arr[0];
        
        for(int i = 1; i<n; i++){
            left_max[i] = Math.max(left_max[i-1], arr[i]);
        }
        
          right_max[n-1] = arr[n-1];
         for(int i = n-2; i>=0; i--){
            right_max[i] = Math.max(right_max[i+1], arr[i]);
        }
        
        long ans = 0;
        
        for(int i = 0; i<n; i++){
            ans += (long)(Math.min(left_max[i], right_max[i]) - arr[i]);
        }
        return ans;
    } 
}
