class Solution {
    public int height(TreeNode root){
        if(root == null) return 0;
        
        int leftHeight = 1+height(root.left);
        int rightHeight = 1+height(root.right);
        
        return Math.max(leftHeight,rightHeight);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        
        int diam1 = diameterOfBinaryTree(root.left);
        int diam2 = diameterOfBinaryTree(root.right);
        int diam3 = height(root.left) + height(root.right);
        
        return Math.max(diam3, Math.max(diam1,diam2));
    }
}


//--------------OPTIMISED---SOLUTION---------------


 class Solution {
    
    class TreeInfo{
        int diam;
        int ht;
        
        TreeInfo(int diam,int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }
    
    TreeInfo calcD(Node root){
        if(root == null) {
         return new TreeInfo(0,0);
            
        }
        
        TreeInfo left = calcD(root.left);
        TreeInfo right = calcD(root.right);
        
        int myHeight = Math.max(left.ht,right.ht) +1;
        
        int opn1 = left.diam;
        int opn2 = right.diam;
        int opn3 = left.ht + right.ht + 1;
        
        int my_diam = Math.max(opn3,Math.max(opn1,opn2));
         
        TreeInfo ans = new TreeInfo(my_diam,myHeight);
        
        
        return ans;
    }
    // Function to return the diameter of a Binary Tree.
    int diameter(Node root) {
     
     TreeInfo res = calcD(root);
     return res.diam;
    }
}
