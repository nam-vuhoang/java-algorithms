package org.namvu.codility.lesson05_PrefixSums;

/**
 * [MEDIUM] CountDiv
 *
 * Compute number of integers divisible by k in range [a..b].
 *
 * Write a function:
 *
 * class Solution { public int solution(int A, int B, int K); }
 *
 * that, given three integers A, B and K, returns the number of integers within
 * the range [A..B] that are divisible by K, i.e.:
 *
 * { i : A ≤ i ≤ B, i mod K = 0 }
 *
 * For example, for A = 6, B = 11 and K = 2, your function should return 3,
 * because there are three numbers divisible by 2 within the range [6..11],
 * namely 6, 8 and 10.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * A and B are integers within the range [0..2,000,000,000]; K is an integer
 * within the range [1..2,000,000,000]; A ≤ B.
 *
 */

class Lesson05_02_CountDiv {
	/**
	 * Detected time complexity: O(1)
	 *
	 * @param A
	 * @param B
	 * @param K
	 * @return
	 * @see https://app.codility.com/demo/results/training6EM2TX-9T9/
	 */
	public int solution(int A, int B, int K) {
		// A <= min <= max <= B
		// min % K == 0
		// max % K == 0

		// Note: A + K - 1 may be greater than Integer.MAX_VALUE!
		int min = (int) (((long) A + K - 1) / K * K);
		int max = B / K * K;
		return max >= min ? (max - min) / K + 1 : 0;
	}
}