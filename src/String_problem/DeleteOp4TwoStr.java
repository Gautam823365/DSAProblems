package String_problem;

public class DeleteOp4TwoStr {

    public static int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();

        // DP table for LCS
        int[][] dp = new int[m+1][n+1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (word1.charAt(i-1) == word2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        int lcs = dp[m][n];
        return (m - lcs) + (n - lcs);
    }


    public static void main(String[] args) {
        String w1="leetcode";
        String w2="etco ";
        int res=minDistance(w1,w2);
        System.out.println(res);
    }
}
