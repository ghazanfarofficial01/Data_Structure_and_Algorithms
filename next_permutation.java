class Solution{
    static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
      
    static List<Integer> nextPermutation(int N, int arr[]){
        // code here
        List<Integer> list = new ArrayList<>();
        //find peak
        int peak = -1;
        int i = 1;
        while(i<N){
            if(arr[i] > arr[i-1]){
                peak = i;
            }
            i++;
        }
         // if given sequence is the highest sequence
         if(peak == -1){
             Arrays.sort(arr);
             for (int j : arr)
             {
             list.add(j);
               }
            return list;
           
            
         }
         
        //find element > arr[peak-1] and <arr[peak]
        int index = peak-1;
        int peak2 = peak;
        for(i = peak; i<N; i++){
            if(arr[i]> arr[peak-1] && arr[i] < arr[peak]){
                peak2 = i;
            }
        }
        swap(arr,index,peak2);
        Arrays.sort(arr,peak,N);
        
        for (int j : arr)
             {
             list.add(j);
               }
           return list;
        
        
    }
      
}
