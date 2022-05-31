class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        
        int n = arr.length;
        
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        
        if(n < 4) return list;
        
        for(int i = 0; i<n-3; i++){
            
            if (arr[i] > 0 && arr[i] > k) break;
            // removing duplicates
            if(i > 0 && arr[i] == arr[i-1]) continue;
            for(int j = i+1; j< n-2; j++){
                // removing duplicates
                if (j > i + 1 && arr[j] == arr[j - 1]) continue;
                 
                 //taking pointers.
                int l = j+1;
                int r = n-1;
                
                while(l<r){
                     int old_l = l;
                     int old_r = r;
                    if(arr[i] + arr[j] + arr[l] + arr[r] == k){
                        list.add(new ArrayList<Integer>(Arrays.asList(arr[i], arr[j], arr[l], arr[r])));
                        
                        // removing duplicates
                        while (l < r && arr[l] == arr[old_l]) l++;
                        while (l < r && arr[r] == arr[old_r]) r--;
                    }
                     else if(arr[i] + arr[j] + arr[l] + arr[r] > k){
                         r--;
                     }
                     
                      else{
                          l++;
                      }
                }
            }
        }
        return list;
    }
}
