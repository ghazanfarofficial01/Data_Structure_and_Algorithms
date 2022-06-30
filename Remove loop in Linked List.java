class Solution
{    
    //function to detect cycle
     public static Node detectLoop(Node head){
        
       Node slow = head;
        Node fast = head;
        
        while(fast.next != null && fast.next.next!=null){
            
            fast = fast.next.next;
            
            slow = slow.next;
            
            if(fast == slow) return slow;
        }
        
        return null;
    }
    
    
    
    
    
    
    //function to detect starting point of cycle
    public static Node detectCycle(Node head) {
        
         Node intersection = detectLoop(head);
            //if no loop is present
        if(intersection == null) return null;
        
            
             Node slow = head;
          while(slow != intersection){
            slow = slow.next;
            intersection = intersection.next;
            
        }
     return slow;    
    }
    
    
    
    
    
    
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
       if(head == null || head.next == null) return;
       
        Node stop = detectCycle(head);
        if(stop == null) return;
        Node temp = stop;
        while(temp.next != stop){
            temp = temp.next;
        }
        temp.next = null;
    }
}
