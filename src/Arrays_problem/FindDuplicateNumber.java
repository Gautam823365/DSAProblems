package Arrays_problem;

import java.util.Arrays;
import java.util.HashMap;

public class FindDuplicateNumber {
    public  static int findDuplicate(int[] nums) {

        Arrays.sort(nums);

        for(int i=1;i<nums.length;i++) {

            if(nums[i]==nums[i-1]){

                return nums[i];

            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int []nums={1,3,4,2,2};
        int result=findDuplicate(nums);
        System.out.println(result);
    }
}
