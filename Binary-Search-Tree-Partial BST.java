public class Solution {
    public static boolean validateBST(BinaryTreeNode<Integer> root) {
        // Write your code here
        return validate(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static boolean validate(BinaryTreeNode<Integer> root,int min,int max){
       if(root == null) return true;

       if(root.data >= min && root.data <= max){
           boolean l = validate(root.left, min,root.data);
           boolean r = validate(root.right,root.data,max);
           return l && r;
       }

       else return false;

    }
}
