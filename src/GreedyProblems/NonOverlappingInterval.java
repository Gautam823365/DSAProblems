package GreedyProblems;

import java.util.Arrays;
import java.util.Comparator;

public class NonOverlappingInterval {
    public static int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) return 0;

        // Step 1: Sort by end time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int count = 0;
        int prevEnd = intervals[0][1];

        // Step 2: Check overlap
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < prevEnd) {
                // overlap → remove current interval
                count++;
            } else {
                // no overlap → update end
                prevEnd = intervals[i][1];
            }
        }

        return count;

    }
    public static void main(String[] args) {
        int [][] nums={{1,100},{11,22},{1,11},{2,12}};
        int res= eraseOverlapIntervals(nums);
        System.out.println(res);
    }
}
