package String_problem;

import java.util.Stack;

public class RemoveAllAdjacentDup {

    public static String removeDuplicates(String s) {
        Stack<Character> stack=new Stack<>();


        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop(); // remove duplicate
            } else {
                stack.push(c);
            }
        }

        // build result from stack
        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }
        return sb.toString();

    }
    public static void main(String[] args) {
        String s="abbaca";
        String res=removeDuplicates(s);
        System.out.println(res);
    }
}
