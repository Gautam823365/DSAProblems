package Arrays_problem;

public class SuffleArray {

    public static int[] shuffle(int[] nums, int n) {

        int[] ans = new int[2 * n];
        int idx = 0;

        for (int i = 0; i < n; i++) {
            ans[idx++] = nums[i];      // xi
            ans[idx++] = nums[i + n];  // yi
        }



        return ans;
    }
    public static void main(String[] args) {
        int []nums={2,5,1,3,4,7};
        int n=3;
        for(int res:shuffle(nums,n)){
            System.out.print(res+",");
        }
    }
}
