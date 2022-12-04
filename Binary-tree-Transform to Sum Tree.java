class Solution{
    public void toSumTree(Node root){
         util(root);
    }
    
    public int util(Node root){
        if(root == null) return 0;
        
        int val = root.data;
        
        root.data = util(root.left) + util(root.right);
        
        return val + root.data;
    }
}

//-----------------Another Solution-------------------------------------------------------------

class Solution{
    
    public void toSumTree(Node root){
         //add code here.
         util(root);
    }
    
    public int util(Node root){
        
        if(root == null) return 0;
        if(root.left == null && root.right == null){
            int sum = root.data;
            root.data = 0;
            return sum;
        }
        
       
        
        int left = util(root.left);
        int right = util(root.right);
        
         int temp = left + right + root.data;
         root.data = left + right;
        
        return temp;
        
        
    }
}

