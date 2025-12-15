package String_problem;

public class FindOccOf1stEle {

    public  static int strStr(String haystack, String needle) {
        int hayLength=haystack.length();
        int needleLength=needle.length();
        if(hayLength<needleLength)return -1;
        for(int i=0;i<=haystack.length()-needle.length();i++){
            int j=0;
            while(j<needle.length() && haystack.charAt(i+j)==needle.charAt(j))
                j++;
            if(j==needle.length()){
                    return i;
                }

        }
        return -1;
    }
    public static void main(String[] args) {

        String str="gfgkhgfg";
        String needle="kh";

        int FirstIndex=strStr(str,needle);
        System.out.println(FirstIndex);
    }

}
