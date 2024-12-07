class Solution{
    public int[] mergeHeaps(int[] a, int[] b, int n, int m) {
        int[] result = new int[n+m];
        
        for(int i =0; i<n+m; i++){
            if(i<n) result[i] = a[i];
            
            if(i >= n) result[i] = b[i-n];
        }
        
        
        
        for(int i = result.length/2; i>=0; i--){
            heapyfy(result,i,result.length);
        }
        
        return result;
    }
    
    static void heapyfy(int[] arr, int i, int n){
        
        int largest = i;
        int left = 2*i +1;
        int right = 2*i +2;
        
        if(left < n && arr[largest] <= arr[left]){
            largest = left;
        }
        
        if(right < n && arr[largest] <= arr[right]){
            largest = right;
        }
        
        if(largest != i){
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;
            
            heapyfy(arr,largest, n);
        }
        
    }
}
