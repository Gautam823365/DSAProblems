package String_problem;

import java.util.*;

public class SecondMostRepeatedString {

   static String secFrequent(String arr[], int N) {
        // your code here


        HashMap<String,Integer> hashMap=new HashMap<>();
        for(String s:arr){
            hashMap.put(s,hashMap.getOrDefault(s,0)+1);
        }

       List<Map.Entry<String,Integer>> list = new ArrayList<>(hashMap.entrySet());
       list.sort((a,b) -> b.getValue().compareTo(a.getValue()));

       // Step 3: Get second most frequent
       if (list.size() < 2) {
           return " ";
       } else {
           Map.Entry<String,Integer> second = list.get(1);
          return second.getKey();
       }



    }
    public static void main(String[] args) {
        String[] s= new String[]{"aaa", "bbb", "ccc", "bbb", "aaa", "aaa"};
        int N=s.length;
       String ans= secFrequent(s,N);
        System.out.println(ans);
    }
}
