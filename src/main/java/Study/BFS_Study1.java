package Study;

import java.util.*;

public class BFS_Study1 {
	static int[][] graph = {{1,2}, {3,4}, {5,6}, {}, {}, {}, {}};
	static boolean[] visited = new boolean[graph.length];
	
	static void bfs(int nodeIndex) {
		Queue<Integer> que = new LinkedList<Integer>();
		
		que.offer(nodeIndex);
		visited[nodeIndex] = true;
		
		while(!que.isEmpty()) {
			int node = que.poll();
			System.out.print(node + " -> ");
			
			for(int i : graph[node]) {
				if(!visited[i]) {
					que.offer(i);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		bfs(0);
	}

}
