package Arrays_problem;

public class MinimumSubArraySum {

    public static int minSubArrayLen(int target, int[] nums) {

        int n=nums.length;
        int count=0;
        int sum=0;
         sum=nums[0];
        int curIndex=1;
        for(int i=1;i<n;i++){
            sum+=nums[i];
            if(sum==target){

            }
        }
        return count;
    }
    public static void main(String[] args) {

    }
}
