package programmers;

import java.util.ArrayList;
import java.util.List;

public class test181927 {
    public static void main(String[] args) {
        int[] num_list = {2, 1, 6};
//        int[] num_list = {5, 2, 1, 7, 5};

        int[] result = new int[num_list.length + 1];

        for(int i = 0; i < num_list.length; i++) {
            result[i] = num_list[i];
        }

        result[num_list.length] = num_list[num_list.length-1] > num_list[num_list.length-2] ? num_list[num_list.length-1] - num_list[num_list.length-2] : num_list[num_list.length-1] * 2;


    }
}
