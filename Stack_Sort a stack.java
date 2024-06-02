class GfG {
    
    
    public Stack<Integer> sort(Stack<Integer> s) {
        sortStack(s);
        return s;
    }
    
    
    public void sortStack(Stack<Integer> s){
        if(s.isEmpty()) return;
        
        int num = s.pop();
        
        sortStack(s);
        
        sortedInsert(s,num);
    }
    
    public void sortedInsert(Stack<Integer> s,int num){
        if(s.isEmpty() || s.peek() < num){
            s.push(num);
            return;
        }
        
        int el = s.pop();
        
        sortedInsert(s,num);
        
        s.push(el);
    }
    
    
}
