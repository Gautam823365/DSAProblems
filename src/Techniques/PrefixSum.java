package Techniques;

import java.util.ArrayList;

public class PrefixSum {
    public static ArrayList<Integer> preSumArray(int[]arr){
        int n=arr.length;
        int preSum=0;

        ArrayList<Integer>result=new ArrayList<>();

        for(int i =0;i<n;i++){
            preSum+=arr[i];
            result.add(preSum);
        }
        return result;
    }
    public static void main(String[] args) {
        int []num={10,20,10,5,15};
       ArrayList<Integer> arr = preSumArray(num);

       for(int list:arr){
           System.out.print(list+",");
       }
    }
}
