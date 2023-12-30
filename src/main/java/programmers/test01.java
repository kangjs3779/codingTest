package programmers;

import java.util.*;

public class test01 {
    public static void main(String[] args) {
        Set<Integer[]> test = new HashSet<>();
        test.add(new Integer[]{1,2});
        test.add(new Integer[]{1,2});
        System.out.println("test4 : " + test.size());

        Set<Integer> test2 = new HashSet<>();
        test2.add(1);

        Set<String> test3 = new HashSet<>();
        test3.add("1");
        test3.add("1");
        System.out.println("test3 : " + test3.size());

        List<Integer[]> test4 = new ArrayList<>();
        test4.add(new Integer[]{1,2});
        test4.add(new Integer[]{1,2});

        System.out.println("test4 : " + test4.size());


//        Integer[][] dots = new Integer[][]{{1, 4}, {9, 2}, {3, 8}, {11, 6}};
        Integer[][] dots = new Integer[][]{{3, 5}, {4, 1}, {2, 4}, {5, 10}};
        System.out.println(dots.length);
        System.out.println(dots[0]);

//        Set<List<Integer>> test5 = new HashSet<>();
//        List<Integer> x = new ArrayList<>();
//        List<Integer> y = new ArrayList<>();
//        x.add(1);
//        x.add(2);
//        x.add(1);
//        x.add(2);
//
//        test5.add(x);
//        System.out.println("x : " + x.size());
//
//        System.out.println("test5 : " + test5.size());
//        System.out.println(test5.toString());

        // --------------------------------------------------------------------------------------------------------
        System.out.println("--------------");
        int x = 0;
        int y = 0;
        Set<List<Integer>> chk = new HashSet<>();


        for(int i = 1; i < dots.length; i++) {

            List<Integer> minus = new ArrayList<>();
            x = dots[0][0] > dots[i][0] ? dots[0][0] - dots[i][0] : dots[i][0] - dots[0][0];

            if(i == 1) {
                y = dots[i + 1][1] > dots[i + 2][1] ?  dots[i + 1][1] - dots[i + 2][1] : dots[i + 2][1] - dots[i + 1][1];

            } else if ( i == 2) {
                y = dots[i - 1][1] > dots[i + 1][1] ?  dots[i - 1][1] - dots[i + 1][1] : dots[i + 1][1] - dots[i - 1][1];

            } else if (i == 3) {
                y = dots[i - 2][1] > dots[i - 1][1] ?  dots[i - 2][1] - dots[i - 1][1] : dots[i - 1][1] - dots[i - 2][1];
            }

            minus.add(x);
            minus.add(y);
            chk.add(minus);

//            for(int j = 0; j < dots[i].length; j++) {
//                List<Integer> minus = new ArrayList<>();
//                x = dots[0][j] > dots[i][j] ? dots[0][j] - dots[i][j] : dots[i][j] - dots[0][j];
//
//                if(i == 1) {
//                    y = dots[i + 1][j + 1] > dots[i + 2][j + 1] ?  dots[i + 1][j + 1] - dots[i + 2][j + 1] : dots[i + 2][j + 1] - dots[i + 1][j + 1];
////                    System.out.println("y : " + y);
//
//                } else if ( i == 2) {
//                    y = dots[i - 1][j] > dots[i + 1][j] ?  dots[i - 1][j] - dots[i + 1][j] : dots[i + 1][j] - dots[i - 1][j];
//
//                } else if (i == 3) {
//                    y = dots[i - 2][j] > dots[i - 1][j] ?  dots[i - 2][j] - dots[i - 1][j] : dots[i - 1][j] - dots[i - 2][j];
//                }
////                System.out.println("x : " + x);
////                System.out.println("y : " + y);
//                minus.add(x);
//                minus.add(y);
//                chk.add(minus);
//            }
        }

        System.out.println(chk.size());
        System.out.println(chk.toString());

    }

}
