class GfG
{    
    //function to get tail.
    public static Node getTail(Node head){
        Node tail = head;
        while(tail.next != null) tail = tail.next;
        return tail;
    }
    //swap fuction
    public static void swap(Node a, Node b){
        int t = a.data;
        a.data = b.data;
        b.data = t;
    }
    
    //partion fuction
    public static Node partition(Node start, Node end){
        Node pivot = start;
        Node prev = start;
        Node curr = start.next;
        
        while(curr != end.next){
            if(pivot.data > curr.data){
                swap(prev.next, curr);
                prev = prev.next;
            }
            curr = curr.next;
        }
        swap(pivot,prev);
        return prev;
    }
    //recursive function to perform quicksort
     public static void quick_sort(Node head, Node tail){
         if(head == null || tail == null || head == tail) return;
         
        Node pivot = partition(head,tail);
        
         quick_sort(head,pivot);
         quick_sort(pivot.next,tail);
         
     }
     
     
     
    public static Node quickSort(Node node)
    {
        if(node == null || node.next == null) return node;
        
        Node tail = getTail(node);
        Node head = node;
        quick_sort(head,tail);
        return node;
    }
    
    
}
