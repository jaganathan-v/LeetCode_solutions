class Solution {
 class UniounFind{
    
    int[] parent;
	public UniounFind(int size) {
		parent = new int[size+1];
		for(int i=0;i<size;i++) {
			parent[i] = i;
		}
    	}
	public int find(int i) {
		if(parent[i] == i) {
			return i;
		}
		return find(parent[i]);
	}
    public void unioun(int first,int second) {
	     parent[first] = second;
	}
 }
  
    public int[] findRedundantConnection(int[][] edges) {
    UniounFind uf = new UniounFind(edges.length);
    int[] result = new int[2];
       for(int[] n:edges){
        int parent1 = uf.find(n[0]);
        int parent2 = uf.find(n[1]);
        if(parent1 == parent2){
            result[0] = n[0];
            result[1] = n[1];
        }else{
            uf.unioun(parent1,parent2);
        }
       }  
       return result; 
    }
}