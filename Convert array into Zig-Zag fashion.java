class Solution {
    void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
    
    void zigZag(int arr[], int n) {
        // code here
        for(int i = 0; i<n-1; i++){
            if(i % 2 == 0){
                if(arr[i] > arr[i+1]) swap(arr, i, i+1);
                
            }
            
            else{
                if(arr[i+1] > arr[i]) swap(arr, i, i+1);
            }
        }
    }

}
