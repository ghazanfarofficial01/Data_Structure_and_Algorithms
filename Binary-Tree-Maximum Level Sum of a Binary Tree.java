class Solution {
    public int maxLevelSum(TreeNode root) {
        if(root == null) {
           return 0;
       }
        
        
       Queue<TreeNode> q = new LinkedList<>();
       q.add(root);
       q.add(null);
        int l = 0;
        int ans = 1;
        int prev_sum = root.val, curr_sum = 0;
        
        while(!q.isEmpty()) {
           TreeNode curr = q.remove();
         if(curr == null) {
             l++;
             if(curr_sum > prev_sum){
                 prev_sum = curr_sum;
                 ans = l;
             }
             
             curr_sum = 0;
             if(q.isEmpty()) {
                   break;
               } else {
                   q.add(null);
               }
         }
            
            else {
               curr_sum += curr.val;
               if(curr.left != null) {
                   q.add(curr.left);
               }
               if(curr.right != null) {
                   q.add(curr.right);
               }
           }

    }
                    return ans;
    }
}
