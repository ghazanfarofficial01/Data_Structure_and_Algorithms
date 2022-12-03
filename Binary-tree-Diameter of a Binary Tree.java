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
