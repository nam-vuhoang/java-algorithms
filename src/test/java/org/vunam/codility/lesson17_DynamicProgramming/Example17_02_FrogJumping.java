package org.vunam.codility.lesson17_DynamicProgramming;

/**
 * Given a set of coin denominations, return a minimum number of coins needed to
 * change the given {@code value}.
 *
 * Note: this solution more correct than the solution described in the theory
 * lesson: https://codility.com/media/train/15-DynamicProgramming.pdf!!
 */
public class Example17_02_FrogJumping {

	public static final int INFINITE = Integer.MAX_VALUE;

	/**
	 * Get the number of jumping options to jump from {@code 0} to a given target
	 * {@code distance} using a given ordered set of distinct step distances.
	 *
	 * @param stepDistances The ordered set of distinct step distances.
	 * @param distance      The target distance.
	 * @return The number of possible jumping options, {@code 0} if no option found.
	 */
	public int getNumberOfJumpingOptions(int[] stepDistances, int distance) {
		int[] dp = new int[distance + 1];
		dp[0] = 1;
		for (int i = 1; i <= distance; i++) {
			for (int lastStep : stepDistances) {
				if (lastStep > i) {
					break;
				}
				dp[i] += dp[i - lastStep];
			}
		}
		return dp[distance];

	}

}
