package programmers;

import java.util.*;

public class test81301 {
    public static void main(String[] args) {
        String s = "2three45sixseven";

        List<String> list = new ArrayList<>();
        list.add("zero");
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("six");
        list.add("seven");
        list.add("eight");
        list.add("nine");


        for(int i = 0; i < 10; i++) {
            String j = "";
            j += i;

            if (s.contains(list.get(i))) {
                s = s.replaceAll(list.get(i), j);
                System.out.println(list.get(i));
            }
        }

        int answer = Integer.parseInt(s);

        System.out.println(s);
        System.out.println(answer);

        System.out.println("-----");

        String z = "asdfgg";
        z = z.replaceAll("gg", "rr");
        System.out.println(z);

    }
}
