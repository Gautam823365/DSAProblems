package String_problem;

import java.util.ArrayList;
import java.util.List;

public class LongestPalindromeString {

    static String longestPalindrome(String s) {
        List<String> ans= new ArrayList<>();
        char[] ch=s.toCharArray();
        int l=0;
        int r=ch.length-1;
        while(l<r){
          if(ch[l]==ch[r])  {
              ans.add(String.valueOf(ch[l]));
              l++;
              r--;
          }else {
              l++;
              r--;
              ans.clear();
          }
        }
        String result = String.join("", ans)+""+String.join("",ans.reversed());
        return result;
    }
    public static void main(String[] args) {
        String s=("aaaabbaa");

        String ans=longestPalindrome(s);
        System.out.println(ans);
    }
}
