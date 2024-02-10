package Study;

public class DFS_study1 {
	//깊이 우선 탐색 예제
	static int[][] graph = {{}, {2, 3}, {4, 5}, {6,7,8}, {9}, {9}, {10}, {}, {}, {}, {11}, {}};
	
	static boolean[] visited = new boolean[graph.length];
	
	static void dfs(int nodeIndex) {
		visited[nodeIndex] = true;
		
		System.out.print(nodeIndex + " -> ");
		
		for(int node : graph[nodeIndex]) {
			if(!visited[node]) {
				dfs(node);
			}
		}
	}
	
	public static void main(String[] args) {
		dfs(1);
	}
}
