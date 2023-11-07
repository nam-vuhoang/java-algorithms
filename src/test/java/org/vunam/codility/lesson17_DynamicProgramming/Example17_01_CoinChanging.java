package org.vunam.codility.lesson17_DynamicProgramming;

import java.util.Arrays;

/**
 * Given a set of coin denominations, return a minimum number of coins needed to
 * change the given {@code value}.
 *
 * @see https://codility.com/media/train/15-DynamicProgramming.pdf
 */
public class Example17_01_CoinChanging {

	public static final int INFINITE = Integer.MAX_VALUE;

	public int getMinCoinNumber(int[] coinDenominations, int value) {
		Arrays.sort(coinDenominations);

		int[] dp = new int[value + 1];

		// At the start, dp[0] = 0 because we don't need any coin to exchange zero.
		// At the same time we need INFINITE number of coins to exchange any non-zero
		// value.
		for (int j = 1; j <= value; j++) {
			dp[j] = INFINITE;
		}

		// For each next coin denomination
		for (int coinDenomination : coinDenominations) {
			for (int j = coinDenomination; j <= value; j++) {
				if (dp[j - coinDenomination] != INFINITE) {
					// We can use the new coin denomination to reduce amount of coins.
					dp[j] = Math.min(dp[j - coinDenomination] + 1, dp[j]);
				}
			}
		}

		return dp[value];
	}

}
