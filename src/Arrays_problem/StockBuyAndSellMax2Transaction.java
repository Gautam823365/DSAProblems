package Arrays_problem;

public class StockBuyAndSellMax2Transaction {
    static int maxProfit(int[] prices) {
        int n = prices.length;

        // Create profit array and initialize it as 0
        int[] profit = new int[n];

        int maxPrice = prices[n - 1];
        for (int i = n - 2; i >= 0; i--) {

            maxPrice = Math.max(maxPrice, prices[i]);
            profit[i] = Math.max(profit[i + 1], maxPrice - prices[i]);
        }

        int res = 0;
        int minPrice = prices[0];
        for (int i = 1; i < n; i++) {

            // minPrices is the minimum prices in prices[0..i]
            minPrice = Math.min(minPrice, prices[i]);
            res = Math.max(res, profit[i] + (prices[i] - minPrice));
        }

        return res;
    }
    public static void main(String[] args) {
        int arr[]={10, 22, 5, 75, 65, 80};
        int result=maxProfit(arr);
        System.out.println(result);
    }
}
