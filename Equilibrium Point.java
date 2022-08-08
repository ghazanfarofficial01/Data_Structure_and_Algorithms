class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        if(n == 1) return (int)1;
        long sum = 0;
        long leftSum = 0;
        
        for(int i = 0; i<n; i++){
            sum += arr[i];
        }
        
        for(int i = 0; i<n; i++){
            if(sum - arr[i] == leftSum) return (int)i+1;
            leftSum += arr[i];
            sum -= arr[i];
        }
        
        return -1;
    }
}
