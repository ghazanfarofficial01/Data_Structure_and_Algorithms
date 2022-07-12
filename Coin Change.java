//DP approach
//T.C = O(m*n)
// S.C = O(n)

class Solution {
    public long count(int S[], int m, int n) {
        // code here.
        long[] arr = new long[n+1];
        arr[0] = 1;
        for(int i = 0; i< m; i++){
            
            for(int j = S[i]; j<arr.length; j++){
                arr[j] += arr[j - S[i]];
            }
        }
        return (long)arr[n];
    }
}
