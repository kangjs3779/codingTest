package programmers;

import java.util.*;

public class test12934 {
    public static void main(String[] args) {
        long n = 121;
        long answer = 0;

        List<Long> mini = new ArrayList<>();

        for(long i = 1; i <= n; i++ ) {
            if((n % i) == 0) {
                mini.add(i);
            }
        }

        answer = mini.get((mini.size()/2)) == mini.get((mini.size()/2) - 1) ? (mini.get((mini.size()/2)) + 1) * (mini.get((mini.size()/2)) + 1) : -1;

        System.out.println(answer);
//                1339
//                1248

    }
}
