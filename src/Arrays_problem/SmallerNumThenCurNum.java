package Arrays_problem;

public class SmallerNumThenCurNum {

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] freq = new int[101];

        // Count frequency
        for (int num : nums) {
            freq[num]++;
        }

        // Prefix sum: count of numbers smaller than i
        for (int i = 1; i < 101; i++) {
            freq[i] += freq[i - 1];
        }

        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                result[i] = 0;
            else
                result[i] = freq[nums[i] - 1];
        }

        return result;

    }
    public static void main(String[] args) {
        int []num={8,1,2,2,3};
        int[] res=smallerNumbersThanCurrent(num);
      for(int i :res){
          System.out.print(i+",");
      }
    }
}
