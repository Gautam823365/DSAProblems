package Arrays_problem;

import java.util.HashMap;

public class MissingNumber {
    public static int missingNumber(int[] nums) {

        int n = nums.length;
        //int count=0;
        int sum=n*(n+1)/2;
           int actualSum=0;
      //  HashMap<Integer, Integer> ans = new HashMap<>();

        for (int i = 0; i < n; i++) {
           actualSum+=nums[i];
        }

      return  sum-actualSum;
    }
        public static void main(String[] args) {

        int[] arr={3,0,1};
        int result=missingNumber(arr);
            System.out.println(result);

    }
}
