class Solution
{
    long findSwapValues(long A[], int n, long  B[], int m)
    {
        // Your code goes here
        long sumA=0;
        long sumB=0;
        for(int i = 0; i<n; i++){
            sumA += A[i];
        }
        
        for(int i = 0; i<m; i++){
            sumB += B[i];
        }
          //did not understand 
          if ((sumA - sumB) % 2 != 0)
                 return -1L;
         
          long target = (sumA - sumB)/2;
        
           
        
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        int i = 0, j = 0;
        
        while(i<n && j<n){
            long dif = (A[i] - B[j]);
            
             if (dif == target)
            {
                
                return 1L;
            }
  
            // Look for a greater value in A[]
            else if (dif < target)
                i++;
  
            // Look for a greater value in B[]
            else
                j++;
        }
        
        return -1L;
    }
}
