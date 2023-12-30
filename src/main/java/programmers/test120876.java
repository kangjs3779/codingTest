package programmers;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class test120876 {
    public static void main(String[] args) {
//        int[][] lines = {{0, 1}, {2, 5}, {3, 9}};
//        int[][] lines = {{-1, 1}, {1, 3}, {3, 9}};
//        int[][] lines = {{0, 5}, {3, 9}, {1, 10}};
        int[][] lines = {{-1, 5}, {0, 6}, {-3, 10}};

        int answer = 0;
        int x = 0;
        int y = 0;

        Set<Integer> chk = new HashSet<>();

        for(int i = 1; i < lines.length; i++) {
            switch (i) {
                case 1 :
                    if(lines[0][0] <= lines[i][0] && lines[i][0] < lines[0][1]) {
                        x = lines[i][0];
                        y = lines[i][1] < lines[0][1] ? lines[i][1] : lines[0][1];

                        chk.add(x);
                        chk.add(y);

                    } else if(lines[i][0] <= lines[0][0] && lines[0][0] < lines[i][1] ) {
                        x = lines[0][0];
                        y = lines[i][1] < lines[0][1] ? lines[i][1] : lines[0][1];

                        chk.add(x);
                        chk.add(y);

                    }

                    if(lines[i][0] <= lines[i + 1][0] && lines[i + 1][0] < lines[i][1]) {
                        x = lines[i + 1][0];
                        y = lines[i + 1][1] < lines[i][1] ? lines[i + 1][1] : lines[i][1];

                        chk.add(x);
                        chk.add(y);

                    } else if(lines[i + 1][0] <= lines[i][0] && lines[i][0] < lines[i + 1][1] ) {
                        x = lines[i][0];
                        y = lines[i + 1][1] < lines[i][1] ? lines[i + 1][1] : lines[i][1];

                        chk.add(x);
                        chk.add(y);

                    }
                    break;

                case 2 :
                    if(lines[0][0] <= lines[i][0] && lines[i][0] < lines[0][1]) {
                        x = lines[i][0];
                        y = lines[i][1] < lines[0][1] ? lines[i][1] : lines[0][1];

                        chk.add(x);
                        chk.add(y);

                    } else if(lines[i][0] <= lines[0][0] && lines[0][0] < lines[i][1] ) {
                        x = lines[0][0];
                        y = lines[i][1] < lines[0][1] ? lines[i][1] : lines[0][1];

                        chk.add(x);
                        chk.add(y);

                    }
                    break;
            }
        }

        if(!chk.isEmpty()) {
            answer = Collections.max(chk) - Collections.min(chk);
        }
        System.out.println(chk.toString());
        System.out.println(Collections.min(chk));

        int v = 30;
        int z = -10;
        System.out.println(answer);
//        System.out.println(chk.toString());
//        System.out.println(Collections.max(chk));
//        System.out.println(Collections.min(chk));
    }
}
