
class Solution
{
    public static Node reverse(Node head){
        Node prev = null;
        Node current = head;
        
        while(current != null){
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        
        return prev;
        
    }
    
    public static Node addOne(Node head) 
    { 
        //code here
   head = reverse(head);
        
    Node temp = head;
    
     temp.data += 1;
     
    while(temp.data% 10 == 0 && temp.next != null){
        temp.data = 0;
        temp = temp.next;
        temp.data +=1;
    }
    
    head =  reverse(head);  
       return head; 
    }
}
