
public class QuickFindUF {

	private int id[];
	
	public QuickFindUF(int N){
		id = new int[N];
		for(int i=0; i<N; i++)
			id[i] = i;
	}
	
	public boolean connected(int x, int y){
		return id[x]==id[y];
	}
	
	public void union(int x, int y){
		int p = id[x];
		int q = id[y];
		
		for(int i=0; i<id.length; i++)
			if(id[i]==p) id[i] = q;
	}
}
