package Arrays_problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {

    // Learn merge sort

    static int[][] merge(int[][] intervals) {
        int n= intervals.length;
        if(intervals.length<=1) return intervals;
        List<int[]> ans = new ArrayList<>();


        Arrays.sort(intervals, Comparator.comparingInt(interval ->interval[0]));
        for (int []interval:intervals){
            if(ans.isEmpty() || ans.get(ans.size()-1)[1]<interval[0]){
                ans.add(interval);
            }else {
                ans.get(ans.size()-1)[1]=Math.max(ans.get(ans.size()-1)[1],interval[1]);
            }
        }




        return ans.toArray(int [][]::new);
    }
    public static void main(String[] args) {
        int[][] intervals = {
                {1, 3},
                {2, 6},
                {8, 10},
                {15, 18}
        };
        int [][] result= merge(intervals);
        for (int []interval:result){
            System.out.println(Arrays.toString(interval));
        }

    }
}
