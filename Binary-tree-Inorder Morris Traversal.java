class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        Node cur = root;
        while(cur != null){
            
            if(cur.left == null){
                list.add(cur.data);
                cur = cur.right;
            }
            
            else{
                Node prev = cur.left;
                while(prev.right != null && prev.right != cur){
                    prev = prev.right;
                }
                
                if(prev.right == null){
                    prev.right = cur;
                    cur = cur.left;
                }
                
                else{
                    prev.right = null;
                    list.add(cur.data);
                    cur = cur.right;
                }
            }
        }
        return list;
    }
}
