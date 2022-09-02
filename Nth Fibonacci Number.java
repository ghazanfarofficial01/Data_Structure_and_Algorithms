class Solution {
    static long nthFibonacci(long n){
        // code here
        if(n<=2) return n-1;
        long[] arr = new long[(int)n+1];
        arr[0] = 0;
        arr[1] = 1;
        
        for(int i = 2; i<(int)n+1; i++){
            arr[i] = (arr[i-1] + arr[i-2]) % 1000000007;
        }
            
        return arr[(int)(n)];
    }
}
