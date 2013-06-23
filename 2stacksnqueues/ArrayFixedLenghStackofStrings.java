
public class ArrayFixedLenghStackofStrings {
	
	private String[] s;
	private int top = 0;

	public ArrayFixedLenghStackofStrings(int sizeOfArray){
		s = new String[sizeOfArray];
	}
	
	public boolean isEmpty(){
		return top==0;
	}
	
	public void push(String item){
		s[top++] = item;
	}
	
	public String pop(){
		//return s[--top]; need to remove loitering problem
		
		/*Garbage Collector should know when to clean the obsolete entries*/
		String item = s[--top];
		s[top] = null;
		return item;
	}
}
