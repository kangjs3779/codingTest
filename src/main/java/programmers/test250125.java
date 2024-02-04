package programmers;

import java.util.*;

public class test250125 {
    public static void main(String[] args) {
        String[][] board = {{"blue", "red", "orange", "red"},
                            {"red", "red", "blue", "orange"},
                            {"blue", "orange", "red", "red"},
                            {"orange", "orange", "red", "blue"}};
        int h = 1;
        int w = 1;

//        String[][] board = {{"yellow", "green", "blue"},
//                            {"blue", "green", "yellow"},
//                            {"yellow", "blue", "blue"}};
//        int h = 2;
//        int w = 2;

        // 2,2
        // 2,1  1,2

        List<Boolean> result = new ArrayList<>();
        int answer = 0;

        if(h > 0) {
            boolean a = board[h - 1][w] == board[h][w];
            result.add(a);
        }

        if(h < board.length - 1) {
            boolean b = board[h + 1][w] == board[h][w];
            result.add(b);
        }

        if(w > 0) {
            boolean c = board[h][w - 1] == board[h][w];
            result.add(c);
        }

        if(w < board.length - 1) {
            boolean d = board[h][w + 1] == board[h][w];
            result.add(d);
        }


        for(int i = 0; i < result.size(); i++) {
            if(result.get(i)) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}
