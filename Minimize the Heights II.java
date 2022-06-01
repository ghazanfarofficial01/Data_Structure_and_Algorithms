
class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);
        int max = arr[n-1];
        int min = arr[0];
        int res = max - min;
        
        for(int i = 1; i< n; i++){
            if(arr[i] >=k){
            max = Math.max(arr[i-1] + k, arr[n-1]-k);
            min = Math.min(arr[i]-k, arr[0] + k);
            res = Math.min(res, max - min);
            }
        }
        
        return res;
    }
}
