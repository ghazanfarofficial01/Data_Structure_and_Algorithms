class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null){
            return null;
        }
        
        ListNode prev = null;
        ListNode current = head;
        while(left > 1){
            prev = current;
            current = current.next;
            left--;
            right--;
        }
        
        ListNode connection = prev;
        ListNode tail = current;
        while(right > 0){
            ListNode next_node = current.next;
            current.next = prev;
            prev = current;
            current = next_node;
            right--;
        }
        if(connection != null){
            connection.next = prev;
        }
        else{
            head = prev;
        }
        tail.next = current;
        return head;
        
    }
}
