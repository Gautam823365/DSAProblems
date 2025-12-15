package String_problem;

import java.util.ArrayList;
import java.util.List;

public class FindAllSub {
    static List<String>al=new ArrayList<>();
    private static void findsub(String s,String ans){
        if(s.isEmpty()){
            al.add(ans);
            return;
        }

        findsub(s.substring(1),ans+s.charAt(0));
        findsub(s.substring(1),ans);
    }
    public static void main(String[] args) {
        String s = "abcd";
        findsub(s, ""); // Calling a function
        System.out.println(al);
    }
}
