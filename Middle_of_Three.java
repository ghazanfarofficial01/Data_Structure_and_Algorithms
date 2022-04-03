class Solution{
    int middle(int A, int B, int C){
        //code here

    
      if (A < B)
        return (B < C)? B : Math.max(A, C);
      return (A < C)? A : Math.max(B, C);
    }
}
    
