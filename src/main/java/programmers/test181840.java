package programmers;

import java.util.*;

public class test181840 {
    public static void main(String[] args) {
        int[] num_list = {1, 2, 3, 4, 5};
        int n = 3;
//        int n = 20;

        int answer = Arrays.binarySearch(num_list, n) > 0 ? 1 : 0;

        System.out.println(answer);

    }
}
