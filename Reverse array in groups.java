class Solution {
    //Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Integer> list, int n, int k) {
       
         
        for(int i = 0; i<n; i +=k){
            int low = i;
            int high = (i+k)-1;
            if(high > n-1)
                high = n-1;
          
            
            while(low<high){
                
                Collections.swap(list, low, high);
                low++;
                high--;
            }
            }
            
            
    }
}
