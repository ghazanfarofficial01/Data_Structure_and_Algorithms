class Solution
{
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root)
    {
        Queue<Pair> q = new ArrayDeque<>();
        Map<Integer,Integer> map = new TreeMap<>();
        
        q.add(new Pair(0,root));
        
        while(!q.isEmpty()){
            Pair curr = q.poll();
            
            if(!map.containsKey(curr.hd)){
                map.put(curr.hd,curr.node.data);
            }
            
            if(curr.node.left != null) q.add(new Pair(curr.hd-1,curr.node.left));
            if(curr.node.right != null) q.add(new Pair(curr.hd+1,curr.node.right));
            
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(Map.Entry<Integer,Integer> entry: map.entrySet())
            list.add(entry.getValue());
            
        return list;    
        
    }
    
    static class Pair{
        int hd;
        Node node;
        Pair(int hd, Node node){
            this.hd = hd;
            this.node = node;
        }
    }
}
