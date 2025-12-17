package GFG160;

public class MoveAllZeroAtEnd {

    static void pushZerosToEnd(int[] arr) {
        int n= arr.length;
        int index=0;
        for(int i=0;i<=n-1;i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index += 1;
            }
        }

            while(index<n){
                arr[index]=0;
                index+=1;


            }

    }
    public static void main(String[] args) {
        int [] nums={1, 2, 0, 4, 3, 0, 5, 0};
        pushZerosToEnd(nums);
        for(int i:nums){
            System.out.print(i+" ");
        }
    }
}
