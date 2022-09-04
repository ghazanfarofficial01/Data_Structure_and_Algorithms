class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here 
        Stack<Character> stack = new Stack<>();
        
        for(char el: x.toCharArray()){
            if(el == '[' || el == '{' || el == '(')
               stack.push(el);
               
             else{
                 if(stack.isEmpty()) return false;
                 
                 else{
                     char P = stack.pop();
                     if(P == '[' && el== ']') continue;
                     else if(P == '{' && el== '}') continue;
                     else if(P == '(' && el== ')') continue;
                     else return false;
                 }
             }  
        }
        return stack.isEmpty();
    }
}
