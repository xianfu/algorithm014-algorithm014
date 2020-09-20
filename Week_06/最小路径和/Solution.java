class Solution {
    public static int minPathSum(int[][] grid) {
        // f[i][j] = min(f[i-1][j], f[i][j-1]) + array[i][j];
        int[][] dp = Arrays.copyOf(grid, grid.length);
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i == 0 && j == 0) {
                  continue;
                } else if (i == 0) {
                    // 第一行
                    dp[i][j] = dp[i][j - 1] + dp[i][j];
                } else if (j == 0) {
                    // 第一列
                    dp[i][j] = dp[i - 1][j] + dp[i][j];
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + dp[i][j];
                }
            }
        }
        return dp[dp.length - 1][dp[0].length - 1];
    }
}