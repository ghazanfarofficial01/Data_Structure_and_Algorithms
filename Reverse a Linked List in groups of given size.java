//recursive approach
// Time Complexity: O(n). 
// Traversal of list is done only once and it has ‘n’ elements.
// Auxiliary Space: O(n/k). 
// For each Linked List of size n, n/k or (n/k)+1 calls will be made during the recursion.
class Solution
{
    public static Node reverse(Node head, int k)
    {
        //Your code here
        if(head == null || head.next == null) return head;
        
        Node prev = null;
        Node curr = head;
        Node next = null;
        int i = 0;
        while(i<k && curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            i++;
        }

     if(next != null){
         head.next = reverse(curr,k);
     }
       return prev;
    }
}

// Time Complexity: O(N) : While loop takes O(N/K) time and inner for loop takes O(K) time. So N/K * K = N. Therefore TC O(N)

// Space Complexity: O(1) : No extra space is used.

class Solution
{
    public static Node reverse(Node head, int k)
    {
      if(head == null || head.next == null) return head;
        Node dummy = new Node(-1);
        dummy.next = head;
        
        Node prev = dummy;
        Node curr =  dummy;
        Node next = dummy;
        
        //calculating size of linked list\
        int size = 0;
        while(curr != null){
            size++;
            curr = curr.next;
        }
        
        while(next!= null){
            curr = prev.next;
            next = curr.next;
            
            int loop_till = (size>k)?k:size-1;
            
            for(int i = 1; i<loop_till;i++){
                curr.next = next.next;
                next.next = prev.next;
                prev.next = next;
                next = curr.next;
                
            }
            prev = curr;
            size -= k;
        }
        return dummy.next;
    }
}
