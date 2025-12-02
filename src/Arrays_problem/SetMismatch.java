package Arrays_problem;


public class SetMismatch {

    public  static int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int []ans =new int[n+1];

        for(int i:nums){
            ans[i]++;
        }
        int duplicate = -1, missing = -1;

        // Identify duplicate and missing
        for (int i = 1; i <=n; i++) {
            if (ans[i] == 2) duplicate = i;
            if (ans[i] == 0) missing = i;
        }
        return new int[]{duplicate,missing};
    }
    public static void main(String[] args) {
        int[] arr={1,2,2,4};
        int[]result=findErrorNums(arr);
        for(int i: result){
            System.out.println(i);
        }

    }
}
