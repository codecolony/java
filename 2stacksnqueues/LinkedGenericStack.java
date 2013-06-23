
public class LinkedGenericStack<Item> {

	private Node first = null;
	
	private class Node{
		Item item;
		Node next;
	}
	public boolean isEmpty(){
		return first==null;
	}
	
	public Item pop(){
		Item item = first.item;
		first = first.next;
		return item;
	}
	
	public void push(Item s){
		Node newnode = new Node();
		newnode.item = s;
		newnode.next = first;
		first = newnode;
		
	}
}
