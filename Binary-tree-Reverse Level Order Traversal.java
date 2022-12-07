class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
       ArrayList<Integer> list = new ArrayList<>();
         
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        
        while(!q.isEmpty()){
            Node cur = q.remove();
            
            list.add(cur.data);
            if(cur.right != null) q.add(cur.right);
            if(cur.left != null) q.add(cur.left);
            
        }
       Collections.reverse(list);
       return list;
    }
}      
