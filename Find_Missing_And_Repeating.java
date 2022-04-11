class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        int[] hash = new int[n+1];
        int missing =0, twice = 1;
        
        for(int i = 0; i<=n; i++){
            hash[i] = -1;
        }
        
        for(int i = 0; i<n; i++){
            if(hash[arr[i]] > 0){
                twice = arr[i];
            }
            
            else hash[arr[i]] = 1;
        }
        
        for(int i = 1; i<=n; i++){
            if(hash[i] < 0) missing = i;
        }
        
        int[] result = {twice,missing};
        return result;
    }
}
