class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node node) 
    {    
        ArrayList<Integer> list = new ArrayList<>();
         
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        
        while(!q.isEmpty()){
            Node cur = q.remove();
            
            list.add(cur.data);
            
            if(cur.left != null) q.add(cur.left);
            if(cur.right != null) q.add(cur.right);
        }
        return list;
    }
}
