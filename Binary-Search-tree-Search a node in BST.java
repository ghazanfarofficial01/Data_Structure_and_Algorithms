class BST {
    // Function to search a node in BST.
    boolean search(Node root, int x) {
       if(root == null) return false;
       
       if(root.data > x){
           return search(root.left,x);
       }
       
       else if(root.data < x){
           return search(root.right,x);
       }
       
      else{
           return true;
      }
       
       
    }
}
