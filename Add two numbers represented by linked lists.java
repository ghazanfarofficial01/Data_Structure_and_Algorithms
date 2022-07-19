class Solution{
    //Function to add two numbers represented by linked list.
    static Node createLL(Node head, int data){
        Node temp = new Node(data);
        if(head == null){
            head = temp;
            
            
        }
        else{
           Node tail = head;
           while(tail.next != null) tail = tail.next;
           tail.next = temp;
           
        }
         return head;
    }
    
    static Node add(Node first,Node second){
        Node head = null;
        
        int carry = 0;
        while(first != null || second != null || carry != 0){
             int val1 = 0;
            if(first != null) val1= first.data;
            
             int val2 = 0;
            if(second != null) val2 = second.data;
            
           int sum = val1 + val2 + carry;
           int digit = sum%10;
           
           head = createLL(head,digit);
           
           carry = sum/10;
           
           if(first != null) first = first.next;
           if(second != null) second = second.next;
        }
        
        return head;
    }
    
    static Node reverse(Node head){
        if(head == null || head.next == null) return head;
        
        Node prev = null;
        Node curr = head;
        
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    
    
    static Node addTwoLists(Node first, Node second){
        // code here
        first = reverse(first);
        second = reverse(second);
        
        Node ans = add(first,second);
        
        ans = reverse(ans);
        // return head of sum list
        return ans;
    }
}
