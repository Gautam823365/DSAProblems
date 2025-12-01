package GreedyProblems;

import java.util.Arrays;

public class MinimizeHeights {
    public static int getMinDiff(int[] arr, int k) {
        int n = arr.length;
        if (n == 1) return 0;
        Arrays.sort(arr);

        int minDiff=arr[n-1]-arr[0];

        for(int i=1;i<n;i++){
            if(arr[i]-k<0){
                continue;
            }
            int maxHeight=Math.max(arr[n-1]-k,arr[i-1]);
            int minHeight= Math.min(arr[0]+k,arr[i]-k);

            minDiff=Math.min(minDiff,maxHeight-minHeight);
        }
        return minDiff;
    }
    public static void main(String[] args) {

        int []arr={1,2,3,4,5};
        int k=1;
        int result=getMinDiff(arr,k);
        System.out.println(result);

    }
}
