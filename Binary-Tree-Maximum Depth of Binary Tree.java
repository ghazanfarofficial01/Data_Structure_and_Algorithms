class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        
        int leftHeight = 1+maxDepth(root.left);
        int rightHeight = 1+maxDepth(root.right);
        
        return Math.max(leftHeight,rightHeight);
    }
}
