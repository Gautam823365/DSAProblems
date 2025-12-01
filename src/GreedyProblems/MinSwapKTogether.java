package GreedyProblems;

import java.util.Arrays;

public class MinSwapKTogether {
    static  int minSwap(int[] arr, int k) {
        int count =0;
        int n= arr.length;
        int[] temp = arr.clone();   // copy original
        Arrays.sort(temp);
        if(Arrays.equals(arr,temp)){
            return 0;
        }
        for(int i =0;i<n;i++){
            if(arr[i]>k){
                count++;
            }

        }
        return count/2;
    }
    public static void main(String[] args) {
        int []arr={4 ,5 ,5 ,6 ,6 ,7 ,7 ,7 ,7 ,7 ,9 ,9};
        int k=7;
        int result=minSwap(arr,k);
        System.out.println(result);
    }
}

