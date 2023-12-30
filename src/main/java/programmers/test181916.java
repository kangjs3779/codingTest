package programmers;

import java.util.*;

public class test181916 {
    public static void main(String[] args) {
//        int a = 2;
//        int b = 2;
//        int c = 2;
//        int d = 2;

//
        int a = 4;
        int b = 1;
        int c = 4;
        int d = 4;

//        int a = 6;
//        int b = 3;
//        int c = 3;
//        int d = 6;

//        int a = 2;
//        int b = 5;
//        int c = 2;
//        int d = 6;

//        int a = 6;
//        int b = 4;
//        int c = 2;
//        int d = 5;


        // 네개의 숫자가 모두 같은 경우 : 4
        // 세개가 같고 한 개가 다른 경우 : 3,1
        // 두개씩 같은 경우 : 2,2
        // 두개가 같고 두개는 다른 경우 :2,1,1
        // 네개가 모두 다른 경우 : 1,1,1,1

        int answer = 0;
        int[] arr = {a, b, c, d};
        Map<Integer, Integer> dice2 = new HashMap<>();

        dice2.put(a, 1);

        for(int i = 1; i < arr.length; i++) {
            if(!dice2.containsKey(arr[i])) {
                dice2.put(arr[i], 1);

            } else {
                dice2.put(arr[i], dice2.get(arr[i]) + 1);
            }
        }

        if(dice2.containsValue(4)) {
            for(int x : dice2.keySet()) {
                answer = 1111 * x;
            }
        } else if(dice2.containsValue(3)) {
            int q = 0;
            int w = 0;

            for(int x : dice2.keySet()) {
                if(dice2.get(x) == 3) {
                    q = x;
                } else {
                    w = x;
                }
            }


            answer = ((10 * q) + w) * ((10 * q) + w);
        } else if(!dice2.containsValue(2)) {
            Set<Integer> keyset = new HashSet<>();
            for(int x : dice2.keySet()) {
                keyset.add(x);
            }
            answer = Collections.min(keyset);
        } else {
            if(dice2.containsValue(1)) {
                List<Integer> list = new ArrayList<>();
                for(int x : dice2.keySet()) {
                    if(dice2.get(x) == 1) {
                        list.add(x);
                    }
                }

                answer = list.get(0) * list.get(1);

            } else {
                List<Integer> list = new ArrayList<>();
                for(int x : dice2.keySet()) {
                    list.add(x);
                }

                answer = (list.get(0) + list.get(1)) * Math.abs(list.get(0) - list.get(1));

            }
        }

        System.out.println(answer);

    }
}
