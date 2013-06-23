
public class StacksQueuesClient {

	public static void main(String[] args) {
		//LinkedStackofStrings stack = new LinkedStackofStrings();
		ArrayFixedLenghStackofStrings stack = new ArrayFixedLenghStackofStrings(10);
		
		while(!StdIn.isEmpty())
		{
			String s = StdIn.readString();
			if (s.equals("-"))
				StdOut.print(stack.pop());
			else
				stack.push(s);
		}
	}

}
