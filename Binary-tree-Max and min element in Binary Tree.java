class Solution{
    public static int findMax(Node root){
        //code here
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int ans = Integer.MIN_VALUE;
        while(q.size() != 0){
            Node temp = q.remove();
            if(temp.data > ans) ans = temp.data;
            if(temp.left != null) q.add(temp.left);
            if(temp.right != null) q.add(temp.right);
        }
        return ans;
        
    }
    public static int findMin(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int ans = Integer.MAX_VALUE;
        while(q.size() != 0){
            Node temp = q.remove();
            if(temp.data < ans) ans = temp.data;
            if(temp.left != null) q.add(temp.left);
            if(temp.right != null) q.add(temp.right);
        }
        return ans;
    }
}
