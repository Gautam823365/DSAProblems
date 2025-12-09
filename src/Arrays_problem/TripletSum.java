package Arrays_problem;

public class TripletSum {

    public  static boolean hasTripletSum(int arr[], int target) {
        // code Here
        int n= arr.length;
        for(int i=0;i<n;i++){
            int left=i+1;
            int right=n-1;

            while (left<right){
                int sum=arr[left]+arr[i]+arr[right];
                if(sum==target){
                    return  true;
                }
                else if(sum<target){
                    left++;

                }else {
                    right--;
                }
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int []arr ={1, 4, 45, 6, 10, 8};
        int target=13;
        boolean ans=hasTripletSum(arr,target);
        System.out.println(ans);
    }
}
