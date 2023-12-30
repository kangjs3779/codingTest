package programmers;

import java.util.*;

public class test02 {
    public static void main(String[] args) {
        Integer[][] dots = new Integer[][]{{1, 4}, {9, 2}, {3, 8}, {11, 6}};
//        Integer[][] dots = new Integer[][]{{3, 5}, {4, 1}, {2, 4}, {5, 10}};
        int answer = 0;

        double grade1 = 0;
        double grade2 = 0;


        Set<List<Double>> chk = new HashSet<>();

//        for ( int i = 1; i < dots.length; i++) {
//            List<Double> minus1 = new ArrayList<>();
//            List<Double> minus2 = new ArrayList<>();
//                switch (i) {
//                    case 1 :
//                        x1 = dots[0][0] > dots[i][0] ? dots[0][0] - dots[i][0] : dots[i][0] - dots[0][0];
//                        y1 = dots[0][1] > dots[i][1] ? dots[0][1] - dots[i][1] : dots[i][1] - dots[0][1];
//                        grade1 = (double)(x1 / y1);
//
//
//                        x2 = dots[2][0] > dots[3][0] ? dots[2][0] - dots[3][0] : dots[3][0] - dots[2][0];
//                        y2 = dots[2][1] > dots[3][1] ? dots[2][1] - dots[3][1] : dots[3][1] - dots[2][1];
//                        grade2 = (double)(x2 / y2);
//
//                        minus1.add(grade1);
//                        minus2.add(grade2);
//
//                        chk.add(minus1);
//                        chk.add(minus2);
//
//                        break;
//                    case 2 :
//                        x1 = dots[0][0] > dots[i][0] ? dots[0][0] - dots[i][0] : dots[i][0] - dots[0][0];
//                        y1 = dots[0][1] > dots[i][1] ? dots[0][1] - dots[i][1] : dots[i][1] - dots[0][1];
//                        grade1 = (double)(x1 / y1);
//
//                        x2 = dots[1][0] > dots[3][0] ? dots[1][0] - dots[3][0] : dots[3][0] - dots[1][0];
//                        y2 = dots[1][1] > dots[3][1] ? dots[1][1] - dots[3][1] : dots[3][1] - dots[1][1];
//                        grade2 = (double)(x2 / y2);
//
//                        minus1.add(grade1);
//                        minus2.add(grade2);
//
//                        chk.add(minus1);
//                        chk.add(minus2);
//
//                        break;
//                    case 3 :
//                        x1 = dots[0][0] > dots[i][0] ? dots[0][0] - dots[i][0] : dots[i][0] - dots[0][0];
//                        y1 = dots[0][1] > dots[i][1] ? dots[0][1] - dots[i][1] : dots[i][1] - dots[0][1];
//                        grade1 = (double)(x1 / y1);
//
//                        x2 = dots[1][0] > dots[2][0] ? dots[1][0] - dots[2][0] : dots[2][0] - dots[1][0];
//                        y2 = dots[1][1] > dots[2][1] ? dots[1][1] - dots[2][1] : dots[2][1] - dots[1][1];
//                        grade2 = (double)(x2 / y2);
//
//                        minus1.add(grade1);
//                        minus2.add(grade2);
//
//                        chk.add(minus1);
//                        chk.add(minus2);
//
//                        break;
//                }
//
//
//        }
//
//        answer = chk.size() == 4 ? 1 : 0;
//
//        System.out.println(answer);
//        System.out.println(chk.size());

        System.out.println("--------");

        double a = -8;
        double b = 2;
        System.out.println(a + b);
        System.out.println(a / b);
    }
}
