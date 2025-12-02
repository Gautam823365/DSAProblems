package Arrays_problem;

import java.util.HashSet;
import java.util.Set;

public class ContainDuplicate_Two {
    public  static boolean containsNearbyDuplicate(int[] nums, int k) {
            // brute force
//            int n=nums.length;
//            for(int i =0;i<n;i++){
//                for(int j=i+1;j<n;j++){
//                    if(nums[i]==nums[j] && Math.abs(i-j)<=k){
//                        return true;
//
//                    }
//
//                }
//            }
//
//            return  false;



        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            if (set.contains(nums[i])) return true;

            set.add(nums[i]);

            // Keep window size <= k
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;

    }
    public static void main(String[] args) {

        int []nums={1,2,3,1};
        int k=3;
        boolean result=containsNearbyDuplicate(nums,k);
        System.out.println(result );
    }
}
