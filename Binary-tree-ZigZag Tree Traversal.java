class GFG
{
    //Function to store the zig zag order traversal of tree in a list.
	ArrayList<Integer> zigZagTraversal(Node root)
	{
	    ArrayList<Integer> list = new ArrayList<>();
	    Queue<Node> q = new LinkedList<>();
	    q.add(root);
	  
	    boolean flag = true;
	    
	    while(!q.isEmpty()){
	        int size = q.size();
	        int arr[] = new int[size];
	        
	        for(int i = 0; i<size; i++){
	            Node curr = q.remove();
	            int index = (flag == true)?i:size-i-1;
	            arr[index] = curr.data;
	            
	            if(curr.left !=null){
	                q.add(curr.left);
	            }
	            
	            if(curr.right != null){
	                q.add(curr.right);
	            }
	        }
	        
	        flag = (flag == true)?false:true;
	        for(int i = 0; i<arr.length; i++){
	            list.add(arr[i]);
	        }
	        
	        }
	        return list;
	    }
	}
