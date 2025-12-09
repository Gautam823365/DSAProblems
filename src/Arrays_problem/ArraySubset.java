package Arrays_problem;

import java.util.HashMap;

public class ArraySubset {

    public static boolean isSubset(int a[], int b[]) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int x : a) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        // Check all elements of b
        for(int x : b) {
            if(!freq.containsKey(x) || freq.get(x) == 0) {
                return false; // element missing
            }
            freq.put(x, freq.get(x) - 1); // decrease count
        }

        return true; // all elements found


    }
    public static void main(String[] args) {
        int[] num1 ={11, 7, 1, 13, 21, 3, 7, 3};
        int[] num2 ={11, 3, 7, 1, 7};

        boolean ans=isSubset(num1,num2);
        System.out.println(ans);

    }
}
