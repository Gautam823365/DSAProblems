package Arrays_problem;

public class BuyAndSellStocks {

    public static int maxProfit(int[] prices) {
        int maxprofit=0;

        int minsofar= prices[0];

        for(int i=0;i<prices.length;i++){

            minsofar= Math.min(minsofar,prices[i]);

            int profit= prices[i]-minsofar;

            maxprofit=Math.max(maxprofit,profit);

        }

        return maxprofit;

    }
    public static void main(String[] args) {
      int arr[]={7,1,5,3,6,4};
      int result=maxProfit(arr);
        System.out.println(result);
    }
}
