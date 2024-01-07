package programmers;

import java.util.*;

public class test77884 {
    public static void main(String[] args) {
        int left = 24;
        int right = 27;

        int answer = 0;

        for(int i = left; i <= right; i++) {
            Set<Integer> arr = new HashSet<>();

            for(int j = 1; j <= i; j++) {
                if((i % j) == 0) {
                    arr.add(j);
                }
            }

            if((arr.size() % 2) == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }

        System.out.println(answer);






    }
}
