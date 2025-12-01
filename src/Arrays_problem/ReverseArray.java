package Arrays_problem;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[]args){
        int []arr={4,12,3,66,33,22};
        int n= arr.length;
        // Reversing array through opposite loop
       for(int i = n-1; i>=0; i--){
           System.out.println(arr[i]);
       }

       // find maximum and minimum in array

        Arrays.sort(arr);
        System.out.println("minimum number in this arrays:"+arr[0]);
        System.out.println("maximum number in this arrays:"+arr[n-1]);

        // Find Kth max and min element
        int k=3;
         for( int i =n-1;i>=0;i--){
             if(i==k){
                 System.out.println("max kth element :"+arr[i]);
             }

         }
         for(int i=0;i<n-1;i++){
             if(i==k){
                 System.out.println("min kth element :"+arr[i-1]);

             }

         }

    }
}
