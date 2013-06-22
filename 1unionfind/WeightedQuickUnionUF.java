
public class WeightedQuickUnionUF {
	
	private int id[];
	private int sz[];
	
	public WeightedQuickUnionUF(int N)
	{
		id = new int[N];
		sz = new int[N];
		for(int i=0; i<N; i++)
		{
			id[i] = i;
			sz[i] = 1;
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
		if(sz[rootx]<sz[rooty]){
			id[rootx] = rooty;
			sz[rooty] += sz[rootx];
		}
		else{
			id[rooty] = rootx;
			sz[rootx] += sz[rooty];
		}
		//id[rootx] = rooty;
		
	}

}
