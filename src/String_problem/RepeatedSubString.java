package String_problem;

public class RepeatedSubString {

    public static  boolean repeatedSubstringPattern(String s) {

        String doubled=s+s;
        String sub=doubled.substring(1,doubled.length()-1);
        return sub.contains(s);


    }

    public static void main(String[] args) {

        String s="abab";
        System.out.println(repeatedSubstringPattern(s));

    }
}
