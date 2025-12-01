package Arrays_problem;

import java.util.HashSet;

public class SubArraywithSum0 {



    static boolean findsum(int []arr) {
       int preSum=0;
        int n= arr.length;


        // time limit exceeded  O(n)^2
//        for(int out=0;out<n;out++) {
//            for (int i = out; i < n; i++) {
//                preSum += arr[i];
//                if (preSum == 0) {
//                    return true;
//
//                }
//            }
//            preSum=0;
//
//        }


        // this works as O(n) time complexity
        HashSet<Integer> result=new HashSet<>();
        int sum=0;

        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(arr[i]==0 || sum==0||result.contains(sum)){
                return true;
            }
            result.add(sum);
        }
    return false;
    }
    public static void main(String[] args) {
        int []num={1, 2, -1};
       boolean ans= findsum(num);
        System.out.println(ans);
    }
}
