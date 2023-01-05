class Tree{
    public ArrayList<ArrayList<Integer>> Paths(Node root){
        // Code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list = new ArrayList<>();
        path(ans,list,root);
        return ans;
        
    }
    
    public void path(ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> list, Node root){
        if(root == null)return;
        
        list.add(root.data);
        
        if(root.left == null && root.right == null){
           ans.add(new ArrayList<Integer>(list));
        }
        
         path(ans,list,root.left);
         path(ans,list,root.right);
         
         list.remove(list.size() -1);
        
    }
    
}
