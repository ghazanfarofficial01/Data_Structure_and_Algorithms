class Complete{
    
   
    // Function for finding maximum and value pair
    public static int search (int arr[], int n, int x, int k) {
        
        
        for(int i = 0 ; i<n ; i++){
            
            
            if(x == arr[i]) return i;
            
            
        }
        
        return -1;
    }
    
    
}
