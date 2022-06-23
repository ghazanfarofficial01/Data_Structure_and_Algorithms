class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null) return null;
        int size = 0;
        ListNode temp = head;
        
        //get the size of the list
        while(temp != null){
            size++;
            temp = temp.next;
        }
        //if first node is to be deleted
        if(n==size) return head.next;
        
        //traverse cur pointer to the node to be deleted and
        // prev to one node befor cur node
        int i = 0;
        ListNode prev = null;
        ListNode cur = head;
        while(i<size-n){
            prev = cur;
            cur= cur.next;
            i++;
        }
        
        prev.next = cur.next;
        return head;
    }
}
