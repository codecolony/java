
public class LinkedStackofStrings {

	private Node first = null;
	
	private class Node{
		String item;
		Node next;
	}
	public boolean isEmpty(){
		return first==null;
	}
	
	public String pop(){
		String item = first.item;
		first = first.next;
		return item;
	}
	
	public void push(String s){
		Node newnode = new Node();
		newnode.item = s;
		newnode.next = first;
		first = newnode;
		
	}
}
