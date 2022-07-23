class Solution
{
    int atoi(String str) {
	// Your code here
	   int n = str.length();
	   int res = 0;
	   //to apply if the number is negative or positive
	   int sign = 1;
	   int i = 0;
	   
	   //if the number is negative sign will -1.
	   if(str.charAt(0) == '-'){
	        sign = -1;
	        i = 1;
	   }
	   
          for(; i<n; i++){
              int val = Integer.valueOf(str.charAt(i));
              if(val > 57 || val < 48) return -1;
              
              else res = res*10 + (str.charAt(i) - '0');
          }
        
          return sign*res;
    }
}
