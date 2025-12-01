package Arrays_problem;

import java.util.HashMap;


// Also use as dynamic sum tracking...
public class SubarraySumEqK {
    public static int subarraySum(int[] nums, int k) {
        int count=0;
        int sum=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        for(int num:nums){
            sum+=num;

            //check if map contains prefix sum to k
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            // store prefix sum
            map.put(sum, map.getOrDefault(sum, 0) + 1);

        }
        return count;
    }
    public static void main(String[] args) {
        int []num={1,2,3};
        int k=3;
        int result=subarraySum(num,k);
        System.out.println(result);

    }
}
