package String_problem;

public class CheckStringPalindrome {
    static boolean isPalindrome(String s) {
        // code here


        char []c=s.toCharArray();
        int l=0;
        int h=c.length-1;
        while (h>l){
            if(c[l++]!=c[h--]){
                return false;

            }
        }
    return  true;
    }
    public static void main(String[] args) {
        String s= "asdjhja";
        boolean ans=isPalindrome(s);
        System.out.println(ans);
    }
}
