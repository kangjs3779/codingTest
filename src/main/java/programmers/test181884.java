package programmers;

public class test181884 {
    public static void main(String[] args) {
        int[] numbers = {58, 44, 27, 10, 100};
        int n = 139;
        int result = 139;

        int answer = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (answer <= n) {
                answer += numbers[i];
            }
        }

        System.out.println(answer);
    }
}
