
public class ArrayResizableStackofStrings {
	
	private String[] s;
	private int top = 0;

	public ArrayResizableStackofStrings(){
		s = new String[1];
	}
	
	public boolean isEmpty(){
		return top==0;
	}
	
	public void push(String item){
		if (top==s.length)
			resize(2*s.length); //resize the array to twice the current size.
			
		s[top++] = item;
	}
	
	private void resize(int newCapacity){
		String copy[] = new String[newCapacity];
		
		for(int i=0; i<s.length; i++){
			copy[i] = s[i];
		}
		
		s = copy;
	}
	
	public String pop(){
		//return s[--top]; need to remove loitering problem
		
		/*Garbage Collector should know when to clean the obsolete entries*/
		String item = s[--top];
		s[top] = null;
		return item;
	}
}
