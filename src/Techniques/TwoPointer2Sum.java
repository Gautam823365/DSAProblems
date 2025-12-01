package Techniques;

public class TwoPointer2Sum {
    public  static boolean TwoSum(int []arr,int target){
        int i;
        int j;
       for(i=0;i<arr.length;i++){
           for(j=i+1;j<arr.length;j++){
               if (arr[i] + arr[j]==target) {
                   return true;
               }
           }

       }
       return false;
    }
    public static void main(String[] args) {
        int []arr ={29,33,54,10,20,46};
        int target=100;
        boolean result=TwoSum(arr,target);
        System.out.println(result);
    }
}
