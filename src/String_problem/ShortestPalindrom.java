package String_problem;


public class ShortestPalindrom {

    static void buildLps(String s,int []lps) {
        int len = 0;
        for (int i = 1; i < s.length(); ) {
            if (s.charAt(i) == s.charAt(len)) {
                lps[i++] = ++len;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i++] = 0;
                }
            }


        }
    }

    public static String shortestPalindrome(String s) {

        if(s.isEmpty()) return  s;
        String rev=new StringBuilder(s).reverse().toString();
        String temp=s + "#" +rev;
      int [] lps=new int [temp.length()];
            buildLps(temp,lps);

            //
        int palPrefixLen = lps[temp.length() - 1];

        String add = rev.substring(0, s.length() - palPrefixLen);
        return add + s;

    }
    public static void main(String[] args) {
        String txt = "aacecaaa";

        String res = shortestPalindrome(txt);
        System.out.println(res);
    }
}
