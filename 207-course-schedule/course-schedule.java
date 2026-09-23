class Solution {
    public class TopologicalSortUsingKhansAlgorithm {
	int[] indegree;
	boolean[] visited;
	public TopologicalSortUsingKhansAlgorithm(int vertices) {
		visited = new boolean[vertices];
		indegree = new int[vertices];
	}

	
	public boolean topoligicalSort(int[][] edges) {
        int count =0;
		Queue<Integer> queue = new LinkedList<>();
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
			count++;
			for(int neighbour:graph[current]) {
			       indegree[neighbour]--;	
			       if(indegree[neighbour] == 0) {
			    	       queue.add(neighbour);
			       }
			}
			
		}
		if(count == indegree.length){
            return true;
        }
		return false;
	}
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
    TopologicalSortUsingKhansAlgorithm tsort = new TopologicalSortUsingKhansAlgorithm(numCourses);
    return tsort.topoligicalSort(prerequisites);    
    }
}