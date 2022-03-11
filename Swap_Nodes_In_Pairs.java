//Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem 
//without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)

 class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        
        while(prev.next != null && prev.next.next != null){
          ListNode current = prev.next;
          ListNode forward = current.next;
          ListNode temp = forward.next;
            
           prev.next = forward;
           forward.next = current;
           current.next = temp;
            
           prev = current; 
         }
        return dummy.next;
    }
}
