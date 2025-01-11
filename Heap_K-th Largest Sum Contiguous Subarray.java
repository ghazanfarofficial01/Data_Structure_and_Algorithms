class Solution {
    public static int kthLargest(int[] arr, int k) {
       
       int sum[] = new int[arr.length+1];
       sum[0] = 0;
       sum[1] = arr[0];
       for(int i = 2; i<= arr.length; i++){
           sum[i] = sum[i-1] + arr[i-1];
           
       }
       
       
       PriorityQueue<Integer> minHeap = new PriorityQueue<>();
       
       for(int i = 1; i<= arr.length-1; i++){
           
           for(int j = i; j<=arr.length; j++){
               
               int s = sum[j] - sum[i - 1];
                //System.out.println(s);
                if(minHeap.size()>= k ){
                   
                   if(minHeap.peek() < s )
                        minHeap.poll();
                        
                    else continue;        
               }
               
              minHeap.offer(s);
           }
       }
       
       return minHeap.peek();
    }
}
