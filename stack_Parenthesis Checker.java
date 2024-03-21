class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        Stack<Character> s = new Stack<>();
        
        int n = x.length();
        
        for(int i = 0; i<n; i++){
            if(x.charAt(i) == '{' || x.charAt(i) == '(' || x.charAt(i) == '[' ){
                s.push(x.charAt(i));
            }
            
            else{
                if(s.isEmpty()) return false;
                
                Character t = s.pop();
                
                if(x.charAt(i) == ']' && t != '[' ) 
                    return false;
                    
                if(x.charAt(i) == '}' && t != '{' ){
                   // System.out.println(t + " " + x.charAt(i));
                     return false;    
                } 
                   
                    
                if(x.charAt(i) == ')' && t != '(' ) 
                    return false;    
            }
        }
       // [({[([{  }])]})}
       
        if(!s.isEmpty()) return false;
        else return true;
    }
}
