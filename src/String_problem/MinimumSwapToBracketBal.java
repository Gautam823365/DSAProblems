package String_problem;

import java.util.ArrayList;

public class MinimumSwapToBracketBal {

    static void swap(char[] arr, int i, int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int minimumNumberOfSwaps(String S) {
        // code here
        int n=S.length();
        ArrayList<Integer> v=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(S.charAt(i)=='[') v.add(i);
        }
char[]arr=S.toCharArray();
        int idx=0;
        int count=0;
        int ans=0;
        for(int i=0;i<n;i++){
            if(arr[i]=='['){
                count++;
                idx++;
            }else{
                count--;
                if(count<0){
                    ans+= v.get(idx)-i;
                    swap(arr,i, v.get(idx));
                    count=1;
                    idx++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
            String s="[]][][";
            int result=minimumNumberOfSwaps(s);
        System.out.println(result);
    }
}
