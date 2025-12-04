package Arrays_problem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

public class MajorityElement_II {

    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        int k = n / 3;
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if (map.get(nums[i]) > k && !ans.contains(nums[i])) {
                ans.add(nums[i]);
            }
        }



        return ans;
    }
    public static void main(String[] args) {
        int[]nums={3,2,3};
        List<Integer>result;
        result=majorityElement(nums);
        for(int i:result){
            System.out.println(i);
        }
    }
}
