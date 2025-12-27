package String_problem;

public class MinNumFlips {

    public static  int minFlips(String s) {
        // Code here

        int m1=0;int m2=0;
        for(int i=0;i<s.length();i++){
            if((i&1)==1 && s.charAt(i)=='0') m1++;
            if(i%2==0 && s.charAt(i)=='1') m1++;
            if((i&1)==1 && s.charAt(i)=='1')m2++;
            if(i%2==0 && s.charAt(i)=='0') m2++;
        }
        return Math.min(m1,m2);
    }
    public static void main(String[] args) {
        String s="001";
        int res=minFlips(s);
        System.out.println(res);
    }
}
