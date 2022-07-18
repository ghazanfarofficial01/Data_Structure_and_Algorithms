class Solution {
    String removeDups(String S) {
        // code here
      int[] hs = new int[26];
      String ans ="";
      for(int i = 0; i< S.length(); i++){
          int index = S.charAt(i) - 'a';
          hs[index] += 1;
          if(hs[index] > 1) continue;
          else{
              ans += S.charAt(i);
          }
      }
        return ans;
    }
}
