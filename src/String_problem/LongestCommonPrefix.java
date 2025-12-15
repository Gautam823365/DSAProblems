package String_problem;

public class LongestCommonPrefix {

    public  static String longestCommonPrefix(String[] strs) {
        int min=Integer.MAX_VALUE;
        if(strs.length==0) return " ";
        String c=strs[0];

        for(int i=1;i< strs.length;i++){
            int j=0;int k=0;
            int count=0;
            while (j<c.length() && k<strs[i].length()){
                if(c.charAt(j)==strs[i].charAt(k))count++;
                else break;
                j++;
                k++;
            }
            min=Math.min(min,count);
            c=c.substring(0,min);
            if(c.isEmpty()) return " ";
        }

        return c;
    }
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        String result=longestCommonPrefix(strs);

        for(char st:result.toCharArray()){
            System.out.println(st);
        }


    }
}
