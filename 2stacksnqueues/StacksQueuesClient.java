
public class StacksQueuesClient {

	public static void main(String[] args) {
		//LinkedStackofStrings stack = new LinkedStackofStrings();
		//ArrayFixedLenghStackofStrings stack = new ArrayFixedLenghStackofStrings(10);
		//ArrayResizableStackofStrings stack = new ArrayResizableStackofStrings();
		//LinkedQueueofStrings queue = new LinkedQueueofStrings();
		
		//Trying generics
		//LinkedGenericStack<Integer> stack = new LinkedGenericStack<Integer>();
		//ArrayFixedLenghGenericStack<Integer> stack = new ArrayFixedLenghGenericStack<Integer>(10);
		ArrayResizableGenericStack<Integer> stack = new ArrayResizableGenericStack<Integer>();
		
		while(!StdIn.isEmpty())
		{
			String s = StdIn.readString();
			Integer i = new Integer(s);
			if (s.equals("0"))
				StdOut.print(stack.pop());
				//StdOut.print(queue.dequeue());
			else{
				//StdOut.print("Extracted integer: "+ i.toString());
				stack.push(i);
				//queue.enqueue(s);
			}
		}
	}

}
