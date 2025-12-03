package Arrays_problem;

import java.util.Arrays;
import java.util.Comparator;

public class MinimumNumOfArrow {

    public  static  int findMinArrowShots(int[][] points) {
        if (points.length == 0) return 0;

        // Sort balloons by their xend (end coordinate)
        Arrays.sort(points, Comparator.comparingInt(a -> a[1]));

        int arrows = 1;
        int arrowPos = points[0][1]; // Shoot first arrow at the first balloon's end

        for (int i = 1; i < points.length; i++) {
            // If next balloon starts after the current arrow position
            if (points[i][0] > arrowPos) {
                arrows++;
                arrowPos = points[i][1]; // Shoot new arrow
            }
        }

        return arrows;

    }
    public static void main(String[] args) {
        int[][] arr={{10,16},{2,8},{1,6},{7,12}};

        int result=findMinArrowShots(arr);
        System.out.println(result);
    }
}
