class Solution {
    
    int binary_search(int[] arr, int x, int l, int h){
        if(l<=h){
        
            int mid = l + (h-l) / 2;
            
            if(x == arr[mid]) return mid;
            
            else if(x > arr[mid]) return binary_search(arr,x,mid+1,h);
            
            else return binary_search(arr,x,l,mid-1);
        }
        return -1;
        
    }
    int binarysearch(int arr[], int n, int k) {
        // code here
        int low = 0;
        int high = n-1;
        int ans = binary_search(arr,k,low,high);
        return ans;
    }
}
