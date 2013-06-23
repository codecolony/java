
public class ArrayFixedLenghGenericStack<Item> {
	
	private Item[] s;
	private int top = 0;

	public ArrayFixedLenghGenericStack(int sizeOfArray){
		s = (Item[]) new Object[sizeOfArray];
	}
	
	public boolean isEmpty(){
		return top==0;
	}
	
	public void push(Item item){
		s[top++] = item;
	}
	
	public Item pop(){
		//return s[--top]; need to remove loitering problem
		
		/*Garbage Collector should know when to clean the obsolete entries*/
		Item item = s[--top];
		s[top] = null;
		return item;
	}
}
