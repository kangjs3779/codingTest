package programmers;

public class test1844 {


    static int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
    static boolean[] visited = new boolean[maps.length];

    public static void main(String[] args) {
        dfs(0);

    }

    static void dfs(int nodeIndex) {
        visited[nodeIndex] = true;
        System.out.println("방문 : " + nodeIndex );

        for(int node : maps[nodeIndex]) {
            if(node == 1) {
                dfs(node + 1);
            }
        }
    }

}
