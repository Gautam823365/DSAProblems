package Arrays_problem;


public class DutchNationalFlag {
    static void swap(int []arr,int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void sorting(int []arr,int n){
        for(int i=0;i < n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if (arr[j] > arr[j+1]) {
                    swap(arr,j,j+1);
                }
            }

        }
    }
    public static void main(String[] args) {
        int [] arr={0, 1, 2, 0, 1, 2};
        int n=arr.length;
        sorting(arr,n);

        for(int num:arr){
            System.out.println(num);
        }
    }

   
}
