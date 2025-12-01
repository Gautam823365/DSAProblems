package Techniques;

public class SubArray {
    public static void SubArrays(int []arr){
        int n= arr.length;;
        for(int  start=0;start<n;start++){
            for(int end =start;end<n;end++){
                System.out.print("[");
                // for printing subarray
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]);
                    if(k<end){
                        System.out.print(",");
                    }
                }
                System.out.println("]");

            }
        }
    }
    public static void main(String[] args) {
        int []arr ={1,2,3,4};
        SubArrays(arr);
//        for(int num:arr){
//            System.out.println(num);
//        }



    }
}
