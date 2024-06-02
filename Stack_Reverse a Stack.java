class Solution
{   
   // static int el = 0;
    static void reverse(Stack<Integer> s)
    {
       if(s.isEmpty()) return;
       
       int el = s.pop();
       
       reverse(s);
       
       insertAtBottom(s,el);
        
    }
    
    static void insertAtBottom(Stack<Integer> s, int el){
        
        if(s.isEmpty()){
            s.push(el);
            return;
        }
        
        int num = s.pop();
        insertAtBottom(s,el);
        s.push(num);
    }
 
  
    
}
