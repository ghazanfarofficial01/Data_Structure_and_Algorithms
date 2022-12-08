class Solution
{   
    //function to traverse left part
    void traverseLeft(Node root,ArrayList <Integer> list){
        if(root == null || root.left == null && root.right == null) return;
        
        list.add(root.data);
        
        if(root.left != null) traverseLeft(root.left,list);
        else traverseLeft(root.right,list);
    }
    
    //funcion to traverse leaf nodes
    void traverseLeaf(Node root,ArrayList <Integer> list){
        if(root == null ) return;
        
        if(root.left == null && root.right == null) list.add(root.data);
        
         traverseLeaf(root.left,list);
         traverseLeaf(root.right,list);
        
    }
    
    //function to traverse right boundry 
    void traverseRight(Node root,ArrayList <Integer> list){
         if(root == null || root.left == null && root.right == null) return;
         
         if(root.right != null){
             traverseRight(root.right,list);
         }
         else traverseRight(root.left,list);
         
         list.add(root.data);
         
    }
    
	ArrayList <Integer> boundary(Node root)
	{
	    ArrayList<Integer> list = new ArrayList<>();
	    list.add(root.data);
	    
	    //traverse and left part to the list
	      traverseLeft(root.left,list);
	      
	    //traversing and adding leaf nodes to list
	      traverseLeaf(root.left,list);
	      traverseLeaf(root.right,list);
	      
	    //traversing and adding right boundry to the list
	      traverseRight(root.right,list);
	      
	      return list;
	}
}
