class GFG
{
    
   
    public static Node constructTree(int post[],int n)
    {  
         Node root = null;
        
        for(int i = n-1; i>=0; i--){
            root = construct(root,post[i]);
        }
        
        
        return root;
    }
    
    public static Node construct(Node root,int val){
        if(root == null){
           return new Node(val); 
        }
        
        if(root.data > val){
            root.left = construct(root.left,val);
        }
        
        else{
             root.right = construct(root.right,val);
        }
        
        return root;
    }
    
}
