package GFG160;

import java.util.Arrays;

public class SecondLargest {

    public static int getSecondLargest(int[] arr) {
        // code here
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=n-1;i>0;i--){
            if(arr[i]==arr[i-1]) {
                continue;
            }else if(arr[i]>arr[i-1]) {
                return arr[i-1];
            }

        }
       return -1 ;

    }
    public static void main(String[] args) {
        int []arr={10,10,10};
        int result=getSecondLargest(arr);
        System.out.println(result);
    }
}
