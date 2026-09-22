class Solution {
    public class Uniounandfind {
	int[] parent;
	public Uniounandfind(int size) {
		parent = new int[size];
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
    public  int province() {
		int count =0;
		for(int i=0;i<parent.length;i++) {
			if(parent[i] == i) {
				count++;
			}
		}
		return count;
	}
	public void build(int[][] nums) {
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i][j] == 1) {
					int parent1 =  find(i);
					int parent2 = find(j);
					if(parent1 != parent2) {
						unioun(parent1 , parent2);
					}
				}
			}
		}
	}
    }
    public int findCircleNum(int[][] isConnected) {
     Uniounandfind uf = new Uniounandfind(isConnected.length);
	 uf.build(isConnected);
     return uf.province();    
    }

}