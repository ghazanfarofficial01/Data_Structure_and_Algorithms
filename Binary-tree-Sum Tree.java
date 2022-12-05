class Solution
{   
    class TreeInfo{
        boolean isBal;
        int val;
        
        TreeInfo(boolean isBal,int val){
            this.isBal = isBal;
            this.val = val;
        }
    }
    
    TreeInfo is_sum(Node root){
        if(root == null) return new TreeInfo(true,0);
        
        if(root.left == null && root.right == null) return new TreeInfo(true,root.data);
        
        TreeInfo left = is_sum(root.left);
        TreeInfo right = is_sum(root.right);
        
        
        boolean eq = (root.data == (left.val + right.val));
        
        if(left.isBal && right.isBal && eq){
            return new TreeInfo(true,2*root.data);
        }
        
        else return new TreeInfo(false,2*root.data);
        
        
    }
	boolean isSumTree(Node root)
	{
             return is_sum(root).isBal;
	}
}





//-----------------Another solution-----------------------------

 class Solution
{   
    boolean flag = true;
	boolean isSumTree(Node root)
	{
             // Your code here
             check(root);
             if(flag) return true;
             else return false;
	}
	
	int check(Node root){
	    if(root == null) return 0;
	    
	    if(root.left == null && root.right == null){
	        return root.data;
	    }
	    
	    int leftSum = check(root.left);
	    int rightSum = check(root.right);
	    
	      if(leftSum + rightSum != root.data){
	          flag = false;
	      }
	      
	      return leftSum + rightSum + root.data;
	}
}
