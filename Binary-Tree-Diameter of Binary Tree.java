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
