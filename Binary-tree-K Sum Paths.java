class Solution
{
    
    
    int count = 0;
    public int sumK(Node root,int k)
    {  
       ArrayList<Integer> list = new ArrayList<>();
       sum(root,k,list);
       int ans = count;
       return ans;
       
        
    }
    
    void sum(Node root, int k,ArrayList<Integer> list){
        if( root == null) return;
        
        list.add(root.data);
        
        int sum = 0;
        
        for(int i = list.size()-1;i>=0;i--){
            sum+=list.get(i);
            
            if(sum==k) count++;
        }
        
        
        sum(root.left,k,list);
        sum(root.right, k,list);
        

        
        list.remove(list.size()-1);
    }
}
