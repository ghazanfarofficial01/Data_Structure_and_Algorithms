// runtime 0ms
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //check if list is empty or has only one node
        if(head == null || head.next == null){
            head = null;
            return head;
        }
        //getting length of linked list
       ListNode temp = head;
       int count = 1;
        while(temp.next != null){
            count++;
            temp = temp.next;
        }
        //check,if we have to delete the first node
        if(count - n == 0){
           head = head.next;
            return head;
        }
        //traversing list from the beginning to 1 node before the node to be deleted
        temp = head;
        int i = 1;
        while(i<count-n){
            temp = temp.next;
            i++;
            
        }
        temp.next = temp.next.next;
        return head;
    }
}


//runtime 1 ms

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null){
            head = null; 
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode slow = dummy;
        ListNode fast = dummy;
        
        for(int i = 1; i<= n +1;i++){
            fast = fast.next;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}
