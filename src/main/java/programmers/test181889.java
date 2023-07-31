package programmers;


import java.util.Arrays;

public class test181889 {
    public static void main(String[] args) {
        int[] num_list = {5, 2, 1, 7, 5};
        int n = 3;
        int[] result = {5, 2, 1};

        int[] answer = new int[n];
        for(int i = 0; i < n; i++) {
            answer[i] = num_list[i];
        }

        int[] other = Arrays.copyOfRange(num_list,0,n);
        System.out.println(Arrays.toString(other));
    }
}
