package programmers;

public class test181835 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 100, 99, 98};
        int k = 3;
//        int k = 2;

        if((k % 2) == 0) {
            for(int i = 0; i < arr.length; i++) {
                arr[i] *= k;
            }
        }
    }
}
