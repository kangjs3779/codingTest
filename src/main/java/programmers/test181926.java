package programmers;

public class test181926 {
    public static void main(String[] args) {
        String control = "wsdawsdassw";
        int n = 0;

//        "w" : n이 1 커집니다.
//        "s" : n이 1 작아집니다.
//        "d" : n이 10 커집니다.
//        "a" : n이 10 작아집니다.

        String[] arr = control.split("");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals("w")) {
                n += 1;
            } else if(arr[i].equals("s")) {
                n -= 1;
            } else if(arr[i].equals("d")) {
                n += 10;
            } else if(arr[i].equals("a")) {
                n -= 10;
            }
        }

        System.out.println(n);
    }
}
