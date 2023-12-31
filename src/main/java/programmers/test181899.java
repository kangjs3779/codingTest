package programmers;

import java.util.*;

public class test181899 {
    public static void main(String[] args) {

        int start = 10;
        int end_num = 3;


        List<Integer> list = new ArrayList<>();
        System.out.println(start);

        for(int i = start; i >= end_num; i--) {
            list.add(i);
            System.out.println(i);
            System.out.println(start);
        }



        int[] answer = new int[list.size()];

        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        System.out.println(list);
        System.out.println(answer);

    }
}
