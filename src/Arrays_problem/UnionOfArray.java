package Arrays_problem;

import java.util.ArrayList;
import java.util.Arrays;

public class UnionOfArray {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
         ArrayList<Integer>result=new ArrayList<>();

        int[] c = Arrays.copyOf(a, a.length + b.length);
        System.arraycopy(b, 0, c, a.length, b.length);
        Arrays.sort(c);
        for(int i=0;i<c.length-1;i++){
            if(c[i]!=c[i+1]){
                result.add(c[i]);
            }
        }
        result.add(c[c.length-1]);
        return result;
    }
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 2, 1};
        int b[] = {3, 2, 2, 3, 3, 2};

        ArrayList<Integer>ans= findUnion(a,b);
        for (int num:ans){
            System.out.println(num);
        }
    }
}
