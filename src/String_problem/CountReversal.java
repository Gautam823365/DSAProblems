package String_problem;


public class CountReversal {

    public static int countMinReversals(String s) {
        int n = s.length();
        if (n % 2 != 0) return -1; // odd length can't be balanced

        int left = 0, right = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '{') {
                left++;
            } else {
                if (left > 0) {
                    left--; // match with a previous '{'
                } else {
                    right++; // unmatched '}'
                }
            }
        }

        // ceil(left/2) + ceil(right/2)
        return (left + 1) / 2 + (right + 1) / 2;
    }

    public static void main(String[] args) {

        String s="}{{}}{{{";
        int res=countMinReversals(s);
        System.out.println(res);
    }
}
