class GfG
{
    boolean isCircular(Node head)
    {
	Node temp = head.next;
	while(temp!= null){
	    if(temp == head) return true;
	    temp = temp.next;
	}
	return false;
    }
}
