class Solution
{   
    //Function to return a list of BST elements in a given range.
	public static ArrayList<Integer> printNearNodes(Node root,int low,int high) {
        ArrayList<Integer> list = new ArrayList<>();
         utilFunction(root,low,high,list);
         return list;
    }
    
    public static void utilFunction(Node root,int l, int h, ArrayList<Integer> list){
        if(root == null) return;
        
        if(root.data >= l && root.data <= h){
            
            utilFunction(root.left,l,h,list);
            list.add(root.data);
            utilFunction(root.right,l,h,list);
            
        }
        
        else if(root.data < h){
            utilFunction(root.right,l,h,list);
        }
        
        else{
              utilFunction(root.left,l,h,list);
        }
    }
    
}
