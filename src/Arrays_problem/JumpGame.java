package Arrays_problem;

public class JumpGame {
    public static boolean canJump(int[] nums) {

        int farthest = 0;
        // farthest index we can reach
        for (int i = 0; i < nums.length; i++) {
            if (i > farthest) {
                // If current index is not reachable
                return false;
            }
            farthest = Math.max(farthest, i + nums[i]);
        }
        return true;


    }
    public static void main(String[] args) {
        int [] nums= {2,3,1,1,4};
        System.out.println(canJump(nums));
    }
}
