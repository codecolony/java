
public class LinkedQueueofStrings {

	private Node first = null;
	private Node last = null;
	
	private class Node{
		String item;
		Node next;
	}
	
	public boolean isEmpty(){
		return first==null;
	}
	
	public String dequeue(){
		String item = first.item;
		first = first.next;
		if(isEmpty()) last = null;
		return item;
	}
	
	public void enqueue(String s){
		Node newnode = new Node();
		
		newnode.item = s;
		Node oldLast = last; // take backup of old last
		last = newnode;
		newnode.next = oldLast;
		if(first==null)
			first = last;
		else
			oldLast.next = last;
		
	}
}
