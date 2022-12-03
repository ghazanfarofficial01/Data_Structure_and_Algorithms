class Tree
{   
     class TreeInfo{
        boolean isBal;
        int ht;
        
        TreeInfo(boolean isBal,int ht){
            this.isBal = isBal;
            this.ht = ht;
        }
    }
    
    TreeInfo is_balance(Node root){
        if(root == null){
            return new TreeInfo(true,0);
        }
        
        TreeInfo left = is_balance(root.left);
        TreeInfo right = is_balance(root.right);
        
        int height = Math.max(left.ht,right.ht) +1;
        
        boolean ans1 = left.isBal;
        boolean ans2 = right.isBal;
        boolean ans3 = (Math.abs(left.ht - right.ht) <=1);
        
        if(ans1 && ans2 && ans3){
            return new TreeInfo(true,height);
        }
        
        else return new TreeInfo(false,height);
        
    }
    
    //Function to check whether a binary tree is balanced or not.
    boolean isBalanced(Node root)
    {
	     TreeInfo res = is_balance(root);
	     return res.isBal;
    }
}
