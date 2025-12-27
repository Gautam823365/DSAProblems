package Arrays_problem;

public class ConcatenationOfArray {

    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];

        System.arraycopy(nums, 0, ans, 0, nums.length);
        System.arraycopy(nums, 0, ans, nums.length, nums.length);
        return ans;
    }
    public static void main(String[] args) {
        int []nums={1,2,1};
        for(int res:getConcatenation(nums)){
            System.out.print(res+",");
        }
    }
}

