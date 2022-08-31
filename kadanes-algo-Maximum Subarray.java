class Solution {
    
    //using kadanes algo
    public int maxSubArray(int[] nums) {
        
        int c_sum = 0;
        int sum = Integer.MIN_VALUE;
        
        for(int i = 0; i<nums.length; i++){
            c_sum += nums[i];
            if(c_sum > sum) sum = c_sum;
            if(c_sum < 0) c_sum = 0;
            
        }
        return sum;
    }
}

// T.C = O(n)
//S.C = O(1)
