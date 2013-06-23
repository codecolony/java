
public class ArrayResizableGenericStack<Item> {
	
	private Item[] s;
	private int top = 0;

	public ArrayResizableGenericStack(){
		s = (Item[]) new Object[1];
	}
	
	public boolean isEmpty(){
		return top==0;
	}
	
	public void push(Item item){
		if (top==s.length)
			resize(2*s.length); //resize the array to twice the current size.
			
		s[top++] = item;
	}
	
	private void resize(int newCapacity){
		Item copy[] = (Item[])new Object[newCapacity];
		
		for(int i=0; i<s.length; i++){
			copy[i] = s[i];
		}
		
		s = copy;
	}
	
	public Item pop(){
		//return s[--top]; need to remove loitering problem
		
		/*Garbage Collector should know when to clean the obsolete entries*/
		Item item = s[--top];
		s[top] = null;
		return item;
	}
}
