class Solution
{    
    static Node getMid(Node head){
        Node slow = head;
        Node fast = head;
        
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    
    
    
    //function to merge two list
     static Node merge(Node left, Node right){
         if(left == null) return right;
         if(right == null) return left;
         
         Node dummy = new Node(-1);
         
         Node temp = dummy;
         
         while(left != null && right != null){
             if(left.data < right.data){
                 temp.next = left;
                 temp = left;
                 left = left.next;
             }
             
             else{
                 temp.next = right;
                 temp = right;
                 right = right.next;
             }
         }
         while(left!=null){
              temp.next = left;
                 temp = left;
                 left = left.next;
         }
         
         while(right != null){
              temp.next = right;
              temp = right;
               right = right.next;
         }
         
         dummy = dummy.next;
         return dummy;
     }
     
     
     
     
     
    //Function to sort the given linked list using Merge Sort.
    static Node mergeSort(Node head)
    {
        // add your code here
        if(head == null || head.next == null){
            return head;
        }
        Node mid = getMid(head);
        
        Node left = head;
        Node right = mid.next;
        mid.next = null;
        
        left = mergeSort(left);
        right = mergeSort(right);
        
        Node result = merge(left,right);
        return result;
    }
}
