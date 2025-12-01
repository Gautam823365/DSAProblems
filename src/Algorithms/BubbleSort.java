package Algorithms;

public class BubbleSort {
    static void swap(int []arr,int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int []arr={4,12,3,66,33,22};
        int n= arr.length;

        for(int i=0;i < n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if (arr[j] > arr[j+1]) {
                    swap(arr,j,j+1);
                }
            }

        }
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
