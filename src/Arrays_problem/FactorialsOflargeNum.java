package Arrays_problem;

import java.math.BigInteger;
import java.util.ArrayList;

public class FactorialsOflargeNum {

    public static ArrayList<Integer> factorial(int n) {
        // code here
        BigInteger fact = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }

        String s = fact.toString();
        ArrayList<Integer> ans = new ArrayList<>();

        for (char c : s.toCharArray()) {
            ans.add(c - '0');
        }

        return ans;
    }
    public static void main(String[] args) {
        int num=5;
        ArrayList<Integer>res=new ArrayList<>();
        res=factorial(num);
        for(int i :res){
            System.out.println(i);
        }

    }
}
