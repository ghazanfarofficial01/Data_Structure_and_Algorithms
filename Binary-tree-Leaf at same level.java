class Solution
{  
    int final_level = 0;
    boolean check(Node root)
    {
	   return util(root,0); 	
    }
    
    boolean util(Node root, int level){
        
        if(root == null) return true;
        
        if(root.left == null && root.right == null){
            
            if(final_level == 0){
                final_level = level;
                return true;
            }
            
            return (final_level == level);
        }
        
        return (util(root.left,level+1) && util(root.right,level +1));
    }
}

//------------------MY-SOLUTION-----------------------------

  class Solution
{
    boolean check(Node root)
    {  
        util(root);
        
	    if(flag)
	     return true;
	    
	    else return false; 
    }
    boolean flag = true;
    int level = 0;
    ArrayList<Integer> list = new ArrayList<>();
    void util(Node root){
        Queue<Node> q = new LinkedList<>();
        
        q.add(root);
        q.add(null);
        
        while(!q.isEmpty()){
            Node cur = q.remove();
            
            if(cur == null){
                level++;
                
                if(q.isEmpty()) break;
                else q.add(null);
                cur = q.remove();
            }
            
            if(cur.left == null && cur.right == null){
                if(list.size()>0 && !list.contains(level)){
                    flag = false;
                    break;
                }
                else list.add(level);
            }
            
            if(cur.left != null) q.add(cur.left);
            if(cur.right != null)q.add(cur.right);
        }
    }
    
    
}
