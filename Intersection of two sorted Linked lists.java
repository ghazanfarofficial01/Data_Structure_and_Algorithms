//Time Complexity: O(m+n)
//Auxiliary Space: O(min(m, n)). 
class Sol
{
    static Node createLL(int data,Node head){
        Node newNode = new Node(data);
        
        if(head==null){
            head = newNode;
        }
        
        else{
          Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        
        return head;
        }
        
        public static Node findIntersection(Node head1, Node head2)
    {   Node ansHead = null;
        
        Node t1 = head1;
        Node t2 = head2;
        
        while(t1!=null && t2!=null){
            if(t1.data > t2.data) t2 = t2.next;
             
            else if(t1.data < t2.data) t1 = t1.next;
             
            else{
              ansHead = createLL(t1.data,ansHead);
              t2 = t2.next;
              t1 = t1.next;
            }
            
        }
        return ansHead;
    }  
  
  //------------------------------------------------------------------------------------------------------------------------------------//
  //Time-Complexity - O(m+n)
  //Space-Complexity -O(m+n)
  public static Node findIntersection(Node head1, Node head2)
    {    
        Node ansHead = null;
        HashMap<Integer,Integer> list = new HashMap<>();
        
        
        Node temp = head1;
        while(temp!= null){
            if(list.containsKey(temp.data)){
                list.put(temp.data, list.get(temp.data) + 1);
            }
          else list.put(temp.data,0);
            temp = temp.next;
        }
        
        
        temp = head2;
        while(temp != null){
            if(list.containsKey(temp.data) && (list.get(temp.data) >=0)){
                ansHead = createLL(temp.data,ansHead);
                list.put(temp.data, list.get(temp.data) - 1);
            }
            temp = temp.next;
        }
        
        return ansHead;
    }
  //function to create resultant linked list
   static Node createLL(int data,Node head){
        Node newNode = new Node(data);
        
        if(head==null){
            head = newNode;
        }
        
        else{
          Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
}
  
  
