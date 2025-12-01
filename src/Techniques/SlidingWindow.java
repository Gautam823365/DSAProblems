package Techniques;

public class SlidingWindow {
    public static int maxSum(int []arr, int n,int k){
        if(n<=k){
            System.out.println("Invalid");
            return -1;
        }
        int maxSum=0;
        for(int i=0;i<k;i++)
            maxSum+=arr[i];

        int maxWindowSum= maxSum;
        for(int i=k;i<n;i++){
            maxWindowSum=arr[i]-arr[i-k];
            maxSum=Math.max(maxSum,maxWindowSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {

        int []arr={6,2,1,-3,4,-5,6};
        int k=3;
        int n= arr.length;
        int result=maxSum(arr,n,k);
        System.out.println(result);
    }
}
