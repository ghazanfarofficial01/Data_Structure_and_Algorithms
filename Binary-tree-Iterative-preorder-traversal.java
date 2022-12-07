class BinaryTree
{
    //Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root)
    {
        ArrayList<Integer> list = new ArrayList<>();
        
        Stack<Node> s = new Stack<>();
        
        s.push(root);
        
        while(!s.isEmpty()){
            Node cur = s.pop();
            list.add(cur.data);
                if(cur.right != null)   
                   s.push(cur.right);
                       
                if(cur.left != null)
                   s.push(cur.left);
                   
                }
        return list;
    }

}
