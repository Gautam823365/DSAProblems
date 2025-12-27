package Arrays_problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDissappearNum {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res= new  ArrayList<>();

        /*
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;//
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                res.add(i + 1);
            }
        }
*/
        // Using  two pointer

        int n=nums.length;
        Arrays.sort(nums);
            int i=0;
            int  j=1;
            while(i<n && j<=n){
                if(nums[i]==j){
                i++;
                j++;
                } else if (nums[i]<j) {
                    i++;

                }else {
                    res.add(j);
                    j++;
                }
            }
            while (j<=n){
                res.add(j);
                j++;
            }


        return res;
    }
    public static void main(String[] args) {
        int[] arr={1};
        List<Integer> ans=findDisappearedNumbers(arr);
        for(int i :ans){
            System.out.print(i);
        }
    }
}
