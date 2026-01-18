package String_problem;

public class ReverseVowelString {
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';

    }

    public static String reverseVowels(String s) {
        int start = 0;
        char[] arr = s.toCharArray();
        int end = s.length() - 1;
        while (start < end) {
            while (start < end && !isVowel(arr[start])) start++;
            while (start < end && !isVowel(arr[end])) end--;
            if (start < end) {
                char temp = arr[start];
                arr[start++] = arr[end];
                arr[end--] = temp;
            }
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String s="IceCreAm";
        String res=reverseVowels(s);
        System.out.println(res);

    }
}