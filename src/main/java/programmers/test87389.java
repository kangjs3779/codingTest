package programmers;

public class test87389 {
    public static void main(String[] args) {
        int n = 10;
        int k = 1;

        while((n % k) != 1) {
            k++;
        }
        System.out.println(k);

        String a = "-1234";
        int b = Integer.parseInt(a);
        System.out.println(b);
    }
}
