class Solution {
    
    public String reverse(String S){
         //code here
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < S.length(); i++){
            stack.push(S.charAt(i));
        }
        
        
    String ans = "";
        for(int i = 0; i<S.length(); i++){
          ans += stack.pop();
        }
        
        return ans;
    }

}
