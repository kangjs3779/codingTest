import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        
        int[][] direction = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        
        int answer = -1;
        
        Queue<int[]> queue = new LinkedList<>();
        
        maps[0][0] = 2;
        queue.add(new int[]{0,0,1});
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            
            if(current[0] == maps.length - 1 && current[1] == maps[0].length - 1) {
                answer = current[2];
                break;
            }
            
            for(int i = 0; i < direction.length; i++) {
                int x = current[0] + direction[i][0];
                int y = current[1] + direction[i][1];
                
                if(0 <= x && x < maps.length && 0 <= y && y < maps[0].length && maps[x][y] == 1) {
                    maps[x][y] = 2;
                    queue.add(new int[] {x, y, current[2] + 1});
                    
                }
            }
            
        }
        
        return answer;
    }
}