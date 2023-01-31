public class Solution 
{
	public static int kthSmallest(TreeNode<Integer> root, int k) {
        //    Write your code here.
        Stack<TreeNode<Integer> > s = new Stack<TreeNode<Integer>>();

        while(true){

            while(root != null){
              s.add(root);
              root = root.left;
            }
             if(s.size() == 0) return -1;
            root = s.pop();
            k--;
            if(k==0) return root.data;
            root = root.right;
        }

    }
}

//using morris traversal(O(1) space complexity)
public class Solution 
{
	public static int kthSmallest(TreeNode<Integer> root, int k) {
    TreeNode<Integer> cur = root;
        while(cur != null){
            
            if(cur.left == null){
                k--;
                if(k==0) return cur.data;
                cur = cur.right;
            }
            
            else{
                TreeNode<Integer> prev = cur.left;
                while(prev.right != null && prev.right != cur){
                    prev = prev.right;
                }
                
                if(prev.right == null){
                    prev.right = cur;
                    cur = cur.left;
                }
                
                else{
                    prev.right = null;
                    k--;
                    if(k==0) return cur.data;
                    cur = cur.right;
                }
            }
        }
        return -1;
  }
}
