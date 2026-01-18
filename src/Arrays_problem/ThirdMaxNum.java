package Arrays_problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThirdMaxNum {
    public static int thirdMax(int[] nums) {
//        Integer max1 = null;
//        Integer max2 = null;
//        Integer max3 = null;
//        for (Integer n : nums) {
//            if (n.equals(max1) || n.equals(max2) || n.equals(max3)) continue;
//            if (max1 == null || n > max1) {
//                max3 = max2;
//                max2 = max1;
//                max1 = n;
//            } else if (max2 == null || n > max2) {
//                max3 = max2;
//                max2 = n;
//            } else if (max3 == null || n > max3) {
//                max3 = n;
//            }
//        }
//        return max3 == null ? max1 : max3;




        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();

        list.add(nums[0]);
        for(int i = 1; i < nums.length; i++){
            if(nums[i-1] != nums[i]){
                list.add(nums[i]);
            }
        }
        int listSize = list.size();
        if(listSize < 3){
            return list.get(listSize - 1);
        }

        return list.get(listSize - 3);

    }
    public static void main(String[] args) {
            int [] nums={4,2,1};
            int  res =thirdMax(nums);
        System.out.println(res);
    }
}
