package String_problem;

public class ReverseString {

    public  static void reverseString(char[] s) {
        int left=0;

        int right=s.length-1;

        while(left<right){

            char tpm=s[left];

            s[left++]=s[right];

            s[right--]=tpm;

        }

    }
    public static void main(String[] args) {


      char[] s= {'g', 'a', 'u', 't', 'a', 'm'};
      reverseString(s);
      for(char i:s){
          System.out.print(i+" ");
      }

    }
}
