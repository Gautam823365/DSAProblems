package String_problem;

public class MultiplyString {
    public static String multiply(String num1, String num2) {

        if (num1.equals("0") || num2.equals("0")) return "0";
        int m = num1.length();
        int n = num2.length();
        int[] result = new int[m + n];
        for (int i = m - 1; i >= 0; i--) {
            int d1 = num1.charAt(i) - '0';
            for (int j = n - 1; j >= 0; j--) {
                int d2 = num2.charAt(j) - '0';
                int sum = d1 * d2 + result[i + j + 1];
                result[i + j + 1] = sum % 10;
                result[i + j] += sum / 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            if (!(sb.isEmpty() && num == 0)) {
                sb.append(num);
            }
        }
        return sb.toString();
    }

    //unable to store more long digit number
 /*   public static String multiply(String num1, String num2) {
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
    }*/
    public static void main(String[] args) {
        String num1="123456789";
        String num2="987654321";

        String res=multiply(num1,num2);
        System.out.println(res);
    }
}
