class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      if(root == null) return new ArrayList<Integer>();
      
      ArrayList<Integer> ans = new ArrayList<>();
      
      left_view(root,ans,0);
      return ans;
    }
    
    void left_view(Node root, ArrayList<Integer> list, int l){
        if(root == null) return;
        
        if(list.size() == l) list.add(root.data);
        left_view(root.left,list,l+1);
        left_view(root.right,list,l+1);
        
    }
}

//-------------------------------------------------------------------------
  //another solution using map
  
  class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {  
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
      Map<Integer,Integer> map = new TreeMap<>();
      //map.put(0,root.data);
      left_View(root,map,0);
      
       //ArrayList<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer,Integer> m:  map.entrySet())
            list.add(m.getValue());
            
        return list; 
      
    }
    
    void left_View(Node root, Map<Integer,Integer> map , int l){
        if(root==null) return;
        
        if(!map.containsKey(l)){
            map.put(l,root.data);
        }
        
        left_View(root.left,map,l+1);
        left_View(root.right,map,l+1);
        
    }
}
