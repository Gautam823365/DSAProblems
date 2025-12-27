package Arrays_problem;

public class RotateArray {
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void reverse(int []nums, int start ,int end ){
        while (start<end){
            swap(nums,start,end );
            start++;
            end--;
        }
    }
    public static void rotate(int[] nums, int k) {

        int n=nums.length;
        k=k%n;
        reverse(nums, 0, n - 1);// rotate from last
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
        /* rotate form start

        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
        reverse(nums, 0, n - 1);
         */
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7};
        int k=3;
      rotate(arr,k);
        for(int i:arr){
            System.out.print(i+",");
        }
    }
}
