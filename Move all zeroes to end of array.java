class Solution {
    void pushZerosToEnd(int[] arr, int n) {
       
        
        int x = -1;
        for(int i = 0; i<n; i++){
            if(arr[i] != 0){
                x++;
                
               int temp = arr[x];
                arr[x] = arr[i];
               arr[i] = temp;
                
            }
        }
    }
}
