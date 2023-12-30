package programmers;

import java.util.HashSet;
import java.util.Set;

public class test120875 {
    public static void main(String[] args) {
//        Integer[][] dots = new Integer[][]{{1, 4}, {9, 2}, {3, 8}, {11, 6}};
        Integer[][] dots = new Integer[][]{{3, 5}, {4, 1}, {2, 4}, {5, 10}};

        int answer = 0;

        double grade1 = 0;
        double grade2 = 0;

        // (0,1) (2,3)
        // (0,2) (1,3)
        // (0,3) (1,2)

        Set<Integer> chk = new HashSet<>();

        for(int i = 1; i < dots.length; i++) {
            switch (i) {
                case 1 :
                    grade1 = (double)(dots[0][1] - dots[i][1]) / (dots[0][0] - dots[i][0]);
                    grade2 = (double)(dots[2][1] - dots[3][1]) / (dots[2][0] - dots[3][0]);

                    answer = grade1 == grade2 ? 1 : 0;
                    chk.add(answer);
                    break;

                case 2 :
                    grade1 = (double)(dots[0][1] - dots[i][1]) / (dots[0][0] - dots[i][0]);
                    grade2 = (double)(dots[1][1] - dots[3][1]) / (dots[1][0] - dots[3][0]);

                    answer = grade1 == grade2 ? 1 : 0;
                    chk.add(answer);
                    break;

                case 3 :
                    grade1 = (double)(dots[0][1] - dots[i][1]) / (dots[0][0] - dots[i][0]);
                    grade2 = (double)(dots[1][1] - dots[2][1]) / (dots[1][0] - dots[2][0]);

                    answer = grade1 == grade2 ? 1 : 0;
                    chk.add(answer);
                    break;
            }
        }

        int result = chk.contains(1) ? 1 : 0;

        System.out.println(result);

    }
}
