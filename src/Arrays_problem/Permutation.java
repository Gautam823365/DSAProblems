package Arrays_problem;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

    private static void swap(int []arr,int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void backtrack(int []nums,int i ,List<List<Integer>> result){
        if (i == nums.length) {
            List<Integer> perm = new ArrayList<>();
            for (int n : nums) {
                perm.add(n);
            }
            result.add(perm);
            return;
        }

        for(int j=i;j<nums.length;j++){
            swap(nums,i,j);
            backtrack(nums,i+1,result);
            swap(nums,i,j);
        }

    }
    public static List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result=new ArrayList<>();

        backtrack(nums,0,result);
        return result;



    }
    public static void main(String[] args) {
            int[] nums={1,2,3};
            List<List<Integer>> result=permute(nums);

            for(List<Integer> arr:result){
                System.out.println(arr);
            }
    }
}
