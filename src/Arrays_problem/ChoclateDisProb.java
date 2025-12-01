package Arrays_problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ChoclateDisProb {

    public static int findMinDiff(ArrayList<Integer> arr, int m) {


        int n=arr.size();
        Collections.sort(arr);
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i + m - 1 < n; i++) {
            int currentDiff = arr.get(i + m - 1) - arr.get(i);
            diff = Math.min(diff, currentDiff);
        }

        return diff;

    }
    public static void main(String[] args) {
       // int []arr={6,2,1,-3,4,-5,6};

         ArrayList<Integer>arr=new ArrayList<>(Arrays.asList(3, 4, 1, 9, 56, 7, 9, 12));

        int k=5;

        int result=findMinDiff(arr,k);

        System.out.println(result);
    }
}
