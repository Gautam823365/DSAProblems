package Algorithms;

public class BinarySearchAlgo {
    static int Search(int[] arr, int k){
        int n=arr.length;
        int low=0;
        int high=n-1;
        while (low<=high){
            int mid=low+(high-low)/2;

            if(arr[mid]==k){
                return mid;
            }

            if(arr[mid]>k){
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 10, 40 };
        int x = 20;
        int result = Search(arr, x);
        if (result == -1)
            System.out.println(
                    "Element is not present in array");
        else
            System.out.println("Element is present at "
                    + "index " + result);
    }

}
