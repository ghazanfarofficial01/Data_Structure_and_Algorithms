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

//Time- O(N)
//Space - O(N)


/* Another approach for O(N) time and O(1)
extra space*/

class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        int[] result = new int[2];
        
        //find twice occuring
        for(int i = 0; i<n; i++){
            int abs_value = Math.abs(arr[i]);
            if(arr[abs_value -1] > 0){
                arr[abs_value-1] = -arr[abs_value-1];
            }
            else result[0] = abs_value;
        }
            //finding missing
            for(int i = 0; i<n; i++){
                if(arr[i] > 0) result[1] = i+1;
            }
            
            return result;
        
    }
}
