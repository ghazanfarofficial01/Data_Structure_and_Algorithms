//my solution

class Solution{
     static boolean check(String s, int a, int b){
            int low = a, high = b;
            while(low<high){
                 if(s.charAt(low) != s.charAt(high)) return false;
                 low++;
                 high--;
            }
            return true;
        }
  
    String longestPalindrome(String S){
        
       
        int n = S.length();
        int a_s  = 0;
        int a_l  = 1;
        int ans= 1;
        for(int i = 0; i<n;i++){
            int l = i, h = n-1;
            int last = n-1;
            while(l<h){
                if(S.charAt(l) != S.charAt(h)){
                    l = i;
                    
                    last--;
                    h = last;
                }
                
                else{
                    l++;
                    h--;
                }
            }
            if(check(S,i,last)){
                if((last-i) +1  > ans){
                    a_s = i;
                    a_l = last+1;
                    ans = (last - i) +1;
                    
                }
            }
        }
    return S.substring(a_s,a_l);
    }
}

//***************************************************************************************************
//dp solution
class Solution{
    String longestPalindrome(String S){
        int n = S.length();
        int len = 0, start = 0,end = 1;
        boolean dp[][] = new boolean[n][n];
        
        for(int g = 0; g<n; g++){
            
            for(int i = 0, j=g; j<n; i++, j++){
                
                if(g == 0) dp[i][j] = true;
                
                else if(g == 1){
                    if(S.charAt(i) == S.charAt(j)) dp[i][j] = true;
                    else dp[i][j] = false;
                }
                
                else{
                    if(S.charAt(i) == S.charAt(j) && dp[i+1][j-1]) dp[i][j] = true;
                    else dp[i][j] = false;
                }
                
                if(dp[i][j] && g+1 > len){
                
                    len = g+1;
                    end = j;
                    start = i;
                }
            }
        }
        return S.substring(start, end+1);
    }
}
