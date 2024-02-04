package programmers;

import java.util.*;

public class test42748 {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        int[] answer = new int[commands.length];

        for(int i = 0; i < commands.length; i++) {
            int minus = commands[i][0] > commands[i][1] ? commands[i][0] - commands[i][1] + 1 : commands[i][1] - commands[i][0] + 1;
            int[] arr = new int[minus];
            int k = commands[i][0];

            for(int j = 0; j < minus; j++) {
                arr[j] = array[k - 1];
                k++;
            }

            Arrays.sort(arr);

            answer[i] = arr[commands[i][2] - 1];
        }








    }
}
