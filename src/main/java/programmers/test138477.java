package programmers;

import java.util.*;

public class test138477 {
    public static void main(String[] args) {
        int k = 3;
        int[] score = {10, 100, 20, 150, 1, 100, 200};
        int[] answer = new int[score.length];

        int[] winner = new int[k];

        for(int i = 0; i < score.length; i++) {
            if(i < k) {
                winner[i] = score[i];
                Arrays.sort(winner);
                
            } else {

            }
        }

        int[] test = new int[3];
        test[1] = 10;
        test[0] = 100;
        Arrays.sort(test);
        Arrays.stream(test).forEach(e -> System.out.println(e));



    }
}
