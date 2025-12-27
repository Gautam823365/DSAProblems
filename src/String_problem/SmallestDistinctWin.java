package String_problem;

import java.util.HashSet;
import java.util.Set;

public class SmallestDistinctWin {

    public static int findSubString(String str) {

       Set<Integer> st=new HashSet<>();
       char[]c=str.toCharArray();
        for (char value : c) {
            st.add((int) value);
        }
       return st.size();
    }
    public static void main(String[] args) {
        String s="geeksgeeksfor";
       int res= findSubString(s);
        System.out.println(res);
    }
}
