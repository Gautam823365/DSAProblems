package String_problem;

import java.util.Arrays;

public class ValidShuffle {
        static boolean checkLength(String s1,String s2,String result) {
            if (s1.length() + s2.length() != result.length()) {
                return false;

            } else {
                return true;
            }
        }

        static String sortString(String str){
            char[] c=str.toCharArray();
            Arrays.sort(c);
            str=String.valueOf(c);
            return str;

            }

        static boolean shuffleCheck(String s1,String s2,String result) {
            s1=sortString(s1);
            s2=sortString(s2);
            result=sortString(result);


            int i = 0, j = 0, k = 0;

            // iterate through all characters of result
            while (k != result.length()) {

                // check if first character of result matches
                // with first character of first string
                if (i < s1.length() && s1.charAt(i) == result.charAt(k))
                    i++;

                    // check if first character of result matches
                    // with the first character of second string
                else if (j < s2.length() && s2.charAt(j) == result.charAt(k))
                    j++;

                    // if the character doesn't match
                else {
                    return false;
                }
                k++;
            }
            if(i<s1.length()||j<s2.length()) {
                return false;
            }
            return true;

        }

    public static void main(String[] args) {
        String first = "XY";
        String second = "12";
        String[] results = {"1XY2", "Y1X2", "Y21XX"};

        // call the method to check if result string is
        // shuffle of the string first and second
        for (String result : results) {
            if (checkLength(first, second, result) && shuffleCheck(first, second, result)) {
                System.out.println(result + " is a valid shuffle of " + first + " and " + second);
            }
            else {
                System.out.println(result + " is not a valid shuffle of " + first + " and " + second);
            }
        }

    }
}
