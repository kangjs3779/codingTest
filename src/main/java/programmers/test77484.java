package programmers;

import java.util.Arrays;

public class test77484 {
    public static void main(String[] args) {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};

        int count = 0;
        int zero_count = 0;


        for(int i = 0; i < lottos.length; i++) {
            for(int t = 0; t < win_nums.length; t++) {
                if(lottos[i] == win_nums[t]) {
                    count++;
                    break;
                } else if(lottos[i] == 0) {
                    zero_count++;
                    break;
                }
            }
        }

        int[] answer = {zero_count + count, count};

        for(int i = 0; i < 2; i++) {
            switch (answer[i]) {
                case 6 : answer[i] = 1; break;
                case 5 : answer[i] = 2; break;
                case 4 : answer[i] = 3; break;
                case 3 : answer[i] = 4; break;
                case 2 : answer[i] = 5; break;
                case 1 :
                case 0 : answer[i] = 6; break;

            }
        }

        Arrays.stream(answer).forEach(e -> System.out.println(e));



    }
}
