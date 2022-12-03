import java.util.* ;
import java.io.*; 
public class Solution {
    public static int minInsertion(String str) {
    	int n = str.length();
        int[][] dp = new int[n][n];
        
        for(int g = 0; g<n; g++){
            
            for(int i = 0, j= g; j<n;j++, i++){
                if(g== 0) dp[i][j] = 1;
                else if(g==1){
                    dp[i][j] = (str.charAt(i) == str.charAt(j))?2:1;
                }
                
                else{
                    if(str.charAt(i) == str.charAt(j)){
                        dp[i][j] = 2+ dp[i+1][j-1];
                    }
                    else dp[i][j] = Math.max(dp[i][j-1],dp[i+1][j]);
                }
            }
        }
        
        return n-dp[0][n-1];
    }
}
