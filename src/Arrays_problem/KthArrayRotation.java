package Arrays_problem;

public class KthArrayRotation {

    public static void RotationByK(int []arr,int k){
        if(k==0||arr.length==0) return;
        int n=arr.length;
        int temp=arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;

        // recursive call for k - 1
        RotationByK(arr, k - 1);

    }
    public static void main(String[] args) {
        int []arr ={3,2,4,1,5};
        int k=2;

        RotationByK(arr, k);
        for(int num:arr){
            System.out.println(num);
        }
    }
}
