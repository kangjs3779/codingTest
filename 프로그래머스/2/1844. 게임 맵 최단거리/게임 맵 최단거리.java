import java.util.*;
class Solution {
    public int solution(int[][] maps) {
        // 갈 수 있는 방향 
    	int[][] d = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        
    	// 답 기본값 
        int answer = -1;
        
        Queue<int[]> queue = new LinkedList<>();
        // 방문 했음을 표시 
        maps[0][0] = 2;
        // 현재 위치와 거리 
        queue.add(new int[]{0, 0, 1});

        while(!queue.isEmpty()) {
            int[] coord = queue.poll();
            
            // coord[0] = 세로 길이, coord[1] = 가로 길이 
            // (세로, 가로)가 되면 목적지 도착한 것이므로 return 
            if(coord[0] == maps.length - 1 && coord[1] == maps[0].length - 1) {
                answer = coord[2];
                break;
            }
            
            // 목적지 도착하지 않았으면 반복문 실행 
            for(int i = 0; i < d.length; i++) {
                int x = coord[0] + d[i][0], y = coord[1] + d[i][1];
                if((0 <= x && x < maps.length) && (0 <= y && y < maps[0].length) && maps[x][y] == 1) {
                	// 1일때만 움직일 수 있음 
                	
                    maps[x][y] = 2;
                    // 방문 했음을 표시함 -> 2로 변경 
                    queue.add(new int[]{x, y, coord[2] + 1});
                    // 현재의 위치와, 거리를 더해줌 
                }
            }
        }

        return answer;
    }
}