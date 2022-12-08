class Solution{
    //Function to return list containing elements of right view of binary tree.
    ArrayList<Integer> rightView(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        right_view(root,list,0);
        return list;
    }
    
    void right_view(Node root, ArrayList<Integer> list,int l){
        if(root == null) return;
        
        if(list.size() == l) list.add(root.data);
        
        
          right_view(root.right,list,l+1);
          right_view(root.left,list,l+1);
    }
}
