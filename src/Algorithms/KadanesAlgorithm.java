package Algorithms;

public class KadanesAlgorithm {

    // time complexity for this code is O(n)^2

    /**
    public static int maximumSubArraySum(int []num){
        int container=num[0];
        int n= num.length;
        for(int i=0;i<n;i++){
            int curSum=0;
            for(int j=i;j<n;j++){
                curSum+=num[j];
                container=Math.max(curSum,container);
            }
        }
        return container;
    }**/


    public static int maximumSubArraySum(int []num){
        int container=num[0];
        int n= num.length;
        int maxEnding=num[0];
        for(int i=0;i<n;i++){
            maxEnding=Math.max(maxEnding+num[i],num[i]);
            container=Math.max(maxEnding,container);

        }
        return container;
    }

    public static void main(String[] args) {

        int []arr={2, 3, -8, 7, -1, 2, 3};
        int result=maximumSubArraySum(arr);
        System.out.println(result);


        int a =4;
        System.out.println(a%3);
    }
}