class Solution
{      
      Node getTail(Node head){
         Node temp = head;
         
         while(temp.next != head){
             temp = temp.next;
             
         }
         return temp;
        }
         
         //Get Middle element
         Node getMid(Node head){
             Node slow = head;
             Node fast = head;
             
             while(fast.next != head && fast.next.next != head){
                 slow = slow.next;
                 fast = fast.next.next;
             }
             return slow;
         }
        // Function  to split a circular LinkedList
	    void splitList(circular_LinkedList list)
        {
             // Your code here
             if(list.head == null || list.head.next == null) return;
             Node mid = getMid(list.head);
             Node tail = getTail(list.head);
             
             tail.next = mid.next;
             list.head2 = mid.next;
             mid.next = list.head;
             list.head1 = list.head;
             
             
	 }
}


