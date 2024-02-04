package programmers;

import java.util.*;

public class test12906 {
    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < arr.length; i++) {
            if(i == 0) {
                list.add(arr[i]);
            } else {
                if(arr[i - 1] != arr[i]) {
                    list.add(arr[i]);
                }
            }
        }

        int[] answer = new int[list.size()];
        int i = 0;
        Iterator it = list.iterator();

        while(it.hasNext()) {
            answer[i] = (int) it.next();
            i++;
        }
    }
}
