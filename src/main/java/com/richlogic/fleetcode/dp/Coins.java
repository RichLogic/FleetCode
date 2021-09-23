package com.richlogic.fleetcode.dp;

/**
 * <h3>fleetcode</h3>
 * <h4>com.richlogic.fleetcode.dp</h4>
 * <p></p>
 *
 * @author : richlogic
 * @since : 2021/09/13
 */
public class Coins {

    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int coin : coins) {
                if (i - coin >= 0 && dp[i - coin] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i - coin] + 1, dp[i]);
                }
            }
        }
        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }


}
