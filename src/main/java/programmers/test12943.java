package programmers;

public class test12943 {
    public static void main(String[] args) {
        long num = 626331;
//        1-1. 입력된 수가 짝수라면 2로 나눕니다.
//        1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
//        2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.

//        if((num % 2) == 0) {
//            num = num / 2;
//        }

        int answer = 0;

        while (answer <= 500) {
            if(num == 1 || answer == 500) {
                answer = answer == 500 ? -1 : answer;
                break;
            } else if((num % 2) == 0) {
                num = num / 2;
            } else {
                num = (num * 3) + 1;
            }

            answer++;
        }

        System.out.println(answer);

    }
}
