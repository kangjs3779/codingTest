package programmers;

public class test181910 {
    public static void main(String[] args) {
        String my_string = "ProgrammerS123";
        int n = 11;
        String result = "grammerS123";

        String[] arr = my_string.split("");
        String answer = "";
        for(int i = arr.length - n; i < arr.length; i++) {
            answer += arr[i];
        }
        System.out.println(answer);

        String other = my_string.substring(arr.length - n);
        System.out.println(other);
    }
}
