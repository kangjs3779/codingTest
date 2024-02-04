package programmers;

import java.util.*;

public class test42840 {
    public static void main(String[] args) {
        int[] answers = {1,2,3,4,5,1};

        // 수포자들의 정답 패턴을 배열로 저장해서 실제 정답과 비교한 뒤, 맵에 저장
        // 맵에 저장된 값을 treeSet에 저장을 해서, 값을 구해보려 했는데 실패함 : TreeSet = 중복된 값을 저장하지 않고 오름 차순으로 저장함
        // 문제는 실제 정답이 수포자 정답 패턴보다 길 때, 문제가 생김
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};

        Map<Integer, Integer> score = new HashMap<>();
        score.put(1, 0);
        score.put(2, 0);
        score.put(3, 0);

        for(int i = 0; i < answers.length; i++) {

            if(one[i] == answers[i]) {
                score.put(1, score.get(1) + 1);
            }

            if(two[i] == answers[i]) {
                score.put(2, score.get(2) + 1);
            }

            if(three[i] == answers[i]) {
                score.put(3, score.get(3) + 1);
            }
        }


        Set<Integer> set = new TreeSet<>();



        System.out.println(score);
    }
}
