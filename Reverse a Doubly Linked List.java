public static Node reverseDLL(Node  head)
{
    if(head == null || head.next == null) return head;
    
    Node prev = null;
    Node curr = head;
    
    while(curr != null){
        prev = curr.prev;
        curr.prev = curr.next;
        curr.next = prev;
        
        curr = curr.prev;
    }
    return prev.prev;
}





/*Another solution*/







public static Node getTail(Node head){
    Node temp = head;
    while(temp.next != null){
        temp = temp.next;
    }
    return temp;
}
public static Node reverseDLL(Node  head)
{
    //Your code here
    Node tail = getTail(head);
    Node head2 = tail;
    while(tail != null){
        Node temp = tail.next;
        tail.next = tail.prev;
        tail.prev = temp;
        tail = tail.next;
    }
    return head2;
}
