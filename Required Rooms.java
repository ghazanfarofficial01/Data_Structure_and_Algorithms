class Solution{
  
  //helper function to calculate gcd
    static int gcd(int a, int b)
	{
	if (b == 0)
		return a;
		
      
	return gcd(b, a % b);
	}
	
    static int rooms(int N, int M){
        
        int gcd = gcd(N,M);
      
        return (N+M) / gcd;
    }
}
