

public class FirstClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int N = StdIn.readInt();
		
		//QuickFindUF uf = new QuickFindUF(N);
		//QuickUnionUF uf = new QuickUnionUF(N);
		WeightedQuickUnionUF uf = new WeightedQuickUnionUF(N);
		
		while(!StdIn.isEmpty()){
			
			int p = StdIn.readInt();
			int q = StdIn.readInt();
			if(!uf.connected(p, q)){
				uf.union(p, q);
				StdOut.println("Connected "+p+" and "+q);
			}
			else
				StdOut.println("They are already connected");
		}

	}

}
