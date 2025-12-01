package Arrays_problem;

public class MaxProductOfSubArray {
    static int maxProduct(int[] arr) {

        int n= arr.length;
        int pre=1;
        int suf=1;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
           if(pre==0) pre=1;
           if(suf==0) suf=1;
           pre=pre*arr[i];
            suf=suf*arr[n-i-1];

            ans=Math.max(ans,Math.max(pre,suf));
        }
return ans;
    }
    public static void main(String[] args) {

    int [] nums={-2, 6, -3, -10, 0, 2};

int result=maxProduct(nums);
        System.out.println(result);
    }
}
