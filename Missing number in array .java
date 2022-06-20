class Solution {
    int MissingNumber(int array[], int n) {
        // Your Code Here
        int sum_til_n = (n*(n+1))/2;
        int sum = 0;
        
        for(int i = 0; i<n-1; i++){
            sum += array[i];
        }
        
        return sum_til_n - sum;
    }
}
