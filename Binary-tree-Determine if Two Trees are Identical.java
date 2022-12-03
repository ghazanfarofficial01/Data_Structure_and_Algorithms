class Solution
{
    //Function to check if two trees are identical.
	boolean isIdentical(Node root1, Node root2)
	{
	    // Code Here
	    if(root2 == null && root1 == null)return true;
	    if(root2 == null && root1 != null ) return false;
	    if(root2 != null && root1 == null ) return false;
	    
	    boolean left = isIdentical(root1.left,root2.left);
	    boolean right = isIdentical(root1.right,root2.right);
	    boolean val = (root1.data == root2.data);
	    
	    if(left && right && val) return true;
	    else return false;
	}
	
}
