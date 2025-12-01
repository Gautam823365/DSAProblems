package Arrays_problem;

public class SmallestSubWithSumGreaterThenX {

    public static int smallestSubWithSum(int x, int[] arr) {

        int n = arr.length;

        int curr_sum = 0;
        int i = 0;
        int j = 0;
        int min_len = n + 1;
        while (j < n) {
            while (curr_sum <= x && j < n)
                curr_sum += arr[j++];

            while (curr_sum > x && i < n) {
                if (j - i < min_len)
                    min_len = j - i;

                curr_sum -= arr[i++];


            }
        }
        return min_len;
    }
    public static void main(String[] args) {
        int []arr={1, 4, 45, 6, 0, 19};
        int target=51;

        int result=smallestSubWithSum(target,arr);
        System.out.println(result);
    }
}
