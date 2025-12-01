package Arrays_problem;

public class NegNumMovement {

    static int partition(int[] arr, int low, int high){
        int pivot=arr[high];
        int i =low-1;
        for( int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i;
    }

    public static void quicksort(int []arr, int low,int high){
        if(low<high) {
            int pivotidx = partition(arr, low, high);
            quicksort(arr, low, pivotidx - 1);
            quicksort(arr, pivotidx + 1, high);
        }
    }
    public static void main(String[] args) {
        int [] arr={-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int n=arr.length;
        quicksort(arr,0,n-1);

        for(int num:arr){
            System.out.println(num);
        }

    }
}
