package org.namvu.codility.lesson17_DynamicProgramming;

import java.util.Arrays;

class Task17_02_MinAbsSum2 {

	/**
	 * Solution - 100% (correctness: 100%, performance: 100%)
	 *
	 * Detected time complexity: O(N * max(abs(A))**2)
	 *
	 * Solution was inspired by
	 * https://codility.com/media/train/solution-min-abs-sum.pdf
	 *
	 *
	 * @param A
	 * @return
	 *
	 * @see https://app.codility.com/demo/results/training2PMS9E-P3H/
	 */
	public int solution(int[] A) {
		int N = A.length;

		//
		// The main idea is to find all achievable sums by using existing elements.
		// Then for each sum = s1, we get s2 = maxSum - 2, and get abs(s1 - s2).
		//

		//
		// This task is equivalent to the task how to divide a certain amount coins to
		// two persons so that the difference between them is as little as possible.
		//

		// 1. replace A[i] with its absolute value
		// 2. find max value
		// 3. find max sum
		int maxValue = 0;
		int maxSum = 0;

		for (int i = 0; i < N; i++) {
			A[i] = Math.abs(A[i]);
			maxValue = Math.max(maxValue, A[i]);
			maxSum += A[i];
		}

		// count of value A[i]
		int[] count = new int[maxValue + 1];
		for (int val : A) {
			count[val]++;
		}

		// this array marks whether we can achieve this sum by using the last value in
		// the count array
		// dp[sum] = -1 if this sum is unachievable
		// dp[sum] >= 0 if this sum is achievable and there is dp[j] items of value
		// "val" remained.

		// note: we consider only sum from 0 to "maxSum / 2"
		int[] dp = new int[maxSum / 2 + 1];

		// At the beginning,
        // set dp[sum] = -1 if sum > 0
		// set dp[sum] = 0 if sum = 0
		Arrays.fill(dp, 1, dp.length, -1);

		// for each set of value "val", we check if we can achieve a specific "sum"
		for (int val = 0; val <= maxValue; val++) {
			if (count[val] > 0) {
				for (int sum = 0; sum < dp.length; sum++) {
					if (dp[sum] >= 0) {
						// we don't have to use value "val" to get "sum",
						// so the number of remained values "val" is count[val]
						dp[sum] = count[val];
					} else if (sum >= val && dp[sum - val] > 0) { // dp[sum] == -1
						// "dp[sum - val] > 0" means that "sum - val" is already achievable
						// "sum >= val" means that we can add "val" to the existing "sum - val" to get "sum", i.e.:
						// (sum - val) + val = sum

						// Therefore, we use value "val" once
						dp[sum] = dp[sum - val] - 1;
					}
				}
			}
		}

		// find the available "sum" which is most closest to "maxSum/2"
		for (int sum = dp.length - 1; sum >= 0; sum--) {
			if (dp[sum] >= 0) {
				// Math.abs(right - left) == Math.abs((maxSum - sum) - (sum)) == maxSum - 2 *
				// sum
				return maxSum - 2 * sum;
			}
		}

		return maxSum;
	}

}