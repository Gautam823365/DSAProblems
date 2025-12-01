package Arrays_problem;

public class CapToShipWithD {

    public static boolean canShip(int []weights,int days,int capacity){
    int dayCount=1;
    int curLoad=0;

 for(int w:weights){
     if (curLoad + w <= capacity) {
         curLoad += w;
     }else {
         dayCount++;      // use next day
         curLoad = w; // start new day's load
     }
     if(dayCount>days){
         return false;
     }
 }
return true;
    }
    public static int shipWithinDays(int[] weights, int days) {

        int low=0;
        int high=0;
        for (int w : weights) {
            low = Math.max(low, w);
            high += w;
        }

        while(low < high){
            int mid =low+(high-low)/2;
            if(canShip(weights,days,mid)){
                high=mid;
            }else {
                low=mid+1;
            }

        }

return low;
    }
    public static void main(String[] args) {

        int []arr={1,2,3,4,5,6,7,8,9,10};
        int days=5;
        int result=shipWithinDays(arr,days);
        System.out.println(result);
    }
}
