
class Solution
{
    //This method returns the head of the LL after deleting node with value d.
    public static Node deleteNode(Node head,int d)
    {
        //Add your code here.
        Node temp = head.next;
        Node prev = head;
        while( temp.data != d){
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
        
        return head;
    }
    //This method returns the head node of the reversed Linked list.
    public static Node reverse(Node head)
    {
        //Add your code here
        
        Node prev = head;
        Node curr = head.next;
        while(curr != head){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
         head.next = prev;
        return prev;
    }
}
