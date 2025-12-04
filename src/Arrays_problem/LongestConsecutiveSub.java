package Arrays_problem;

import java.util.Arrays;

public class LongestConsecutiveSub {

    public static int longestConsecutive(int[] arr) {
            int n=arr.length;
        if(n==0) return 0 ;
        Arrays.sort(arr);
        int longest=1;
        int curStreak=1;
            for(int i =1;i<n;i++){
                if(arr[i]==arr[i-1]){
                    continue;
                }else if(arr[i]==arr[i-1]+1){
                    curStreak++;
                }else{
                    longest=Math.max(longest,curStreak);
                    curStreak=1;
                }
            }
        longest=Math.max(longest,curStreak);
        return longest;
    }
    public static void main(String[] args) {

        int []nums={1,2,3,4,5,6,7};

        int result=longestConsecutive(nums);
        System.out.println(result);
    }
}
