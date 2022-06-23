class Solution {
    ListNode findMiddle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    ListNode reverse(ListNode head){
        if(head.next == null) return head;
         ListNode prev = null;
         ListNode cur = head;
         
         while(cur!= null){
             ListNode next = cur.next;
             cur.next = prev;
             prev = cur;
             cur = next;
         }
        return prev;
    }
    
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        ListNode mid = findMiddle(head);
        
        ListNode revHead = reverse(mid.next);
        ListNode start = head;
        while(revHead!=null){
            if(start.val != revHead.val) return false;
            start = start.next;
            revHead = revHead.next;
        }
        return true;
    }
}
