class Solution {
    // Function to find maximum of each subarray of size k.
    public ArrayList<Integer> max_of_subarrays(int arr[], int k) {
        
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        
        
         PriorityQueue<Pair> p = new PriorityQueue<Pair>(
             (a,b) -> b.value - a.value
             );
         
        
        for(int i =0; i<k;i++){
            p.add(new Pair(arr[i],i));
        }
        
        
        int el = p.peek().value;
        list.add(el);
       

        for(int i = k; i<n; i++){
            p.add(new Pair(arr[i],i));
            
            while(p.peek().index<=i-k){
                p.poll();
            }
           
           list.add(p.peek().value);
        }
        
        return list;
    }
    
    
      static class Pair {
        int value;
        int index;

        public Pair(int value, int index)
        {
            this.value = value;
            this.index = index;
        }
    }
}
