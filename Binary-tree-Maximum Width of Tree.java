//my solution
class Solution {
    // Function to get the maximum width of a binary tree.
    int getMaxWidth(Node root) {
        // Your code here
        if(root == null) return 0;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int count = 0;
        int ans = 1;
        
        while(!q.isEmpty()){
            Node temp = q.remove();
            
            if(temp == null){
                ans = Math.max(count, ans);
                count = 0;
                if(q.isEmpty()) break;
                else {
                    q.add(null);
                    continue;
                }
            }
            
            
            count++;
            if(temp.left != null) q.add(temp.left);
            if(temp.right != null) q.add(temp.right);
          
            
        }
        
        return ans;
        
    }
}




//-----------------------------------
//-----------------------------------
//from editorial
 class Solution {
    // Function to get the maximum width of a binary tree.
    int getMaxWidth(Node root) {
        // Your code here
        int height = getHeight(root);
        int width = 0;
        int maxwidth = 1;
        
        for(int i = 0; i<=height;i++){
            width = getWidth(root, i);
            maxwidth = Math.max(width,maxwidth);
        }
        return maxwidth;
    }
    
    //function to calculate height
      public int getHeight(Node root){
          if(root == null) return 0;
          
          int leftH = 1+getHeight(root.left);
          int rightH = 1 + getHeight(root.right);
          
          return Math.max(leftH,rightH);
      }
      
    //method to calculate width of a level
    public int getWidth(Node root, int level){
        if(root == null) return 0;
        
        if(level == 1) return 1;
        
        else if(level > 1){
            return getWidth(root.left, level-1) + getWidth(root.right,level-1);
            
            
        }
        
        return 0;
    }
      
      
 }

