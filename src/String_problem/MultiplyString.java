package String_problem;

public class MultiplyString {

    public static String multiply(String num1, String num2) {
        String ans="";
        int startIndex=0;
        long number1=0;
        long number2=0;

        for (int i = startIndex; i < num1.length(); i++) {
            char ch = num1.charAt(i);
            // Convert char to digit
            int digit = ch - '0'; // Build the number
            number1 = number1 * 10 + digit;

        }

        for (int i = startIndex; i < num2.length(); i++) {
            char ch = num2.charAt(i);
            // Convert char to digit
            int digit = ch - '0'; // Build the number
            number2 = number2 * 10 + digit;

        }
            ans= String.valueOf(number1*number2);
     return ans;
    }
    public static void main(String[] args) {
        String num1="123456789";
        String num2="987654321";

        String res=multiply(num1,num2);
        System.out.println(res);
    }
}
