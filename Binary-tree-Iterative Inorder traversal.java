class Solution
{
    // Return a list containing the inorder traversal of the given tree
    ArrayList<Integer> inOrder(Node root)
    {
       Stack<Node> stack = new Stack<>();
       ArrayList<Integer> list = new ArrayList<>();
       
       Node cur = root;
       
       while(!stack.isEmpty() || cur != null){
           
           if(cur != null){
               stack.push(cur);
               cur = cur.left;
           }
           
           else{
               cur = stack.pop();
               list.add(cur.data);
               cur = cur.right;
           }
       }
       return list;
    }
    
