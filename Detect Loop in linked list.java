class Solution {
    //Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head){
        // Add code here
        
        Node slow = head;
        Node fast = head;
        
        while(fast.next != null && fast.next.next!=null){
            
            fast = fast.next.next;
            // if(fast.next != null){
            //     fast = fast.next;
            // }
            slow = slow.next;
            
            if(fast == slow) return true;
        }
        return false;
    }
}
