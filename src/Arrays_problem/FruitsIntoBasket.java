package Arrays_problem;

import java.util.HashMap;
import java.util.Hashtable;

public class FruitsIntoBasket {


    public static int totalFruit(int[] fruits) {

        int n=fruits.length;
       int left=0;
       int maxLen=0;
        HashMap<Integer,Integer>ans= new HashMap<>();
        //ans.put(count,0);
        for (int right = 0; right < n; right++) {

            // add current fruit to map
            ans.put(fruits[right], ans.getOrDefault(fruits[right], 0) + 1);

            while (ans.size() > 2) {
                ans.put(fruits[left], ans.get(fruits[left])- 1);

                if (ans.get(fruits[left]) == 0) {
                    ans.remove(fruits[left]);
                }
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
        public static void main(String[] args) {
        int []fruits={0,1,2,2};
        int result=totalFruit(fruits);
            System.out.println(result);
    }
}
