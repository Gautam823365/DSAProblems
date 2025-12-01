package Algorithms;

public class SelectionSort {
    static void swap(int []arr,int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int []arr={4,12,3,66,33,22};
        int n= arr.length;

        // selection sort

        for(int i=0;i<n-1;i++){
            int min_indx=i;   // let current element hold minimum element
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_indx]){   // if minimum element is greater then pass current indx into minimum indx
                    min_indx=j;
                }
            }
            swap(arr,i,min_indx);
        }
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
