public class Solution {
    static int count = 0;
	public static int noOfLeafNodes(BinaryTreeNode<Integer> root) {
    // Write your code here.
         
         return countLeaf(root);
        
         
	}
    
    public static int countLeaf(BinaryTreeNode<Integer> root){
        if(root == null){
            return 0;
        }
        
       
        if(root.left==null && root.right == null) return 1;
        int count = countLeaf(root.right)  + countLeaf(root.left);
        
        return count;
        
        
        
    }
}
