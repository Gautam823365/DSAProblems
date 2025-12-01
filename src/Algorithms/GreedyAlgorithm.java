package Algorithms;

import java.util.Arrays;

public class GreedyAlgorithm {

    //find minimum number of coin to construct the given amount

    static int minCoins(int[] coins, int amount) {
        int n = coins.length;
        Arrays.sort(coins);
        int res = 0;

        for( int i =n-1;i>=0;i--){
            if(amount>=coins[i]){

                int count=(amount/coins[i]);
                res+=count;
                amount-=count*coins[i];
            }
        }
        if(amount== 0){
            return res;

        }
        return res;
    }

        public static void main(String[] args) {
            int[] coins = {5, 2, 10, 1};
            int amount = 39;

            System.out.println(minCoins(coins, amount));

    }
}
