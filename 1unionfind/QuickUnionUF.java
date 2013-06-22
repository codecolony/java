
public class QuickUnionUF {
	
	private int id[];
	
	public QuickUnionUF(int N)
	{
		id = new int[N];
		for(int i=0; i<N; i++)
		{
			id[i] = i;
		}
	}
	
	private int root(int i)
	{
		while(i!=id[i]) i = id[i];
		return i;
	}
	
	public boolean connected(int x, int y)
	{
		return root(x) == root(y);
	}
	
	public void union(int x, int y){
		
		int rootx = root(x);
		int rooty = root(y);
		
		id[rootx] = rooty;
		
	}

}
