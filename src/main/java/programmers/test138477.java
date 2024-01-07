package programmers;

import java.util.*;

public class test138477 {
    public static void main(String[] args) {
        int k = 3;
        int[] score = {10, 100, 20, 150, 1, 100, 200};
        int[] answer = new int[score.length];

        Integer[] winner = new Integer[k];

        for(int i = 0; i < k; i++) {
            winner[i] = score[i];

            if(i == 0) {
                answer[i] = winner[i];
            } else {
                Arrays.sort(winner);

            }
        }

        Arrays.sort(winner, Comparator.reverseOrder());




    }
}
