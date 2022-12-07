class Solution {
    //Function to find the height of a binary tree.
    int height(Node node) 
    {
        if(node == null) return 0;
        
        int leftHeight = 1+height(node.left);
        int rightHeight = 1+height(node.right);
        
        return Math.max(leftHeight,rightHeight);
    }
}
