//my approach
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs[0].length() == 0) return "";
        int n = strs.length;
        int k = 0;
        String ans = "";
        for(int i = 0; i<strs[0].length(); i++){
           char word = strs[0].charAt(i);
            
            for(int j = 1; j<n; j++){
                if(i>= strs[j].length()) return ans;
                
                if(word != strs[j].charAt(i)) return ans;
            }
               ans += word;
               
          
           }
        return ans;
    }
  }
  
  
  //leetcode solution
  class Solution {
      public String longestCommonPrefix(String[] strs) {
    if (strs.length == 0) return "";
        
    String prefix = strs[0];
        
    for (int i = 1; i < strs.length; i++)
        while (strs[i].indexOf(prefix) != 0) {
            prefix = prefix.substring(0, prefix.length() - 1);
            if (prefix.isEmpty()) return "";
        }        
    return prefix;
}
}
