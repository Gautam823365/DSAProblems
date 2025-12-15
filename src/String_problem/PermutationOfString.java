package String_problem;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public  class PermutationOfString {
    public  static ArrayList<String> findPermutation(String s) {


     ArrayList<String> result = new ArrayList<>();



        char[] arr = s.toCharArray();
        backtrack(arr, 0, result);
        return result;
    }
    private static void swap(char []arr,int i,int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void backtrack(char[]a,int index,ArrayList<String> result){
        if (index == a.length) {
            result.add(new String(a));
            return;
        }
// for unique
        HashSet<Character> used =new HashSet<>();

        for (int i = index; i < a.length; i++) {
            if(used.contains(a[i])) continue;
            used.add(a[i]);
            swap(a, index, i);
            backtrack(a, index + 1, result);
            swap(a, index, i); // undo (backtrack)
        }

    }
    public static void main(String[] args) {
        String s=("KK");
        ArrayList<String>ans=findPermutation(s);
        for(String c:ans){
            System.out.print(c+" ");
        }
    }
}
