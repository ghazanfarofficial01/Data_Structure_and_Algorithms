class Solution
{
    //Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) 
    {
        if(head == null || head.next == null) return head;
         //because .contains method in hashet takes O(1) time whereas it takes O(n) time in arrayList
         HashSet<Integer> list = new HashSet<>();
         
        //  ArrayList<Integer> hs = new ArrayList<>();
         
         
         Node p = null;
         Node curr = head;
        
         while(curr!= null){
             if(list.contains(curr.data)){
                  
                  p.next = curr.next;
             }
             
             else{
                 
                 list.add(curr.data);
                 p = curr;
               }
                 curr= curr.next;
                 
     }
        
         return head;
    }
}
