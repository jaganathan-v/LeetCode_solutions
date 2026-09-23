class Solution {public class TopologicalSortUsingKhansAlgorithm {
	int[] indegree;
	boolean[] visited;
	public TopologicalSortUsingKhansAlgorithm(int vertices) {
		visited = new boolean[vertices];
		indegree = new int[vertices];
	}

	
	public int[] topoligicalSort(int[][] edges) {
        int count =0;
		Queue<Integer> queue = new LinkedList<>();
		ArrayList<Integer> result = new ArrayList<>();
		List<Integer>[] graph = new ArrayList[indegree.length];
		for(int i=0; i<visited.length; i++) {
		    graph[i] = new ArrayList<>();
		}
		for(int[] edge:edges) {
			graph[edge[0]].add(edge[1]);
				indegree[edge[1]]++;
		}
		for(int i=0;i<indegree.length;i++) {
			if(indegree[i] == 0) {
				queue.add(i);
			}
		}
		while(!queue.isEmpty()) {
			int current = queue.poll();
			result.add(current);
            count++;
			for(int neighbour:graph[current]) {
			       indegree[neighbour]--;	
			       if(indegree[neighbour] == 0) {
			    	       queue.add(neighbour);
			       }
			}
			
		}
		int[] arr = new int[result.size()];
        int j = result.size()-1;
        for (int i = 0; i < result.size(); i++) {
        arr[j] = result.get(i);
        j--;
        }
		return arr=(count == indegree.length)?arr:new int[0];
	}
}
    public int[] findOrder(int numCourses, int[][] prerequisites) {
     TopologicalSortUsingKhansAlgorithm tsort = new  TopologicalSortUsingKhansAlgorithm(numCourses);
    return tsort.topoligicalSort(prerequisites);  
    }
}